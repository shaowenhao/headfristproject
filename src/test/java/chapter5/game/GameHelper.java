package chapter5.game;

import java.util.Scanner;

/**
 * Description:
 * date: 2020 2020/7/13 9:37
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class GameHelper {
    public String getUserInput(String input){
        System.out.println(input);
        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();
        if(guess.length()==0){
            System.out.println("please input valid number");
            return null;
        }
        return guess;
    }
}
