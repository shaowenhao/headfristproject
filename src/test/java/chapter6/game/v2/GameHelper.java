package chapter6.game.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Description:
 * date: 2020 2020/7/12 9:40
 *
 * @author shaowenhao
 * @since JDK 1.8
 */

// 辅助类 除了取得玩家输入的方法之外， 另外一个作用设置DotCom的位置
    // 书上说 如果我是你 我会先不不管这个类，只需要把它编写出来让程序能够编译就好
public class GameHelper {

    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int grideSize = 49;
    private int[] grid = new int[grideSize];
    private int comCount = 0;

    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        String[] alphacoords = new String[comSize];
        String temp = null;
        int[] coords = new int[comSize];
        int attemps = 0;
        boolean success = false;
        int location = 0;

        comCount++;
        int incr = 1;
        if((comCount % 2) ==1){
            incr = gridLength;
        }

        while(!success & attemps++ < 200){
            location = (int)(Math.random() * grideSize);
            int x = 0;
            success = true;
            while (success && x<comSize){
                if(grid[location] == 0){
                    coords[x++] = location;
                    location+= incr;
                    if(location >= grideSize){
                        success = false;
                    }
                    if(x>0 && (location % gridLength ==0)){
                        success = false;
                    }
                } else{
                    success = false;
                }
            }
        }
        int x = 0;
        int row = 0;
        int column = 0;
        while(x < comSize){
            grid[coords[x]] = 1;
            row = (int) (coords[x] / gridLength);
            column = coords[x] % gridLength;
            temp = String.valueOf(alphabet.charAt(column));
            alphaCells.add((temp.concat(Integer.toString(row))));
            x++;
        }
        return alphaCells;
    }

    public String getUserInput(String prompt) {

       String inputLine= null;
       System.out.println(prompt + " ");
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = br.readLine();
            if (inputLine.length() == 0)
                return null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prompt.toLowerCase();
    }
}
