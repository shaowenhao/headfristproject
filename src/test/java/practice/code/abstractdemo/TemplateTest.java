package practice.code.abstractdemo;

/**
 * Description: 模板方法的设计模式
 * date: 2020 2020/8/10 15:38
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class TemplateTest {
    public static void main(String[] args) {
        Template t = new SubTemplate();
        t.spendTime();
    }

}


abstract  class Template{
    //计算某段代码所需要的时间
     public  void spendTime(){
         long start = System.currentTimeMillis();
         code(); //不确定的部分
         long end = System.currentTimeMillis();
         System.out.println("Time spend" + (end -start));
     }

     public abstract void code();

}

class SubTemplate extends Template{

    public void code() {
        for(int i =2; i< 1000;i++){
            boolean isFlag = true;
            for(int j =2;j<=Math.sqrt(i);j++){
                if(i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if(isFlag){
                System.out.println(i);
            }
        }
    }
}