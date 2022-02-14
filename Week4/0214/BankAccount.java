public class BankAccount {
  private double balance;
  
  // Constructors
  public BankAccount(){
    balance = 0.0;
  }
  
  public BankAccount(double startBalance){
    balance = startBalance;
  }
  
  public BankAccount(String str){
    double temp =0.0;
    temp = Double.parseDouble(str);
    balance = temp;
    // balance = Double.parseDouble(str) this is equivalent
  }
  
  // deposit methods
  public void deposit(double amount){
    balance = balance + amount;
    // equivalant
    // balance += amount;
  }
  
  public void deposit(String str){
    double temp =0.0;
    temp = Double.parseDouble(str);
    balance = balance + temp; 
  }
  
  // withdrawls 
  public void withdraw(double amount){
    balance = balance - amount;  
    // or balance -= amount;
  }

  public void withdraw(String str){
    double temp =0.0;
    temp = Double.parseDouble(str);
    balance = balance + temp; 
  }
  
  // Setters
  public void setBalance(double b){
    balance = b;
  }
  public void setBalance(String str){
    double temp =0.0;
    temp = Double.parseDouble(str);
    balance = temp;     
  }
  
  // helper methods
  public double getBalance(){
    return balance;
  }
  
  
  /*
    +setBalance(b:double):void
    +setBalance(str:String):void
  */
  
  
  
  
  
  
  
}