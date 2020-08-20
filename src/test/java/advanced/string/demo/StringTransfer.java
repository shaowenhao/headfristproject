package advanced.string.demo;

import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Description:
 * date: 2020 2020/8/19 8:33
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class StringTransfer {
    //基本数据类型，包装类 和 String 相互转换
    @Test
    void test(){
         String s = "123";

        int i = Integer.parseInt(s);

        String s1 = String.valueOf(i);

    }
  //String 与char[]之间转化
   @Test
    void test2(){
        String str = "abc123";
       char[] chars = str.toCharArray();
       for (int i = 0; i < chars.length; i++) {
           System.out.print(chars[i]+" ");
       }

       char[] arr = new char[]{'h','e','l','l','o'};
       String str2 = new String(chars);
       System.out.println(str2);


   }

    //String与 byet[]
    // 编码： 字符串 --> 字节
    // 解码：编码的逆过程 字节 --> 字符串

    @Test
    void test3() throws UnsupportedEncodingException {
        String s = new String("abcdef中国");
        //使用默认的字符集进行编码 utf-8
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));
        byte[] gbks = new byte[0];
        try {
            gbks = s.getBytes("gbk");
            System.out.println(Arrays.toString(gbks));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println("********************************");
        //使用默认的字符集 进行解码
        String s1 = new String(bytes);
        System.out.println(s1);

        String s2 = new String(gbks,"gbk");
        System.out.println(s2);
    }


}
