
import java.util.LinkedList;
import java.util.List;

public class Customer {
    String firstName;
    String lastName;
    int pin;
    // This is the different data structure you asked me to make.
    private List<Account> accountList = new LinkedList<>();

    public Customer(String firstName, String lastName, int pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public void removeAccount(Account account) {
        accountList.remove(account);
    }

    public Account getAccount(int accountNumber) {
        Account foundAccount = null;
        for (Account account : accountList) {
            if (account.getAccountNumber() == accountNumber) {
                foundAccount = account;
                break;
            }
        }
        return foundAccount;
    }

    public List<Account> getAllAccounts() {
        return accountList;
    }

    public int getPin() {
        return pin;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s\nPIN: %d\n", firstName, lastName, pin);
    }
}
