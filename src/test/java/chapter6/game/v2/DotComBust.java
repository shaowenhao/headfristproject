package chapter6.game.v2;

import java.util.ArrayList;

/**
 * Description: 第一步先DotComBust类 伪代码
 * date: 2020 2020/7/12 9:37
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class DotComBust {
    //声明并初始化变量
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    //创建初始化DotCom对象 赋予名字，坐标

    public void setUpGame(){
        // make some dot coms and give them locations
        //创建3个DotCom对象并指派名称并置入ArrayList
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        // 列出简短的提示
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com,eToys.com,Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");
        //对list中的每个DotCom重复一次
        for (DotCom dotComToSet : dotComsList) {
            // 要求DotCom的位置
            ArrayList<String> newLocation =  helper.placeDotCom(3);
           // 调用这个DotCom的setter方法来指派刚取得的位置
            dotComToSet.setLocationCells(newLocation);
        }
    };
    // 将进行游戏的工作分割成两个方法 以便保持较小的功能模块 较小的方法比较好测试，排错与修改
    // 询问玩家猜测的数字 调用checkUserGuess 知道所有DotCom对象被清除
    public void startPlaying(){
        while(!dotComsList.isEmpty()){
            // 取得玩家输入
          String userGuess = helper.getUserInput("Enter a guess");
          checkUserGuess(userGuess);
        }
        finishGame();
    }
    // 循环处理所有剩下的DotCom 并且调用DotCom对象的checkYourself()方法
    public void checkUserGuess(String userGuess){
        //递增玩家猜测次数计数
        numOfGuesses++;
        //先假设没命中
        String result = "miss";
        //对list中所有的DotCom重复
        for (DotCom dotComToTest : dotComsList) {
            //要求DotCom检查是狗命中或击沉
            result = dotComToTest.checkYourself(userGuess);
            if(result.equals("hit")){
                break;
            }
            if(result.equals("kill")){
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        //列出结果
        System.out.println(result);
    }
    // 打印出玩家的表现得分
    public void finishGame(){
        System.out.println("All Dot Coms are dead!");
        if(numOfGuesses <= 18){
            System.out.println("It only took you " + numOfGuesses + "guesses.");
        } else{
            System.out.println("Took you long enough." + numOfGuesses + "guesses.");
        }
    }

    public static void main(String[] args) {
        //创建游戏对象
        DotComBust game = new DotComBust();
        //要求游戏对象启动
        game.setUpGame();
        //要求游戏对象启动主要的循环
        game.startPlaying();
    }
}
