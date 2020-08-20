package practice.code.duotai;

/**
 * Description:
 * date: 2020 2020/8/7 14:43
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class Circle extends GeometricObject {

    private double radius;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public Circle(double radius, String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return 3.14 * radius * radius;
    }


}
