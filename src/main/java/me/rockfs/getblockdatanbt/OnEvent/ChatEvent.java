package me.rockfs.getblockdatanbt.OnEvent;

import me.rockfs.getblockdatanbt.EventCacheQueue.EventCacheDeque;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvent implements Listener {
    /**监听器
     * 监听玩家聊天事件
     * 需要在"onEnable()"方法内注册该监听器
     * 注册方法: getServer().getPluginManager().registerEvents();
     * 返回值：聊天消息
     * */
    @EventHandler
    public void onPlayerChatEvent(AsyncPlayerChatEvent event){
        EventCacheDeque.asyncPlayerChatEvent_ArrayDeque.add(event);
    }
}
