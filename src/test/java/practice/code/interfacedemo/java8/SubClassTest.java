package practice.code.interfacedemo.java8;

/**
 * Description:
 * date: 2020 2020/8/11 14:31
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class SubClassTest {
    public static void main(String[] args) {

        SubClass s = new SubClass();
       // s.method2();
       // CompareA.method1();
        s.mymethod();
    }
}

class SubClass implements CompareA{
    @Override
    public void method2() {
        System.out.println("SubClass：上海");
    }

    public void mymethod(){
        CompareA.super.method2();
    }
}


