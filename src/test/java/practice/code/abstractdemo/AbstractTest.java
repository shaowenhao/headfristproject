package practice.code.abstractdemo;

/**
 * Description: abstract
 *
 * date: 2020 2020/8/10 14:05
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class AbstractTest {
    public static void main(String[] args) {

        Person p1 = new Student("ryan",32);
        p1.eat();

    }
}

abstract class Person{
    String name;
    int age;
    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public void eat(){
//        System.out.println("人吃饭");
//    }

    //抽象方法
    public abstract void eat();

    public void walk(){
        System.out.println("人走路");
    }
}

class Student extends Person {
    public Student(String name, int age){
        super(name,age);

    }

    public void eat() {
        System.out.println("student eat food");
    }
}



