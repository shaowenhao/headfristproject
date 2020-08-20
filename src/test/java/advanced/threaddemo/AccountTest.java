package advanced.threaddemo;

/**
 * Description:
 * 银行有一个账户 有2个储户分别向同一个账户存3000.每次1000 存3此，每次存完打印账户余额
 * date: 2020 2020/8/13 16:47
 *
 * 1. 分析是多线程问题 2个储户线程
 * 2. 是够有共享数据？有 账户
 * 3. 是否有线程安全问题？ 有
 * 4. 如何解决线程安全问题？ 同步机制
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
class Account{
   private double balance; //余额

    public Account(double balance){
        this.balance = balance;
    }
     //存钱
    public synchronized void  deposit(double amt){
        if(amt > 0){
            balance += amt;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"存钱成功 余额为"+balance);
        }
    }
}

class Customer extends Thread{
    private  Account acct;

    public Customer(Account acct){
        this.acct = acct;
    }

    @Override
    public void run() {
       for (int i =0;i<3;i++){
             acct.deposit(1000);
       }
    }
}

public class AccountTest {
    public static void main(String[] args) {

        Account acct = new Account(0);
        Customer c1 = new Customer(acct);
        Customer c2 = new Customer(acct);
        c1.setName("c1");
        c2.setName("c2");
        c1.start();
        c2.start();
    }
}


