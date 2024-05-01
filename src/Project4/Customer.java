package Project4;

import java.util.LinkedList;
import java.util.List;

public class Customer {
    String firstName;
    String lastName;
    int pin;
    // This is the different data structure you asked me to make.
    private List<IAccount> accountList = new LinkedList<>();

    public Customer(String firstName, String lastName, int pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }

    public void addAccount(IAccount account) {
        accountList.add(account);
    }

    public void removeAccount(IAccount account) {
        accountList.remove(account);
    }

    public IAccount getAccount(int accountNumber) {
        IAccount foundAccount = null;
        for (IAccount account : accountList) {
            if (account.getAccountNumber() == accountNumber) {
                foundAccount = account;
                break;
            }
        }
        return foundAccount;
    }

    public List<IAccount> getAllAccounts() {
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
