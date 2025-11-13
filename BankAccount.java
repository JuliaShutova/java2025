public class BankAccount {
    public String accountNumber;
    protected double balance;
    String accountType;
    private String pinCode;
    
    public BankAccount(String number, String type, String pin) {
        accountNumber = number;
        accountType = type;
        pinCode = pin;
        balance = 0.0;
    }
    
    public void showAccountInfo() {
        System.out.println("Счет: " + accountNumber);
        System.out.println("Тип: " + accountType);
        System.out.println("Баланс: " + balance);
    }
    
    protected void addInterest() {
        double interest = balance * 0.05;
        balance += interest;
        System.out.println("Начислены проценты: " + interest);
    }
    
    void changeAccountType(String newType) {
        accountType = newType;
        System.out.println("Тип счета изменен на: " + newType);
    }
    
    private boolean checkPin(String pin) {
        return pinCode.equals(pin);
    }
    
    public boolean withdrawMoney(double amount, String pin) {
        if (checkPin(pin)) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Снято: " + amount);
                return true;
            } else {
                System.out.println("Недостаточно средств");
            }
        } else {
            System.out.println("Неверный PIN-код");
        }
        return false;
    }
    
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("1234567890", "дебетовый", "1234");
        
        myAccount.balance = 1000.0;
        
        myAccount.showAccountInfo();
        myAccount.addInterest();
        myAccount.changeAccountType("премиальный");
        myAccount.withdrawMoney(500, "1234");
        
        myAccount.showAccountInfo();
    }
}

class BankEmployee {
    public void workWithAccount() {
        BankAccount account = new BankAccount("1111222233", "кредитный", "5678");
        
        account.accountNumber = "9999888877";
        account.balance = 5000.0;
        account.accountType = "сберегательный";
        
        account.showAccountInfo();
        account.addInterest();
        account.changeAccountType("инвестиционный");
    }
}