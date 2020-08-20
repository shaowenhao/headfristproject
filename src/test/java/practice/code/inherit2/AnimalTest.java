package practice.code.inherit2;

/**
 * Description:多态性举例
 * date: 2020 2020/8/7 10:47
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class AnimalTest {


    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.func(new Dog());
        test.func(new Cat());
    }
    public  void func(Animal animal){
        animal.eat();
        animal.shout();
    }

}

class Animal{
    public void eat(){
        System.out.println("animal eat");
    }

    public void shout(){
        System.out.println("animal aoao");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("啃骨头");
    }

    @Override
    public void shout() {
        System.out.println("汪汪汪");
    }
}

class Cat extends  Animal{
    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    @Override
    public void shout() {
        System.out.println("喵喵喵");
    }
 }
