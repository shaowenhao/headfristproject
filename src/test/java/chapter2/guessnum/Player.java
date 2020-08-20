package chapter2.guessnum;

/**
 * Description:
 * date: 2020 2020/7/10 13:15
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class Player {
    int number = 0;
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I’m guessing "
                + number);
    }
}