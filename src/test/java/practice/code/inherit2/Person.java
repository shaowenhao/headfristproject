package practice.code.inherit2;

/**
 * Description:
 * date: 2020 2020/8/7 8:52
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class Person {
    String name;
    int age;

    int id =1001;
    public Person(){

    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age){
        this(name);
        this.age = age;
    }

    public void eat(){
        System.out.println("人 吃饭");
    }

    public void walk(){
        System.out.println("人 走路");
    }
}
