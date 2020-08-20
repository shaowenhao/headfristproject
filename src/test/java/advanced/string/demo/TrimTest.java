package advanced.string.demo;

import org.junit.jupiter.api.Test;

/**
 * Description: 模拟一个trim方法
 * date: 2020 2020/8/19 9:28
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class TrimTest {
    @Test
    void test(){
        String s = " a b c   ";
        String s1 = s.replaceAll("^\\s", "")
                      .replaceAll("\\s+$","");
        System.out.println(s1.length());

    }

    @Test
    void test2() {
        String s = " a b c   ";
        int start = 0;  //从前往后 首次不是空格时候的位置
        int end = s.length() - 1; //从后往前 首次不是空格时候的位置

        while(start < end && s.charAt(start) == ' '){
            start++;
        }

        while(start < end && s.charAt(end) == ' '){
            end--;
        }

        String newStr = s.substring(start, end + 1);
        System.out.println(newStr.length());
    }

}
