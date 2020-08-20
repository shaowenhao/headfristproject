package practice.code.fortest;

/**
 * Description: 100以内的质数 只能被1和本身整除的数
 * date: 2020 2020/8/1 20:40
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class PrimeNumerTest {
    public static void main(String[] args) {

         boolean isFlag = true; //标识 i是否被j除进过
        long start = System.currentTimeMillis();
           for (int i=2;i<100000;i++){

                for (int j = 2;j<i;j++){   // 假设n个数 不看1和n 看 2到（n-1）
                      if(i % j == 0){
                          isFlag = false;
                      }
                }

              if(isFlag == true){
                  System.out.println(i);
              }
              isFlag = true; // 重置isFlag
           }
        long end =  System.currentTimeMillis();
        System.out.println("总共用时：" + (end - start));
    }
}
