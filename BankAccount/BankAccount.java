package bankaccount;

public class BankAccount {
   private double balance;

   //   Constructor
   public BankAccount()    {
      balance = 0;
   }

  // Make a deposit
   public void deposit(double amount)    {
      balance = balance + amount;
   }
  
  // Make a withdrawal
   public void withdraw(double amount)    {
      balance = balance - amount;
   }

   // Return balance
   public double getBalance()   {
      return balance;
   }
}

