package practice.code.oop.recursion;

import org.junit.jupiter.api.Test;

/**
 * 递归方法： 一个方法体内调用它自身
 * 方法递归包含了一种隐式的循环，它会重复执行某段代码，但是这种重读执行无需循环控制
 * 递归一定要向已知方向递归，否则这种递归变成无穷递归
 *
 * Description:
 * date: 2020 2020/8/5 8:39
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class RecursionTest {

    public static void main(String[] args) {
         RecursionTest rt = new RecursionTest();
        System.out.println(rt.sum(100));
    }
    public int sum(int num){
        if(num == 1){
            return 1;
        }else{
            return num + sum(num -1);
        }
    }

}
