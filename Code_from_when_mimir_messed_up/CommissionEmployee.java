public class CommissionEmployee extends Employee implements Taxable {
    private double grossSales;
    private double commissionPercent;

    public CommissionEmployee(){
        // super();
        grossSales = 0.0;
        commissionPercent = 0.0;
    }

    public CommissionEmployee(String lastName, String firstName, String dateOfBirth, 
                              String SSN, String employeeNumber, double grossSales, double commissionPercent){
        super(lastName, firstName, dateOfBirth, SSN, employeeNumber);
        this.grossSales = grossSales;
        this.commissionPercent = commissionPercent;
    }
    
    // getters
    public double getGrossSales(){
        return grossSales;
    }

    public double getCommissionPercent(){
        return commissionPercent;
    }

    public double earnings(){
        return grossSales * commissionPercent;
    }

    public double calcTax(){
        return earnings() * 0.03;
    }

    @Override
    public String toString(){
        return String.format("%sGross Sales: $%.2f%nCommission Percentage: %.2f%n", 
                             super.toString(), getGrossSales(), getCommissionPercent());
    }

    
}
