package practice.code.arraytest.day2;

/**
 * Description: 可变形参
 * date: 2020 2020/8/4 17:13
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest ma = new MethodArgsTest();
        System.out.println(ma.show());
        System.out.println(ma.show("aaa"));
        System.out.println(ma.show("aa", "bb"));

    }

    // 可变个数形参 只能声明在方法参数末尾
    public String show(String ... pars){

        for(int i=0;i<pars.length;i++){
            System.out.println(pars[i]);
        }
        return "show(String... pars)";
    }

//    public String show(String[] pars){
//        return "show(String... pars)";
//    }
}
