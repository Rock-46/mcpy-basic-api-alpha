package me.rockfs.getblockdatanbt.tools;

import org.bukkit.ChatColor;

public class ColorText {
    /**字符转换
     * 彩色文本简易显示
     *将'&'字符转换成'§'
     * 返回值：自定义的彩色字符串
     * 注意：低版本才需要，高版本直接使用'&'符号即可
     * */
    public static String t(String text){
        // 将'&'字符转换成'§'
        return ChatColor.translateAlternateColorCodes('&',text);
    }
}
