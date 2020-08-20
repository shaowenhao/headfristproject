package practice.code.inherit2;

/**
 * Description:
 * date: 2020 2020/8/7 8:57
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class SuperTest {
    public static void main(String[] args) {
              Student s = new Student();
              s.show();
              s.study();

              Student s1 = new Student("Tom",21,"Software");
              s1.show();
    }
}
