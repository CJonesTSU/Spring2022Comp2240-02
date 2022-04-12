public class HourlyEmployee extends Employee implements Taxable{
    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(String lastName, String firstName, String dateOfBirth, 
                          String SSN, String employeeNumber, double hoursWorked,
                          double hourlyRate){
        super(lastName, firstName, dateOfBirth, SSN, employeeNumber);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    public double getHoursWorked(){
        return hoursWorked;
    }

    public double getHourlyRate(){
        return hourlyRate;
    }
    @Override
    public double earnings(){
        return hoursWorked * hourlyRate;
    }
    
    public double calcTax(){
        return earnings() * .04;
    }
    
    

    
    @Override
    public String toString(){
        return String.format("%sHours worked: %.2f%nHourly pay rate: $%.2f%n",
                            super.toString(),getHoursWorked(), getHourlyRate());
    }

}
