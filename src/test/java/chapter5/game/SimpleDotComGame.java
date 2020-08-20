package chapter5.game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Description: 创建出SimpleDotCom类和测试类后
 * date: 2020 2020/7/11 9:29
 * <p>
 * 伪代码 描述要做什么事情
 * 1. 创建出SimpleDotCom对象
 * 2. 赋值给它
 * 3. 要求玩家擦测
 * 4. 检查猜测值
 * 5. 重复猜测直到击沉为止
 * 6. 显示玩家猜测次数
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class SimpleDotComGame {


    public static void main(String[] args) {

        int numOfGuesses = 0; //保存用户猜的次数
        GameHelper helper = new GameHelper();
        //该类 checkYourself()方法实现有bug
        //SimpleDotCom sdc = new SimpleDotCom();
        DotCom sdc = new DotCom();

        int randomNum = (int) (Math.random() * 5);
        int[] sdcLocations = new int[]{randomNum, randomNum + 1, randomNum + 2};
//        for (int sdcLocation : sdcLocations) {
//            System.out.println(sdcLocation);
//        }

 //       sdc.setLocationCells(sdcLocations);
        ArrayList<String> list = new ArrayList<String>();
        list.add("3");
        list.add("4");
        list.add("5");
        sdc.setLocatinCells(list);
        //创建记录游戏是否继续进行的boolean变量，会用在while循环中
        boolean isAlive = true;

        while (isAlive == true) {
            // 根据用户输入得到猜测数字 可以封装为一个方法
            // BufferedReaded is = new BufferedReaded(new InputStreamReader(System.in))
            // is.readline();
            //取得玩家输入的字符串
            String guess = helper.getUserInput("enter a number");
            if (guess == null) continue;
            //检查玩家的猜测并将结果存储在String中
            String result = sdc.checkYourself(guess);
            System.out.println(result);
            numOfGuesses++;
            // 判断是否击沉 若击沉 设为false
            if ("kill".equals(result)) {
                isAlive = false;
                System.out.println("you took" + numOfGuesses + "guesses");
            }
        }
    }
}
