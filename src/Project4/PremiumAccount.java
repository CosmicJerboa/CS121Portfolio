package Project4;

//inheritance you asked me to make
public class PremiumAccount extends Account {
    public PremiumAccount(double intialDeposit) {
        super(intialDeposit);
    }
    @Override
    public String toString() {
        return String.format("PREMIUM Account Number: %d\nBalance: %.2f\n",accountNumber, balance);
    }

}
