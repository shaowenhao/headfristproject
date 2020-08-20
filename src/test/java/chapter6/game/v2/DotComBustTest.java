package chapter6.game.v2;

import java.util.ArrayList;

/**
 * Description:
 * date: 2020 2020/7/12 19:52
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class DotComBustTest {

    public static void main(String[] args) {

        DotComBust game = new DotComBust();
        game.setUpGame();
        //game.dotComsList = new ArrayList<DotCom>();
        game.setUpGame();

        game.startPlaying();

        String guess = "a1";
        game.checkUserGuess(guess);

        game.finishGame();
    }
}
