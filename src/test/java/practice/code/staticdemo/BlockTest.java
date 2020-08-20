package practice.code.staticdemo;

/**
 * Description: 类的成员 之 代码块
 * date: 2020 2020/8/10 10:37
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class BlockTest {
    public static void main(String[] args) {
      // String desc = Person.desc;
        System.out.println(Person.desc);
       Person p1 = new Person();
      // System.out.println(p1.age);
    }
}

class Person{
    String name;
    int age;
    static String desc = "我是一个人";

    public Person(){

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //静态代码块
    static{
        System.out.println("hello static block");
        desc = "帅气的我 加油";
    }

    //非静态代码块
    {
        System.out.println("hello none static block");
        age = 1;
    }


    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}