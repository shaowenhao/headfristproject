package practice.code.objectdemo;

import org.junit.jupiter.api.Test;

/**
 * Description: 基本数据类型 包装类 String三者转换
 * date: 2020 2020/8/7 16:40
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class WrapperTest {

    @Test
    void test(){
        int i = 10;
        Integer j = i;
        Integer k = new Integer(i);
        System.out.println(k.toString());

        Integer n = new Integer("123");
        System.out.println(n.toString());
    }

    @Test
    void test2(){
        Integer i = 10;
        int j = i.intValue();
        System.out.println(j);
    }

    @Test
    void test3(){
        int num1 = 10;
        Integer num2 = num1;

       String str1 = num2.toString();

       float f1 = 12.3f;
       String str2 = String.valueOf(f1);

       Double d1 = new Double(12.4);
       String str3 = String.valueOf(d1);

       String str4 = "123";
       int num4 = Integer.parseInt(str4);

        System.out.println(str2);
        System.out.println(str3);
        System.out.println(num4);

        String str5 = "true";
        boolean b1 = Boolean.parseBoolean(str5);
        System.out.println(b1);


        int a = false ? 1 : (int)2.0;
        System.out.println(a);
    }

}
