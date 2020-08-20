package practice.code.oop.objectArray;

/**
 * Description:
 * date: 2020 2020/8/5 13:34
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class BankTest {
    public static void main(String[] args) {
          Bank bank = new Bank();
          bank.addCustomer("ryan","iris");

          bank.getCustomer(0).setAccount(new Account(2000));
          bank.getCustomer(0).getAccount().withdraw(500);
        System.out.println(bank.getCustomer(0).getAccount().getBalance());
    }
}
