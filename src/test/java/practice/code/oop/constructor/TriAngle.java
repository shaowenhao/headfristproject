package practice.code.oop.constructor;

/**
 * Description:
 * date: 2020 2020/8/5 10:04
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class TriAngle {

    private double base;
    private double height;

    public TriAngle(){

    }

    public TriAngle(double b, double h){
       base = b;
       height = h;
    }

    public void setBase(double b){
        base = b;
    }

    public double getBase(){
        return base;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

}
