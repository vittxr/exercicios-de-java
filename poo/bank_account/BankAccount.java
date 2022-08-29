import java.util.Arrays;
import java.util.List;

public class BankAccount {
    private String accNumber;
    private String name;
    private float balance;

    public BankAccount(String accNumber, String name, float balance) {
        this.accNumber = accNumber; 
        this.name = name;
        this.balance = balance;
    }
   
    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public String getName() {
        return name; 
    }

    public String setName(String name) {
        return this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public float setBalance(float value, String bankAction) {
        if (bankAction == "deposito") {
            return this.balance += value;
        } 
        return this.balance -= value;
    }

    public List<String> getBankAccountData() {
        String[] accountData = {accNumber, name, Float.toString(balance)};
        return Arrays.asList(accountData);
    }
}