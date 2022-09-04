package me.rockfs.getblockdatanbt;

import me.rockfs.getblockdatanbt.EventCacheQueue.EventCacheDeque;
import me.rockfs.getblockdatanbt.MultiThread.getNBT;
import me.rockfs.getblockdatanbt.MultiThread.setNBT;
import me.rockfs.getblockdatanbt.OnEvent.ChatEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Iterator;
import java.util.logging.Logger;

public final class mcpy_basic_api extends JavaPlugin {
    public mcpy_basic_api plugin = this;
    public Logger logger = this.getLogger(); //获取信息发送接口
    public boolean isRunning = false;   //运行状态指示器
    Thread thread;  //线程接口

    @Override
    public void onEnable() {
        // Plugin startup logic
        logger.info("遍历并获取方块数据 - 插件开启");

        //注册监听事件 - head
        getServer().getPluginManager().registerEvents(new ChatEvent(),this); //注册玩家聊天事件
        //注册监听事件 - end

        //新建线程
        logger.info("线程建立");
        isRunning = true;
        logger.info("启动线程");
        thread =  new Thread(new TickHandler());
        thread.start();



    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        //关闭插件
        getServer().getScheduler().cancelTasks(this);
        isRunning = false;  //关闭线程
        try {
             //等待线程关闭
            thread.stop();
            Thread.yield();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        logger.info("遍历并获取方块数据 - 插件关闭");
    }

    public class TickHandler implements Runnable{
        //Player usePlayer;

        public void run(){
            logger.info("线程已启动");

            while(isRunning) {
                //usePlayer = event.getPlayer();
                //logger.info("检测到聊天事件:" + event.getMessage());
                //usePlayer.sendMessage(event.getMessage());

                //使用Iterator迭代器
                Iterator<AsyncPlayerChatEvent> iterator = EventCacheDeque.asyncPlayerChatEvent_ArrayDeque.iterator();

                while (iterator.hasNext()) {
                    AsyncPlayerChatEvent event = iterator.next();

                    if (event.getMessage().equals(".setNBT")) {
                        Thread test_thread = new Thread(new setNBT(plugin, event.getPlayer())); //执行设置 nbt的线程
                        test_thread.start();
                        logger.info("玩家 [" + event.getPlayer().getName() + "] 执行了[.setNBT]"); //弹出执行状态指示消息
                        iterator.remove();   //删除事件
                    }

                    if (event.getMessage().equals(".getNBT")) {
                        Thread test_thread = new Thread(new getNBT(plugin, event.getPlayer())); //执行获取nbt的线程
                        test_thread.start();
                        logger.info("玩家 [" + event.getPlayer().getName() + "] 执行了[.getNBT]"); //弹出执行状态指示消息
                        iterator.remove();   //删除事件
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            logger.info("线程已关闭");
        }
    }

}
