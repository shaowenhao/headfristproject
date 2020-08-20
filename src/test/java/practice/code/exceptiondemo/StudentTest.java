package practice.code.exceptiondemo;

/**
 * Description:
 * date: 2020 2020/8/12 10:24
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class StudentTest {
    public static void main(String[] args) {

        try {
            Student s = new Student();
            s.regist(-1001);
            System.out.println(s);
        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }


    }
}

class Student{

    private int id;
    public void regist(int id) throws Exception {
        if(id > 0){
            this.id = id;
        }else{
          //  System.out.println("data invalid");
            // 手动抛出异常对象 因为是运行时异常 可以不处理
            //throw new RuntimeException("data invalid");

            //也可以 throw new Exception(),选择regist throws Exception声明，调用regist的代码进行try catch
            throw new Exception("data invalid");
        }
    }
}
