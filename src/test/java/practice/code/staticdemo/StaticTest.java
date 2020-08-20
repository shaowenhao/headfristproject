package practice.code.staticdemo;

/**
 * Description:
 * date: 2020 2020/8/10 8:10
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class StaticTest {
    public static void main(String[] args) {

        Chinese c1 = new Chinese();
        c1.name = "ryan";
        c1.age = 32;
        c1.nation = "china";


        Chinese c2 = new Chinese();
        c2.name = "iris";
        c2.age = 30;
        System.out.println(c2.nation);

        c1.eat();
        Chinese.show();
    }
}

class Chinese{

    String name;
    int age;
    static String nation;

    public void eat(){
        System.out.println("中国人吃中餐");
        //show(); 可以调用
    }

    public static void show(){
        System.out.println("我是中国人");
        //eat() 不能调用
    }
}