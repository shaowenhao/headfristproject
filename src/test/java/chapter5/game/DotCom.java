package chapter5.game;

import java.util.ArrayList;

/**
 * Description: 全新配方
 * 引入ArrayList SimpleDotCom里存在bug 猜的数字之前出现过与否没校验
 * date: 2020 2020/7/11 21:54
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class DotCom {

    private ArrayList<String> locatinCells;

    public void setLocatinCells(ArrayList<String> loc){
        locatinCells = loc;
    }

    public String checkYourself(String userInput){
        String result = "miss";
        //判别玩家猜测的值 是否有出现在ArrayList中 没有的话返回-1
        int index = locatinCells.indexOf(userInput);
        // 命中 索引值的大于或等于0
        if(index >= 0){
            locatinCells.remove(index);
            //如果全部命中清空，那就表示击沉了！
            if(locatinCells.isEmpty()){
                result = "kill";
            }else{
                result = "hit";
            }
        }
      return  result;
    }
}
