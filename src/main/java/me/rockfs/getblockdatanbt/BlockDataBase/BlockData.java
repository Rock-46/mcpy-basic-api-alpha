package me.rockfs.getblockdatanbt.BlockDataBase;

public class BlockData {
    public static String getBlockData(int id){
        switch (id){
            case  0 : return "air"; // 空气
            case  1 : return "stone 0"; // 石头
            case  2 : return "stone 1"; // 花岗岩
            case  3 : return "stone 2"; // (磨制/平滑)花岗岩
            case  4 : return "stone 3"; // 闪长岩
            case  5 : return "stone 4"; // (磨制/平滑)闪长岩
            case  6 : return "stone 5"; // 安山岩
            case  7 : return "stone 6"; // (磨制/平滑)安山岩
            case  8 : return "grass"; // 草方块
            case  9 : return "grass_path"; // 草径
            case  10 : return "dirt 0"; // 泥土/泥土块
            case  11 : return "dirt 1"; // 砂土
            case  12 : return "dirt 2"; // 灰化土/灰壤
            case  13 : return "farmland"; // 耕地
            case  14 : return "cobblestone"; // 圆石
            case  15 : return "planks 0"; // 橡木木板
            case  16 : return "planks 1"; // 云杉木板
            case  17 : return "planks 2"; // 白桦木板
            case  18 : return "planks 3"; // 丛林木板
            case  19 : return "planks 4"; // 金合欢木板
            case  20 : return "planks 5"; // 深色橡木木板
            case  21 : return "sapling 0"; // 橡树树苗
            case  22 : return "sapling 1"; // 云杉树苗
            case  23 : return "sapling 2"; // 白桦树苗
            case  24 : return "sapling 3"; // 丛林树苗
            case  25 : return "sapling 4"; // 金合欢树苗
            case  26 : return "sapling 5"; // 深色橡树树苗
            case  27 : return "bedrock"; // 基岩
            case  28 : return "sand 0"; // 沙子
            case  29 : return "sand 1"; // 红沙
            case  30 : return "gravel"; // 砂砾
            case  31 : return "gold_ore"; // 金矿石
            case  32 : return "iron_ore"; // 铁矿石
            case  33 : return "coal_ore"; // 煤矿石
            case  34 : return "log 0"; // 橡木
            case  35 : return "log 1"; // 云杉木
            case  36 : return "log 2"; // 白桦木
            case  37 : return "log 3"; // 丛林木
            case  38 : return "log"; // (树皮包裹的)橡木
            case  39 : return "log"; // (树皮包裹的)云杉木
            case  40 : return "log"; // (树皮包裹的)白桦木
            case  41 : return "log"; // (树皮包裹的)丛林木
            case  42 : return "leaves"; // 橡树树叶
            case  43 : return "leaves"; // 云山树叶
            case  44 : return "leaves"; // 白桦树叶
            case  45 : return "leaves"; // 丛林树叶
            case  46 : return "sponge 0"; // 海绵
            case  47 : return "sponge 1"; // 湿海绵
            case  48 : return "glass"; // 玻璃
            case  49 : return "lapis_ore"; // 青金石矿
            case  50 : return "lapis_block"; // 青金石块
            case  51 : return "dispenser"; // 发射器
            case  52 : return "sandstone 0"; // 砂岩
            case  53 : return "sandstone 1"; // 錾制砂岩
            case  54 : return "sandstone 2"; // 平滑砂岩
            case  55 : return "noteblock"; // 音符盒
            case  56 : return "golden_rail"; // 动力铁轨
            case  57 : return "detector_rail"; // 探测铁轨
            case  58 : return "sticky_piston"; // 粘性活塞
            case  59 : return "web"; // 蜘蛛网
            case  60 : return "tall_grass 0"; // 枯死的植物
            case  61 : return "tall_grass 1"; // 草
            case  62 : return "tall_grass 2"; // 蕨
            case  63 : return "deadbush"; // 枯死灌木
            case  64 : return "piston"; // 活塞
            case  65 : return "piston_head"; // 活塞头
            case  66 : return "wool 0"; // 白色羊毛
            case  67 : return "wool 1"; // 橙色羊毛
            case  68 : return "wool 2"; // 品红羊毛
            case  69 : return "wool 3"; // 浅蓝色羊毛
            case  70 : return "wool 4"; // 黄色羊毛
            case  71 : return "wool 5"; // 黄绿色羊毛
            case  72 : return "wool 6"; // 粉红色羊毛
            case  73 : return "wool 7"; // 灰色羊毛
            case  74 : return "wool 8"; // 青色羊毛
            case  75 : return "wool 9"; // 淡灰色羊毛
            case  76 : return "wool 10"; // 紫色羊毛
            case  77 : return "wool 11"; // 蓝色羊毛
            case  78 : return "wool 12"; // 棕色羊毛
            case  79 : return "wool 13"; // 绿色羊毛
            case  80 : return "wool 14"; // 红色羊毛
            case  81 : return "wool 15"; // 黑色羊毛
            case  82 : return "yellow_flower 0"; // 蒲公英
            case  83 : return "red_flower 0"; // 虞美人
            case  84 : return "red_flower 1"; // 兰花
            case  85 : return "red_flower 2"; // 绒球葱
            case  86 : return "red_flower 3"; // 茜草花
            case  87 : return "red_flower 4"; // 红色郁金香
            case  88 : return "red_flower 5"; // 橙色郁金香
            case  89 : return "red_flower 6"; // 白色郁金香
            case  90 : return "red_flower 7"; // 粉色郁金香
            case  91 : return "red_flower 8"; // 滨菊
            case  92 : return "brown_mushroom"; // 灰色蘑菇
            case  93 : return "red_mushroom"; // 红色蘑菇
            case  94 : return "gold_block"; // 金块
            case  95 : return "iron_block"; // 铁块
            case  96 : return "stone_slab"; // 平滑石台阶
            case  97 : return "stone_slab"; // 砂岩台阶
            case  98 : return "stone_slab"; // 石质木台阶
            case  99 : return "stone_slab"; // 圆石台阶
            case  100 : return "stone_slab"; // 砖块台阶
            case  101 : return "stone_slab"; // 石砖台阶
            case  102 : return "stone_slab"; // 下界砖块台阶
            case  103 : return "stone_slab"; // 石英台阶
            case  104 : return "brick_block"; // 砖块
            case  105 : return "tnt"; // TNT/炸药
            case  106 : return "bookshelf"; // 书架
            case  107 : return "mossy_cobblestone"; // 苔石
            case  108 : return "obsidian"; // 黑曜石
            case  109 : return "torch"; // 站立的火把/火把
            case  110 : return "torch"; // 附着方块的火把
            case  111 : return "oak_stairs"; // 橡木楼梯
            case  112 : return "chest"; // 箱子
            case  113 : return "diamond_ore"; // 钻石矿
            case  114 : return "diamond_block"; // 钻石块
            case  115 : return "crafting_table"; // 工作台
            case  116 : return "furnace"; // 熔炉
            case  117 : return "lit_furnace"; // 点亮的熔炉
            case  118 : return "ladder"; // 木梯
            case  119 : return "rail"; // 铁轨
            case  120 : return "stone_stairs"; // 圆石楼梯
            case  121 : return "lever"; // 拉杆
            case  122 : return "stone_pressure_plate"; // 石质压力板
            case  123 : return "wooden_pressure_plate"; // 木质压力板
            case  124 : return "redstone_ore"; // 红石矿
            case  125 : return "lit_redstone_ore"; // 点亮的红石矿
            case  126 : return "redstone_torch"; // 站立的红石火把
            case  127 : return "redstone_torch"; // 附着方块的红石火把
            case  128 : return "unlit_redstone_torch"; // 站立的熄灭的红石火把
            case  129 : return "unlit_redstone_torch"; // 附着方块的熄灭的红石火把
            case  130 : return "stone_button"; // 石质按钮
            case  131 : return "snow_layer"; // 雪层
            case  132 : return "ice"; // 冰块
            case  133 : return "snow"; // 雪块
            case  134 : return "cactus"; // 仙人掌
            case  135 : return "clay"; // 黏土块
            case  136 : return "jukebox"; // 唱片机
            case  137 : return "fence"; // 橡木栅栏
            case  138 : return "pumpkin"; // 南瓜头套
            case  139 : return "netherrack"; // 地狱岩
            case  140 : return "soul_sand"; // 灵魂沙
            case  141 : return "glowstone"; // 萤石
            case  142 : return "lit_pumpkin"; // 南瓜灯
            case  143 : return "stained_glass 0"; // 白色染色玻璃
            case  144 : return "stained_glass 1"; // 橙色染色玻璃
            case  145 : return "stained_glass 2"; // 品红染色玻璃
            case  146 : return "stained_glass 3"; // 淡蓝色染色玻璃
            case  147 : return "stained_glass 4"; // 黄色染色玻璃
            case  148 : return "stained_glass 5"; // 黄绿色染色玻璃
            case  149 : return "stained_glass 6"; // 粉红色染色玻璃
            case  150 : return "stained_glass 7"; // 灰色染色玻璃
            case  151 : return "stained_glass 8"; // 淡灰色染色玻璃
            case  152 : return "stained_glass 9"; // 青色染色玻璃
            case  153 : return "stained_glass 10"; // 紫色染色玻璃
            case  154 : return "stained_glass 11"; // 蓝色染色玻璃
            case  155 : return "stained_glass 12"; // 棕色染色玻璃
            case  156 : return "stained_glass 13"; // 绿色染色玻璃
            case  157 : return "stained_glass 14"; // 红色染色玻璃
            case  158 : return "stained_glass 15"; // 黑色染色玻璃
            case  159 : return "trapdoor"; // 活板门
            case  160 : return "monster_egg 0"; // 石头怪物蛋
            case  161 : return "monster_egg 1"; // 圆石怪物蛋
            case  162 : return "monster_egg 2"; // 石砖怪物蛋
            case  163 : return "monster_egg 3"; // 苔石砖怪物蛋
            case  164 : return "monster_egg 4"; // 裂石砖怪物蛋
            case  165 : return "monster_egg 5"; // 錾制石砖怪物蛋
            case  166 : return "stonebrick 0"; // 石砖
            case  167 : return "stonebrick 1"; // 苔石砖
            case  168 : return "stonebrick 2"; // 裂石砖
            case  169 : return "stonebrick 3"; // 錾制石砖
            case  170 : return "iron_bars"; // 铁栏杆
            case  171 : return "glass_pane"; // 玻璃板
            case  172 : return "melon_block"; // 西瓜
            case  173 : return "vine"; // 藤蔓
            case  174 : return "fence_gate"; // 橡木栅栏门
            case  175 : return "brick_stairs"; // 砖楼梯
            case  176 : return "stone_brick_stairs"; // 石砖楼梯
            case  177 : return "mycelium"; // 菌丝
            case  178 : return "waterlily"; // 睡莲
            case  179 : return "nether_brick"; // 地狱砖
            case  180 : return "nether_brick_fence"; // 地狱砖栅栏
            case  181 : return "nether_brick_stairs"; // 地狱砖楼梯
            case  182 : return "enchanting_table"; // 附魔台
            case  183 : return "end_portal_frame"; // 末地传送门
            case  184 : return "end_stone"; // 末地石
            case  185 : return "redstone_lamp"; // 红石灯
            case  186 : return "lit_redstone_lamp"; // 点亮的红石灯
            case  187 : return "wooden_slab"; // 橡木台阶
            case  188 : return "wooden_slab"; // 云杉木台阶
            case  189 : return "wooden_slab"; // 白桦木台阶
            case  190 : return "wooden_slab"; // 丛林木台阶
            case  191 : return "wooden_slab"; // 金合欢木台阶
            case  192 : return "wooden_slab"; // 深色橡木台阶
            case  193 : return "sandstone_stairs"; // 砂岩楼梯
            case  194 : return "emerald_ore"; // 绿宝石矿石
            case  195 : return "ender_chest"; // 末影箱
            case  196 : return "tripwire_hook"; // 绊线钩
            case  197 : return "emerald_block"; // 绿宝石块
            case  198 : return "spruce_stairs"; // 云杉木楼梯
            case  199 : return "birch_stairs"; // 白桦木楼梯
            case  200 : return "jungle_stairs"; // 丛林木楼梯
            case  201 : return "beacon"; // 信标
            case  202 : return "cobblestone_wall 0"; // 圆石墙
            case  203 : return "cobblestone_wall 1"; // 苔石墙
            case  204 : return "wooden_button"; // 木质按钮
            case  205 : return "anvil 0"; // 完好的铁砧
            case  206 : return "anvil 1"; // 轻微损坏的铁砧
            case  207 : return "anvil 2"; // 严重损坏的铁砧
            case  208 : return "trapped_chest"; // 陷阱箱
            case  209 : return "light_weighted_pressure_plate"; // 轻质压力板
            case  210 : return "heavy_weighted_pressure_plate"; // 重质压力板
            case  211 : return "daylight_detector"; // 阳光探测器
            case  212 : return "daylight_detector_inverted"; // 月光探测器/阳光探测器倒置
            case  213 : return "redstone_block"; // 红石块
            case  214 : return "quartz_ore"; // 下界石英矿石
            case  215 : return "hopper"; // 漏斗
            case  216 : return "quartz_block 0"; // 石英块
            case  217 : return "quartz_block 1"; // 錾制石英块
            case  218 : return "quartz_block 2"; // 竖纹石英块
            case  219 : return "quartz_stairs"; // 石英楼梯
            case  220 : return "activator_rail"; // 激活铁轨
            case  221 : return "dropper"; // 投掷器
            case  222 : return "stained_hardened_clay 0"; // 白色陶瓦
            case  223 : return "stained_hardened_clay 1"; // 橙色陶瓦
            case  224 : return "stained_hardened_clay 2"; // 品红色陶瓦
            case  225 : return "stained_hardened_clay 3"; // 淡蓝色陶瓦
            case  226 : return "stained_hardened_clay 4"; // 黄色陶瓦
            case  227 : return "stained_hardened_clay 5"; // 黄绿色陶瓦
            case  228 : return "stained_hardened_clay 6"; // 粉红色陶瓦
            case  229 : return "stained_hardened_clay 7"; // 灰色陶瓦
            case  230 : return "stained_hardened_clay 8"; // 淡灰色陶瓦
            case  231 : return "stained_hardened_clay 9"; // 青色陶瓦
            case  232 : return "stained_hardened_clay 10"; // 紫色陶瓦
            case  233 : return "stained_hardened_clay 11"; // 蓝色陶瓦
            case  234 : return "stained_hardened_clay 12"; // 棕色陶瓦
            case  235 : return "stained_hardened_clay 13"; // 绿色陶瓦
            case  236 : return "stained_hardened_clay 14"; // 红色陶瓦
            case  237 : return "stained_hardened_clay 15"; // 黑色陶瓦
            case  238 : return "stained_glass_pane 0"; // 白色染色玻璃板
            case  239 : return "stained_glass_pane 1"; // 橙色染色玻璃板
            case  240 : return "stained_glass_pane 2"; // 品红染色玻璃板
            case  241 : return "stained_glass_pane 3"; // 淡蓝色染色玻璃板
            case  242 : return "stained_glass_pane 4"; // 黄色染色玻璃板
            case  243 : return "stained_glass_pane 5"; // 黄绿色染色玻璃板
            case  244 : return "stained_glass_pane 6"; // 粉红色染色玻璃板
            case  245 : return "stained_glass_pane 7"; // 灰色染色玻璃板
            case  246 : return "stained_glass_pane 8"; // 淡灰色染色玻璃板
            case  247 : return "stained_glass_pane 9"; // 青色染色玻璃板
            case  248 : return "stained_glass_pane 10"; // 紫色染色玻璃板
            case  249 : return "stained_glass_pane 11"; // 蓝色染色玻璃板
            case  250 : return "stained_glass_pane 12"; // 棕色染色玻璃板
            case  251 : return "stained_glass_pane 13"; // 绿色玻璃板
            case  252 : return "stained_glass_pane 14"; // 红色染色玻璃板
            case  253 : return "stained_glass_pane 15"; // 黑色染色玻璃板
            case  254 : return "leaves2 0"; // 金合欢树叶
            case  255 : return "leaves2 1"; // 深色橡树叶
            case  256 : return "log2 0"; // 金合欢木
            case  257 : return "log2 1"; // 深色橡木
            case  258 : return "acacia_stairs"; // 金合欢木楼梯
            case  259 : return "dark_oak_stairs"; // 深色橡木楼梯
            case  260 : return "slime"; // 粘液块
            case  261 : return "iron_trapdoor"; // 铁制活板门
            case  262 : return "prismarine 0"; // 海晶石
            case  263 : return "prismarine 1"; // 海晶石砖
            case  264 : return "prismarine 2"; // 暗海晶石
            case  265 : return "sea_lantern"; // 海晶灯
            case  266 : return "hay_block"; // 干草块
            case  267 : return "carpet 0"; // 白色地毯
            case  268 : return "carpet 1"; // 橙色地毯
            case  269 : return "carpet 2"; // 品红地毯
            case  270 : return "carpet 3"; // 淡蓝色地毯
            case  271 : return "carpet 4"; // 黄色地毯
            case  272 : return "carpet 5"; // 黄绿色地毯
            case  273 : return "carpet 6"; // 粉红色地毯
            case  274 : return "carpet 7"; // 灰色地毯
            case  275 : return "carpet 8"; // 淡灰色地毯
            case  276 : return "carpet 9"; // 青色地毯
            case  277 : return "carpet 10"; // 紫色地毯
            case  278 : return "carpet 11"; // 蓝色地毯
            case  279 : return "carpet 12"; // 棕色地毯
            case  280 : return "carpet 13"; // 绿色地毯
            case  281 : return "carpet 14"; // 红色地毯
            case  282 : return "carpet 15"; // 黑色地毯
            case  283 : return "hardened_clay"; // 陶瓦
            case  284 : return "coal_block"; // 煤炭块
            case  285 : return "packed_ice"; // 浮冰
            case  286 : return "double_plant 0"; // 向日葵/太阳花
            case  287 : return "double_plant 1"; // 丁香
            case  288 : return "double_plant 2"; // 高草丛
            case  289 : return "double_plant 3"; // 大型蕨
            case  290 : return "double_plant 4"; // 玫瑰丛
            case  291 : return "double_plant 5"; // 牡丹
            case  292 : return "red_sandstone 0"; // 红砂岩
            case  293 : return "red_sandstone 1"; // 錾制红砂岩
            case  294 : return "red_sandstone 2"; // (磨制/平滑)红砂岩
            case  295 : return "red_sandstone_stairs"; // 红砂岩楼梯
            case  296 : return "stone_slab2 0"; // 红砂岩台阶
            case  297 : return "spruce_fence_gate"; // 云杉木栅栏门
            case  298 : return "birch_fence_gate"; // 白桦木栅栏门
            case  299 : return "jungle_fence_gate"; // 丛林木栅栏门
            case  300 : return "dark_oak_fence_gate"; // 深色橡木栅栏门
            case  301 : return "acacia_fence_gate"; // 金合欢木栅栏门
            case  302 : return "spruce_fence"; // 云杉木栅栏
            case  303 : return "birch_fence"; // 白桦木栅栏
            case  304 : return "jungle_fence"; // 丛林木栅栏
            case  305 : return "dark_oak_fence"; // 深色橡木栅栏
            case  306 : return "acacia_fence"; // 金合欢木栅栏
            case  307 : return "end_rod"; // 末地烛
            case  308 : return "chorus_plant"; // 紫颂植物
            case  309 : return "chorus_flower"; // 紫颂花
            case  310 : return "purpur_block"; // 紫珀块
            case  311 : return "purpur_pillar"; // 竖纹紫珀块
            case  312 : return "purpur_stairs"; // 紫珀楼梯
            case  313 : return "purpur_slab"; // 紫珀台阶
            case  314 : return "end_bricks"; // 末地石砖
            case  315 : return "magma"; // 岩浆块/熔岩块
            case  316 : return "nether_wart_block"; // 地狱疣块
            case  317 : return "red_nether_brick"; // 红色地狱砖
            case  318 : return "bone_block"; // 骨块
            case  319 : return "observer"; // 侦测器
            case  320 : return "white_shulker_box"; // 白色潜影盒
            case  321 : return "orange_shulker_box"; // 橙色潜影盒
            case  322 : return "magenta_shulker_box"; // 品红潜影盒
            case  323 : return "light_blue_shulker_box"; // 淡蓝色潜影盒
            case  324 : return "yellow_shulker_box"; // 黄色潜影盒
            case  325 : return "lime_shulker_box"; // 黄绿色潜影盒
            case  326 : return "pink_shulker_box"; // 粉红色潜影盒
            case  327 : return "gray_shulker_box"; // 灰色潜影盒
            case  328 : return "silver_shulker_box"; // 淡灰色潜影盒
            case  329 : return "cyan_shulker_box"; // 青色潜影盒
            case  330 : return "purple_shulker_box"; // 紫色潜影盒
            case  331 : return "blue_shulker_box"; // 蓝色潜影盒
            case  332 : return "brown_shulker_box"; // 棕色潜影盒
            case  333 : return "green_shulker_box"; // 绿色潜影盒
            case  334 : return "red_shulker_box"; // 红色潜影盒
            case  335 : return "black_shulker_box"; // 黑色潜影盒
            case  336 : return "white_glazed_terracotta"; // 白色陶瓦
            case  337 : return "orange_glazed_terracotta"; // 橙色陶瓦
            case  338 : return "magenta_glazed_terracotta"; // 品红陶瓦
            case  339 : return "light_blue_glazed_terracotta"; // 淡蓝色陶瓦
            case  340 : return "yellow_glazed_terracotta"; // 黄色陶瓦
            case  341 : return "lime_glazed_terracotta"; // 黄绿色陶瓦
            case  342 : return "pink_glazed_terracotta"; // 粉红色陶瓦
            case  343 : return "gray_glazed_terracotta"; // 灰色陶瓦
            case  344 : return "silver_glazed_terracotta"; // 淡灰色陶瓦
            case  345 : return "cyan_glazed_terracotta"; // 青色陶瓦
            case  346 : return "purple_glazed_terracotta"; // 紫色陶瓦
            case  347 : return "blue_glazed_terracotta"; // 蓝色陶瓦
            case  348 : return "brown_glazed_terracotta"; // 棕色陶瓦
            case  349 : return "green_glazed_terracotta"; // 绿色陶瓦
            case  350 : return "red_glazed_terracotta"; // 红色陶瓦
            case  351 : return "black_glazed_terracotta"; // 黑色陶瓦
            case  352 : return "concrete 0"; // 白色混凝土
            case  353 : return "concrete 1"; // 橙色混凝土
            case  354 : return "concrete 2"; // 品红混凝土
            case  355 : return "concrete 3"; // 淡蓝色混凝土
            case  356 : return "concrete 4"; // 黄色混凝土
            case  357 : return "concrete 5"; // 黄绿色混凝土
            case  358 : return "concrete 6"; // 粉红色混凝土
            case  359 : return "concrete 7"; // 灰色混凝土
            case  360 : return "concrete 8"; // 淡灰色混凝土
            case  361 : return "concrete 9"; // 青色混凝土
            case  362 : return "concrete 10"; // 紫色混凝土
            case  363 : return "concrete 11"; // 蓝色混凝土
            case  364 : return "concrete 12"; // 棕色混凝土
            case  365 : return "concrete 13"; // 绿色混凝土
            case  366 : return "concrete 14"; // 红色混凝土
            case  367 : return "concrete 15"; // 黑色混凝土
            case  368 : return "concrete_powder 0"; // 白色混凝土粉末
            case  369 : return "concrete_powder 1"; // 橙色混凝土粉末
            case  370 : return "concrete_powder 2"; // 品红混凝土粉末
            case  371 : return "concrete_powder 3"; // 淡蓝色混凝土粉末
            case  372 : return "concrete_powder 4"; // 黄色混凝土粉末
            case  373 : return "concrete_powder 5"; // 黄绿色混凝土粉末
            case  374 : return "concrete_powder 6"; // 粉红色混凝土粉末
            case  375 : return "concrete_powder 7"; // 灰色混凝土粉末
            case  376 : return "concrete_powder 8"; // 淡灰色混凝土粉末
            case  377 : return "concrete_powder 9"; // 青色混凝土粉末
            case  378 : return "concrete_powder 10"; // 紫色混凝土粉末
            case  379 : return "concrete_powder 11"; // 蓝色混凝土粉末
            case  380 : return "concrete_powder 12"; // 棕色混凝土粉末
            case  381 : return "concrete_powder 13"; // 绿色混凝土粉末
            case  382 : return "concrete_powder 14"; // 红色混凝土粉末
            case  383 : return "concrete_powder 15"; // 黑色混凝土粉末
            case  384 : return "standing_sign"; // 站立的告示牌
            case  385 : return "wall_sign"; // 附着墙上的告示牌
            case  386 : return "wooden_door"; // 木门
            case  387 : return "water"; // 水
            case  388 : return "lava"; // 岩浆
            case  389 : return "iron_door"; // 铁门
            case  390 : return "bed"; // 床
            case  391 : return "unpowered_repeater"; // 未激活的红石中继器
            case  392 : return "powered_repeater"; // 激活的红石中继器
            case  393 : return "brewing_stand"; // 酿造台
            case  394 : return "cauldron"; // 炼药锅
            case  395 : return "skull"; // 骷髅头颅
            case  396 : return "flower_pot"; // 花盆
            case  397 : return "unpowered_comparator"; // 未激活的红石比较器
            case  398 : return "powered_comparator"; // 激活的红石比较器
            case  399 : return "standing_banner 15"; // 站立的白色旗帜
            case  400 : return "standing_banner 14"; // 站立的橙色旗帜
            case  401 : return "standing_banner 13"; // 站立的品红旗帜
            case  402 : return "standing_banner 12"; // 站立的淡蓝色旗帜
            case  403 : return "standing_banner 11"; // 站立的黄色旗帜
            case  404 : return "standing_banner 10"; // 站立的黄绿色旗帜
            case  405 : return "standing_banner 9"; // 站立的粉红色旗帜
            case  406 : return "standing_banner 8"; // 站立的灰色旗帜
            case  407 : return "standing_banner 7"; // 站立的淡灰色旗帜
            case  408 : return "standing_banner 6"; // 站立的青色旗帜
            case  409 : return "standing_banner 5"; // 站立的紫色旗帜
            case  410 : return "standing_banner 4"; // 站立的蓝色旗帜
            case  411 : return "standing_banner 3"; // 站立的棕色旗帜
            case  412 : return "standing_banner 2"; // 站立的绿色旗帜
            case  413 : return "standing_banner 1"; // 站立的红色旗帜
            case  414 : return "standing_banner 0"; // 站立的黑色旗帜
            case  415 : return "wall_banner 15"; // 附着方块的白色旗帜
            case  416 : return "wall_banner 14"; // 附着方块的橙色旗帜
            case  417 : return "wall_banner 13"; // 附着方块的品红旗帜
            case  418 : return "wall_banner 12"; // 附着方块的淡蓝色旗帜
            case  419 : return "wall_banner 11"; // 附着方块的黄色旗帜
            case  420 : return "wall_banner 10"; // 附着方块的黄绿色旗帜
            case  421 : return "wall_banner 9"; // 附着方块的粉红色旗帜
            case  422 : return "wall_banner 8"; // 附着方块的灰色旗帜
            case  423 : return "wall_banner 7"; // 附着方块的淡灰色旗帜
            case  424 : return "wall_banner 6"; // 附着方块的青色旗帜
            case  425 : return "wall_banner 5"; // 附着方块的紫色旗帜
            case  426 : return "wall_banner 4"; // 附着方块的蓝色旗帜
            case  427 : return "wall_banner 3"; // 附着方块的棕色旗帜
            case  428 : return "wall_banner 2"; // 附着方块的绿色旗帜
            case  429 : return "wall_banner 1"; // 附着方块的红色旗帜
            case  430 : return "wall_banner 0"; // 附着方块的黑色旗帜
            case  431 : return "spruce_door"; // 云山木门
            case  432 : return "birch_door"; // 白桦木门
            case  433 : return "jungle_door"; // 丛林木门
            case  434 : return "acacia_door"; // 金合欢木门
            case  435 : return "dark_oak_door"; // 深色橡木门
            case  436 : return "double_stone_slab 0"; // 双平滑石台阶
            case  437 : return "double_stone_slab 1"; // 双砂岩台阶
            case  438 : return "double_stone_slab 2"; // 双石质木台阶
            case  439 : return "double_stone_slab 3"; // 双圆石台阶
            case  440 : return "double_stone_slab 4"; // 双砖台阶
            case  441 : return "double_stone_slab 5"; // 双石砖台阶
            case  442 : return "double_stone_slab 6"; // 双地狱砖台阶
            case  443 : return "double_stone_slab 7"; // 双石英台阶
            case  444 : return "double_stone_slab 8"; // 平滑石头
            case  445 : return "double_stone_slab 10"; // 石质木板
            case  446 : return "double_wooden_slab 0"; // 双橡木台阶
            case  447 : return "double_wooden_slab 1"; // 双云杉木台阶
            case  448 : return "double_wooden_slab 2"; // 双白桦木台阶
            case  449 : return "double_wooden_slab 3"; // 双丛林木台阶
            case  450 : return "double_wooden_slab 4"; // 双金合欢木台阶
            case  451 : return "double_wooden_slab 5"; // 双深色橡木台阶
            case  452 : return "double_stone_slab2"; // 双红砂岩台阶
            case  453 : return "double_stone_slab2"; // 双平滑红砂岩台阶
            case  454 : return "purpur_double_slab"; // 双紫珀台阶
            case  455 : return "tripwire"; // 绊线
            case  456 : return "redstone_wire"; // 红石线
            case  457 : return "wheat"; // 小麦农作物
            case  458 : return "reeds"; // 甘蔗
            case  459 : return "cocoa"; // 可可
            case  460 : return "pumpkin_stem"; // 南瓜茎
            case  461 : return "melon_stem"; // 西瓜茎
            case  462 : return "nether_wart"; // 地狱疣
            case  463 : return "carrots"; // 胡萝卜农作物
            case  464 : return "potatoes"; // 马铃薯/土豆
            case  465 : return "beetroots"; // 甜菜根农作物
            case  466 : return "brown_mushroom_block"; // 棕色蘑菇方块
            case  467 : return "red_mushroom_block"; // 红色蘑菇方块
            case  468 : return "brown_mushroom_block,red_mushroom_block"; // 蘑菇柄
            case  469 : return "cake"; // 蛋糕
            case  470 : return "fire"; // 火
            case  471 : return "frosted_ice"; // 霜冰
            case  472 : return "mob_spawner"; // 刷怪笼
            case  473 : return ""; // 物品展示框
            case  474 : return "portal"; // 传送门
            case  475 : return "dragon_egg"; // 龙蛋
            case  476 : return "command_block"; // 命令方块
            case  477 : return "chain_command_block"; // 连锁型命令方块
            case  478 : return "repeating_command_block"; // 循环型命令方块
            case  479 : return "structure_block"; // 结构方块
            case  480 : return "structure_void"; // 空结构
            case  481 : return ""; // 未知
            case  482 : return ""; // 未知

            default: return "!不存在该方块";
        }
    }
}
