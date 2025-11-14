class BankAccount {
    private String accountNumber;
    protected double balance;
    
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    // final метод - нельзя переопределить в подклассах
    public final String getAccountNumber() {
        return accountNumber;
    }
    
    // обычный метод - можно переопределить
    public double getBalance() {
        return balance;
    }
    
    // final метод для критически важной логики
    public final boolean validateAccount() {
        return accountNumber != null && accountNumber.length() == 10;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;
    
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    // можно переопределить обычный метод
    @Override
    public double getBalance() {
        return balance + (balance * interestRate);
    }
    
    
    public void printAccountInfo() {
        System.out.println("номер счета: " + getAccountNumber()); // можно использовать final метод
        System.out.println("баланс с процентами: " + getBalance());
        System.out.println("счет валиден: " + validateAccount()); // можно использовать final метод
    }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("1234567890", 1000, 0.05);
        account.printAccountInfo();
        
        // демонстрация работы final методов
        System.out.println("\nпроверка final методов:");
        System.out.println("номер счета: " + account.getAccountNumber());
        System.out.println("валидация: " + account.validateAccount());
    }
}
