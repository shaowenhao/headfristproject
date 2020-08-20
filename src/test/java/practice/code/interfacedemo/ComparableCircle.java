package practice.code.interfacedemo;

/**
 * Description:
 * date: 2020 2020/8/11 14:01
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class ComparableCircle extends  Circle implements CompareObject{

    public ComparableCircle(double radius){
        super(radius);
    }

    public int compareTo(Object o) {
        if(this == o)
        {
            return 0;
        }
        if(o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle) o;
            //强转精度损失
           // return (int) (this.getRadius() - c.getRadius());

//        方式一
//           if(this.getRadius() > c.getRadius()){
//               return 1;
//           }else if(this.getRadius() < c.getRadius()){
//               return -1;
//           }else{
//               return 0;
//           }
         return this.getRadius().compareTo(((ComparableCircle) c).getRadius());

        }else{
             //
            throw new RuntimeException("传入的数据类型不匹配");
        }
      //  return 0;
    }
}
