package chapter5.game;

/**
 * Description: 第二步
 * 应该要测试的部分先想想
 *
 * SimpleDotCom对象的初始化，
 * 赋值位置（带有3个init的数组），
 * 创建代表玩家猜的字符串
 * 传入伪造的猜测调用checkYourself()
 * 列出结果观察是否正确
 * date: 2020 2020/7/10 21:26
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class SimpleDotComTest {
    public static void main(String[] args) {
          SimpleDotCom dot = new SimpleDotCom();
          int[] locations = {2,3,4};
          dot.setLocationCells(locations);

          String uesrGuess = "2";
          String result = dot.checkYourself(uesrGuess);

          if(result.equals("hit")){
              result = "passed";
          }

        System.out.println(result);
    }
}
