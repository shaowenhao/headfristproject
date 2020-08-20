package practice.code.interfacedemo;

/**
 * Description:
 * date: 2020 2020/8/10 16:32
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class InterfaceTest {
    public static void main(String[] args) {
         Plane p = new Plane();
         p.fly();
    }
}


interface Flyable{

    public static final int MAX_SPEED = 7900;
    public static final int MIN_SPEED = 1;

    public abstract void fly();
    void stop();
}

class Plane implements Flyable{


    public void fly() {
        System.out.println("通过引擎起飞");
    }

    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}