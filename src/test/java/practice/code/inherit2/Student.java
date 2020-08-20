package practice.code.inherit2;

/**
 * Description:
 * date: 2020 2020/8/7 8:54
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class Student extends Person {
    String major;

    int id = 1002;
    public Student(){

    }

    public Student(String major){
        this.major = major;
    }

    public Student(String name, int age, String major){
        super(name,age);
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生 多吃有营养的食物");
    }

    public void study(){
        System.out.println("学生 学知识");
        //this.eat();
        super.eat();
        super.walk();
    }

    public void show(){
        System.out.println("name =" + name +", age =" + age);
        System.out.println("student id:" + id + ",person id:"+ super.id);
    }
}
