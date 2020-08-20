package practice.code.arraytest.day2;

/**
 * Description:
 * date: 2020 2020/8/4 22:17
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class ValueTransferTest2 {
    public static void main(String[] args) {
        Data data = new Data();
        data.m = 10;
        data.n = 20;

        ValueTransferTest2 test = new ValueTransferTest2();
        test.swap(data);

        System.out.println("m="+data.m
        +",n="+data.n);
    }
    public void swap(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }

}

class Data{
    int m;
    int n;
}