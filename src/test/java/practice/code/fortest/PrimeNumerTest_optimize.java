package practice.code.fortest;

/**
 * Description: 100以内的质数 只能被1和本身整除的数
 * date: 2020 2020/8/1 20:40
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class PrimeNumerTest_optimize {
    public static void main(String[] args) {

         boolean isFlag = true; //标识
         int count = 0;
         long start = System.currentTimeMillis();
           for (int i=2;i<100000;i++){

                for (int j = 2;j<Math.sqrt(i);j++){   //优化二 缩小比较范围 运来是n-2
                      if(i % j == 0){
                          isFlag = false;
                          break;  //优化一   一旦为false就退出
                      }
                }

              if(isFlag == true){
                  count++;
                 // System.out.println(i);
              }
              isFlag = true; // 重置isFlag
           }
        System.out.println("总有有"+count+"个质数");
        long end =  System.currentTimeMillis();
        System.out.println("总共用时：" + (end - start));
    }
}
