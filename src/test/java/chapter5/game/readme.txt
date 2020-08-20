1. 设计完第一版的SimpileDotCom之后
DotCom开始引入ArrayList处理数组中的遗留问题
运行SimpleDotComGame 没有重复输入3次相同数字表示击沉的bug

2. 升级版本考虑设计

DotComBust类 就是之前的游戏类 创建DotCom，取得玩家的输入，进行游戏
(处理玩家的输入与设定DootCom的位置) --> GameHelper
         创建与操作                --> DotCom

DotCom类 DotCom对象有名称，位置，知道如何判断玩家是否命中

GameHelper 预先帮你写好的程序，执行许多功能



