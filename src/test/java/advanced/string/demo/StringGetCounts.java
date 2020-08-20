package advanced.string.demo;

/**
 * Description:
 * date: 2020 2020/8/19 10:39
 *获取一个字符串在另一个字符串中出现的次数。
 *       比如：获取“ab”在 “cdabkkcadkabkebfkabkskab”
 *       中出现的次数
 * @author shaowenhao
 * @since JDK 1.8
 */
public class StringGetCounts {

    public static void main(String[] args) {
         String mainStr = "cdabkkcadkabkebfkabkskab";
         String subStr = "ab";
        System.out.println(StringGetCounts.getCount(mainStr, subStr));
    }

    public static int getCount(String mainStr, String subStr){

        if(mainStr.length() >= subStr.length()){
            int count = 0;
            int index = 0;
            while((index = mainStr.indexOf(subStr)) != -1){
                count++;
                mainStr = mainStr.substring(index + subStr.length());
            }
          return count;
        }else {
            return 0;
        }
    }
}
