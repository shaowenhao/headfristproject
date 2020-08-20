package practice.code.duotai;

/**
 * Description:
 * date: 2020 2020/8/7 14:40
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public double findArea(){
        return 0.0;
    }

}
