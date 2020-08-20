package practice.code.oop.recursion;

/**
 * Description:
 * date: 2020 2020/8/5 9:02
 *
 * f(0) = 1, f(1) = 4, f(n+2)=2*f(n+1)+f(n) 求f(10)
 *
 * * 递归方法： 一个方法体内调用它自身
 *  * 方法递归包含了一种隐式的循环，它会重复执行某段代码，但是这种重读执行无需循环控制
 *  * 递归一定要向已知方向递归，否则这种递归变成无穷递归
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class RecursionTest2 {
    public static void main(String[] args) {
       RecursionTest2 rt2 = new RecursionTest2();
        System.out.println(rt2.f(10));
    }

    public int f(int n){
        if(n==0){
            return 1;
        }else if(n == 1){
            return 4;
        }else{
            // wrong 写法
            //return f(n+2) - 2 * f(n+1);
            return 2 * f(n-1) + f(n-2);
        }
    }

}
