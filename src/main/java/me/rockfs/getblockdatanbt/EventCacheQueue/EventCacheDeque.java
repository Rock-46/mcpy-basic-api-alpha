package me.rockfs.getblockdatanbt.EventCacheQueue;

import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.ArrayDeque;

/** 事件缓存专用类，用于存储获取到的事件
 * 从监听器中添加，在该插件中的任意模块均可调用
 * */
public class EventCacheDeque {
    public static ArrayDeque<AsyncPlayerChatEvent> asyncPlayerChatEvent_ArrayDeque = new ArrayDeque<AsyncPlayerChatEvent>();//玩家聊天事件 静态缓存队列
}