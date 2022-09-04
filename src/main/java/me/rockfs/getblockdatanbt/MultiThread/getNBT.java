package me.rockfs.getblockdatanbt.MultiThread;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.FileWriter;

public class getNBT implements Runnable {

    Plugin thisPlugin;
    Player usePlayer;

    /** 获取nbt数据测试线程的构造器
     * 传入参数: [插件类] [玩家对象]
     * */
    public getNBT(Plugin plugin, Player player){
        this.thisPlugin = plugin;
        this.usePlayer = player;
    }

    public void run(){
        int
                x = (int)usePlayer.getLocation().getX(),
                y = (int)usePlayer.getLocation().getY(),
                z = (int)usePlayer.getLocation().getZ();
        int id =0;
        int temp_x = x, temp_y = y, temp_z = z; //临时变量

        World world = usePlayer.getWorld();
        Block thisBlock = null; //获取方块

        //BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out)); //文件写入缓冲

        //SimpleCommandMap commandMap = new SimpleCommandMap(thisPlugin.getServer());

        //Command.broadcastCommandMessage(usePlayer,"tp " + temp_x + " " + temp_y + " " + temp_z , true); //spigot使用

        /*
        for( id=0 ; id < 500 ; id++) {

                //修改前保存，避免进入死循环


                blockData_str = BlockData.getBlockData(id); //获取方块数据
                blockData = blockData_str.split(" ");

                if(blockData.length == 1){
                   stringBuilder.append(blockData[0]).append("0");
                }

                if (blockData_str.charAt(0) == '!'){
                   usePlayer.sendMessage("方块不存在");
                   continue;
                }



                //设置方块命令
                //commandMap.dispatch(usePlayer,"/setblock " + x + " " + y + " " + z + " minecraft:" + blockData_str);
                //Bukkit.dispatchCommand(usePlayer, "setblock " + x + " " + y + " " + z + " minecraft:" + blockData_str); // paper端
                //Command.broadcastCommandMessage(usePlayer, "/setblock " + x + " " + y + " " + z + " minecraft:" + blockData_str ); //spigot端
                thisBlock = new Location(world, x, y, z).getBlock();

                thisBlock.setType(Material.AIR);

                while(!(thisBlock.setTypeId(id))){
                    if(counter >= EXCEPTION_COUNTER_MAX){
                        counter = 0;
                        break;
                    }
                    counter++;
                };

                usePlayer.sendMessage(thisBlock.toString());
                //thisPlugin.getLogger().info("Block:[" + thisBlock.toString() + "],Type:[" + thisBlock.getType() + "],State:[" + thisBlock.getType() + "],Data:[" + thisBlock.getData() + "]");

                //stringBuilder.append(thisBlock.toString());
                //Thread.yield(); //切换线程
                stringBuilder.append(thisBlock).append("\r\n");

                //thisPlugin.getLogger().info("计数器:" + id);

                if (x >= temp_x + 24) {
                    x = temp_x;
                    z++;
                }else {
                    x++;
                }

        }
        */

        thisPlugin.getLogger().info("保存数据中");

        File NBT_SaveFile = new File("C:/Users/Rock_46/Desktop/ROS红石开源项目组/bukkit开发资料/bukkit server/paper-1.12.2-1620/plugins/NBT_SaveFile.txt"); //保存文件路径
        FileWriter fileWriter = null;   //文件写入接口

        thisPlugin.getLogger().info("文件写入中");
        try {

            fileWriter = new FileWriter(NBT_SaveFile); //文件写入接口
            for(Material material : Material.values()){

                for(byte a=0 ; a<16 ; a++) {
                    try {

                        usePlayer.teleport(new Location(world, x, y+3, z));

                        thisBlock = new Location(world, x, y, z).getBlock();

                        if ( !(thisBlock.getChunk().isLoaded())){
                            thisBlock.getChunk().load();
                        }

                        fileWriter.write(thisBlock.toString() + "\r\n"); //写入文件
                        Thread.sleep(100);

                    }catch (Exception ignored){
                    }

                    if( x >= (temp_x + 64) ){
                        x = temp_x;
                        z += 2;
                    }else {
                        x++;
                    }

                }

            }
            fileWriter.close(); //关闭接口
            thisPlugin.getLogger().info("文件写入成功");
        } catch (Exception e) {
            thisPlugin.getLogger().info("捕捉到错误");
        }
    }

}
