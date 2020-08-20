package practice.code.oop.objectArray;

/**
 * Description:
 * date: 2020 2020/8/5 13:08
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class Account {

    private double balance;

    public Account(double init_balance){
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt){
        if(amt > 0){
            balance += amt;
            System.out.println("success");
        }
    }

    public void withdraw(double amt){
        if(balance >= amt){
            balance -= amt;
            System.out.println("success too");
        }
    }
}
