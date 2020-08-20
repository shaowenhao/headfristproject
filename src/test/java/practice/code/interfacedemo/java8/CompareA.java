package practice.code.interfacedemo.java8;

/**
 * Description: jdk8中
 * 除了全局常量和抽象方法之外
 * 还可以定义静态方法 默认方法
 * date: 2020 2020/8/11 14:27
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public interface CompareA {

      public static void method1(){
            System.out.println("CompareA: 北京");
      }

      public default void method2(){
            System.out.println("CompareA: 上海");
      }
}
