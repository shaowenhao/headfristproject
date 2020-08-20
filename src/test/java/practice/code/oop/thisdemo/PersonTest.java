package practice.code.oop.thisdemo;

/**
 * Description: this 调用构造器
 * date: 2020 2020/8/5 10:42
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class PersonTest {
    public static void main(String[] args) {

//        Person p1 = new Person();
//        p1.setAge(1);
//        System.out.println(p1.getAge());

        Person p2 = new Person("ryan",32);
        System.out.println(p2.getName());
    }

}

class Person{

    private String name;
    private int age;

    public Person(){
        eat();
        System.out.println("Person初始化的时候需要考虑 如下：1，2,3,4");

    }

    // this修饰方法和属性 理解为当前对象，或当前正在创建的对象
    public Person(String name, int age){
        this();  //避免代码重复 一进来就调无参构造器
        this.name = name;
        this.age  = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void eat(){
        System.out.println("eating.....");
    }
}
