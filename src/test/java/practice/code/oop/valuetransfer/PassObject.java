package practice.code.oop.valuetransfer;

/**
 * Description:
 * date: 2020 2020/8/5 8:26
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class PassObject {
    public static void main(String[] args) {
          PassObject po = new PassObject();
          Circle c = new Circle();
          po.printAreas(c,5);
          System.out.println("now radius is "+ c.radius);
    }

    public void printAreas(Circle c, int time){
        System.out.println("Radius\t\tArea");
        for(int i=1;i<=time;i++){
            c.radius = i;
            System.out.println(c.radius+"\t\t"+c.findArea());
        }
        c.radius = time + 1;
    }
}
