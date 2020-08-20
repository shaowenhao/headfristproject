package practice.code.arraytest.day2;

/**
 * Description: 方法形参的传递机制 值传递
 * 1. 形参：方法定义时 声明小括号内的参数
 *    实参: 方法调用时 实际传递给形参的数据
 * 2.值传递
 *  如果参数是基本数据类型，此时实参赋值给形参的是实参真实存储的数据值
 *  如果参数是引用数据类型，此时实参赋给形参的是实参存储数据的地址
 *
 * date: 2020 2020/8/4 21:54
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class ValueTransferTest {
    public static void main(String[] args) {

        int m = 10;
        int n = 20;
        System.out.println("m="+m+",n="+n);
//        int temp = m;
//        m = n;
//        n =temp;
        ValueTransferTest test = new ValueTransferTest();
        test.swap(m,n);
        //结果还是 10 20
        System.out.println("m="+m+",n="+n);
    }

    public void swap(int m, int n){
        int temp = m;
        m = n;
        n =temp;
    }

}
