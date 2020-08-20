package chapter6.game.v2;

import java.util.ArrayList;

/**
 * Description:
 * date: 2020 2020/7/12 19:57
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class DotCom {
    // 相较于 SimpleDotCom 增加 name
    private String name;
    //保存位置的ArrayList
    private ArrayList<String> locatinCells;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 更新DotCom位置的setter方法
    public void setLocationCells(ArrayList<String> loc) {
        locatinCells = loc;
    }

    public String checkYourself(String userGuess) {
        String result = "miss";
        //判别玩家猜测的值 是否有出现在ArrayList中 没有的话返回-1
        int index = locatinCells.indexOf(userGuess);
        // 命中 索引值的大于或等于0
        if(index >= 0){
            locatinCells.remove(index);
            //如果全部命中清空，那就表示击沉了！
            if(locatinCells.isEmpty()){
                result = "kill";
                System.out.println("Ouch! you sunk " + name +":(");
            }else{
                result = "hit";
            }
        }
        return  result;
    }
}
