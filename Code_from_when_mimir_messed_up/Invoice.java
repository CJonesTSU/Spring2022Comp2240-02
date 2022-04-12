public class Invoice implements Taxable{
    private double amount;
  
    public Invoice(){
        amount = 0.0;
    }

    public Invoice(double amount){
        this.amount = amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }

    public double calcTax(){
        return amount * 0.05;
    }
}
