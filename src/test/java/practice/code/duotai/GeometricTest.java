package practice.code.duotai;

/**
 * Description:
 * date: 2020 2020/8/7 14:47
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class GeometricTest {
    public static void main(String[] args) {
           GeometricTest test = new GeometricTest();
           Circle c1 = new Circle(2.3,"white",1.0);
           test.displayGeometricObject(c1);

        Circle c2 = new Circle(3.3,"white",1.0);
        test.displayGeometricObject(c2);

    }


    public boolean equalsArea(GeometricObject o1,GeometricObject o2){
        return o1.findArea() == o2.findArea();
    }

    public void displayGeometricObject(GeometricObject o ){
        System.out.println(o.getColor());
        System.out.println(o.getWeight());
        if(o instanceof Circle){
            System.out.println(((Circle) o).getRadius());
        }
        System.out.println(o.findArea());
    }
}
