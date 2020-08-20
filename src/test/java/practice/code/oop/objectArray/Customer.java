package practice.code.oop.objectArray;

/**
 * Description:
 * date: 2020 2020/8/5 13:08
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;


    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
