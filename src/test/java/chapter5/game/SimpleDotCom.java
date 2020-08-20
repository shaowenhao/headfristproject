package chapter5.game;

import org.junit.jupiter.api.Test;

/**
 *  * Description: 第一步 伪代码
 *  实例变量的声明，方法的声明，方法的逻辑
 * date: 2020 2020/7/10 21:03
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class SimpleDotCom {
    int[] locationCells;
    int numofHits = 0;
   public  String checkYourself(String stringGuess){
        // compare the user guess to the location cell
        // return a result represent a "hit","miss","kill"

        /*
            第三步改善checkYourself()方法
         */
        int guess = Integer.parseInt(stringGuess);
        String result = "miss"; // 传概念保存返回结果的变量 miss为默认值

       for (int cell : locationCells) {
           if(cell == guess){
               result = "hit";
               numofHits++;
               break;
           }
       }

       if(numofHits == locationCells.length){
           result = "kill";
       }
     //  System.out.println(result);
       return result;
    }

    void setLocationCells(int[] locs){
          // assign cellLocations parameter to the variable

          locationCells = locs;
    }
}
