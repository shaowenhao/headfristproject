package chapter1;

/**
 * Description:
 * date: 2020 2020/7/10 11:31
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
class Exercise1b {
//    public static void main(String[] args) {
//        int x = 1;
//        while (x < 10) {
//            if (x > 3) {
//                System.out.println("big x");
//            }
//            x += 1;
//        }
//    }


    public static void main(String [] args) {
        int x = 5;
        while ( x > 1 ) {
            x = x - 1;
            if ( x < 3) {
                System.out.println("small x");
            }
        }
    }
}