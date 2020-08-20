package advanced.string.demo;

import org.junit.jupiter.api.Test;

/**
 * Description:
 * date: 2020 2020/8/18 22:11
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class StringMethodTest {
    @Test
    void test(){
        String s1 = "helloworld";
        System.out.println(s1.substring(0, 5));

        System.out.println(s1.length());
        System.out.println(s1.charAt(0)); //h
        System.out.println(s1.charAt(9)); //d

        s1 = "";
        //判断字符串是够是空字符串 return value.length == 0
        System.out.println(s1.isEmpty()); //true

        String s2 = s1.concat("ryan");
        System.out.println(s2);
        System.out.println(s1);

       String s3 = "abc";
       String s4 = "abd";
        System.out.println(s3.compareTo(s4));
    }

    @Test
    void test2(){
        String s1 = "helloworld";
        System.out.println(s1.contains("wo"));
        System.out.println(s1.indexOf("wo"));

        System.out.println(s1.indexOf("ll", 3));
        System.out.println(s1.indexOf("lo", 3));
    }



    @Test
    void test3(){
        String s1 = "hellooworldoo";
        // o 替换为A
        System.out.println(s1.replace("o", "A"));
        // oo 替换为VV o
        System.out.println(s1.replace("oo", "vv"));

        String s2 = "12hello34world5java6";
        //先替换成 ,hello,world,java,
        //再去掉收尾逗号
        String s3 = s2.replaceAll("\\d+", ",").replaceAll("^,|,$", "");
        System.out.println(s3);


        String phone = "010-1234567";
        System.out.println(phone.matches("010-\\d{7,8}"));
    }

    @Test
    void test4(){
        String s ="hello|world|china";
        // 如果以. 分割 \\.
        String[] array = s.split("\\|");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
