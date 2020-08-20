package practice.code.oop.objectArray;

/**
 * Description:
 * date: 2020 2020/8/5 13:08
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class Bank {

    private Customer[] customers;//存放多个客户的数组
    private  int numOfCustomers; //记录客户个数

    public Bank(){
          customers = new Customer[10];
    }

    public void addCustomer(String firstName, String lastName){
         Customer cust = new Customer(firstName,lastName);
         customers[numOfCustomers] = cust;
         numOfCustomers++;
    }

    public Customer getCustomer(int index) {
        // return customers[index]; 欠妥可能發生異常
        if(index >=0 && index < numOfCustomers){
            return customers[index];
        }
        return null;
    }

    public int getNumOfCustomers() {
        return numOfCustomers;
    }
}
