public class BasePlusCommissionEmployee extends CommissionEmployee implements Taxable {
    private double basePay;

    public BasePlusCommissionEmployee(){
        // super(); // this is an implicit
        basePay = 0; 
    }

    public BasePlusCommissionEmployee(String lastName, String firstName, String dateOfBirth, 
                                      String SSN, String employeeNumber, double grossSales, 
                                      double commissionPercent, double basePay){
        super(lastName, firstName, dateOfBirth, SSN, employeeNumber, grossSales, commissionPercent);
        this.basePay = basePay;
    }

    public double getBasePay(){
        return basePay;
    }

    public double earnings(){
        return basePay + (getGrossSales() * getCommissionPercent());
    }

    public double calcTax(){
        return earnings() * 0.04;
    }

    @Override
    public String toString(){
        return String.format("%sBase Salary is: $%.2f%n", 
                              super.toString(),getBasePay());
    }
    
}
