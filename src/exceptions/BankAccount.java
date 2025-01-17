package exceptions;

@SuppressWarnings("serial")
class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(String message) {
     super(message);
 }
}

public class BankAccount {
 private double balance;

 public BankAccount(double balance) {
     this.balance = balance;
 }

 public void withdraw(double amount) throws InsufficientBalanceException {
     if (amount > balance) {
         throw new InsufficientBalanceException("Insufficient balance in your account.");
     }
     balance -= amount;
     System.out.println("Withdrawal successful. Remaining balance: " + balance);
 }

 public static void main(String[] args) {
     BankAccount account = new BankAccount(1000.0);
     try {
         account.withdraw(1500.0);
     } catch (InsufficientBalanceException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}
