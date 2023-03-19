

/**
   A bank account has a balance and a mechanism for applying interest or fees at 
   the end of the month.
*/
public class BankAccountTester
{
    public static void main(String[] args)
    {
        //E3.3
        BankAccountTester myAccount = new BankAccountTester();
        myAccount.deposit(1000);
        myAccount.withdraw(500);
        myAccount.withdraw(400);
        System.out.println("Expected: 100");
        System.out.println("Output: " + myAccount.getBalance());
       //E3.4 
       myAccount.addInterest(10);
    }
  
   
   private double balance;

   
   /**
      Constructs a bank account with zero balance.
   */
   public BankAccountTester()
   {
      balance = 0;
   }

   /**
      Constructs a bank account with an initial balance.
   */
   public void BankAccount2(double initialBalance)
   {
      balance = initialBalance;
   }

   /**
      Makes a deposit into this account.
      @param amount the amount of the deposit
   */
   public void deposit(double amount)
   {
      balance = balance + amount;
   }
   
   /**
      Makes a withdrawal from this account, or charges a penalty if
      sufficient funds are not available.
      @param amount the amount of the withdrawal
   */
   public void withdraw(double amount)
   {
      balance = balance - amount;
   }
   /** 
      Carre 
    */
   public void addInterest(double rate)
   {
       balance = balance - ((balance * rate)/100);
   }
   
   /**
      Carries out the end of month processing that is appropriate
      for this account.
   */
   public void monthEnd() 
   {
   }
   
   /**
      Gets the current balance of this bank account.
      @return the current balance
   */
   public double getBalance()
   {
      return balance;
   }
}

