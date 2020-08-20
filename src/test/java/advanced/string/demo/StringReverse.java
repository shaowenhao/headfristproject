package advanced.string.demo;

/**
 * Description:
 * 将一个字符串进行反转。将字符串中指定部分进行反转。
 * 比如将“abcdefg”反转为”abfedcg”
 * date: 2020 2020/8/19 10:08
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class StringReverse {
    public static void main(String[] args) {
          String s = "abcdefg";
        System.out.println(StringReverse.stringReverse(s, 2, 5));
    }

    public static String stringReverse(String str, int start, int end){

        char[] chars = str.toCharArray();

        for(int i=start,j=end; i<j;i++,j--){
             char temp = chars[i];
             chars[i] = chars[j];
             chars[j] =temp;
        }
        return new String(chars);
    }
}
