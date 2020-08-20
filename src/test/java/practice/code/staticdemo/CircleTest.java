package practice.code.staticdemo;

import java.sql.SQLOutput;

/**
 * Description:
 * date: 2020 2020/8/10 9:11
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        System.out.println("c1's id" + c1.getId());
        System.out.println("c2's id" + c2.getId());
        Circle c3 = new Circle(1.23);
        System.out.println(c3.getRadius());
        System.out.println("c3's id" + c3.getId());
        System.out.println("创建的圆的个数"+ Circle.getTotal());


    }

}


class Circle{
    private double radius;
    private int id;


    public Circle(){
        id = init++;
        total++;
    }

    public Circle(double radius){
        this();
        this.radius = radius;
    }

    private static int total;
    //static声明的属性被所有对象共享
    private static int init = 1001;

    public double findArea(){
        return 3.14 * radius *radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }
}