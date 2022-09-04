package me.rockfs.getblockdatanbt.MultiThread;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class setNBT implements Runnable {
    Plugin thisPlugin; //插件接口
    Player usePlayer; //玩家接口

    /** 获取nbt数据测试线程的构造器
     * 传入参数: [插件类] [玩家对象]
     * */
    public setNBT(Plugin plugin, Player player){
        this.thisPlugin = plugin;
        this.usePlayer = player;

    }

    /** 线程方法
     * */
    public void run(){
        int
                x = (int)usePlayer.getLocation().getX(),
                y = (int)usePlayer.getLocation().getY(),
                z = (int)usePlayer.getLocation().getZ();
        int id =0;
        int temp_x = x, temp_y = y, temp_z = z; //临时变量
        int cache_x = x,cache_y = y,cache_z = z,cache_id = id; //变量缓存
        final int EXCEPTION_COUNTER_MAX = 5; //异常处理最大次数
        int counter = 0; //计数器



        World world = usePlayer.getWorld();
        Block thisBlock = null; //获取方块
        String blockData_str; //缓存方块数据
        String[] blockData;//方块数据

        StringBuilder stringBuilder = new StringBuilder(); //方块数据 nbt缓存

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

        try {

            for(Material material : Material.values()){

                usePlayer.teleport(new Location(world, x, y+3, z));

                usePlayer.setFlying(true);

                for(byte a=0 ; a<16 ; a++) {
                    try {

                        thisBlock = new Location(world, x, y-1, z).getBlock();

                        if ( !(thisBlock.getChunk().isLoaded())){
                            thisBlock.getChunk().load();
                        }

                        thisBlock.setType(Material.GRASS);

                        thisBlock = new Location(world, x, y, z+1).getBlock();

                        thisBlock.setType(Material.AIR);
                        Thread.sleep(25);

                        thisBlock = new Location(world, x, y, z).getBlock();

                        thisBlock.setType(material);

                        thisBlock.setData(a);
                        Thread.sleep(25);

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
        } catch (Exception ignored) {
        }
    }
}
