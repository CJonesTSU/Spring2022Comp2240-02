public class BankDriver {
  public static void main(String[] args){
    BankAccount acc1 = new BankAccount();
    BankAccount acc2 = new BankAccount(203.75);
    BankAccount acc3 = new BankAccount("187.23");
    
    System.out.println("acc1 balance is: " + acc1.getBalance());
    System.out.println("acc2 balance is: " + acc2.getBalance());
    System.out.println("acc3 balance is: " + acc3.getBalance());
    
    System.out.println("Deposit test");
    acc1.deposit(45.98);
    acc2.deposit("19.99");
    System.out.println("acc1 after deposit balance is: " + acc1.getBalance());
    System.out.println("acc2 after deposit balance is: " + acc2.getBalance());
    
    
    acc2.withdraw(5.76);
    acc3.withdraw("3.99");
    System.out.println("acc2 after withdraw balance is: " + acc2.getBalance());
    System.out.println("acc3 after withdraw balance is: " + acc3.getBalance());
    
    acc1.setBalance(1.00);
    acc3.setBalance("3.00");
    System.out.println("acc1 after setBalance balance is: " + acc1.getBalance());
    System.out.println("acc3 after setBalance balance is: " + acc3.getBalance());
    
    
    System.out.println("Code ran");
  }
}