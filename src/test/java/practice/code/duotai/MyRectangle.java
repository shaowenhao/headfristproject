package practice.code.duotai;

/**
 * Description:
 * date: 2020 2020/8/7 14:45
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class MyRectangle extends GeometricObject {

    private  double width;
    private  double height;

    public MyRectangle(double width, double height, String color, double weight) {
        super(color, weight);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
