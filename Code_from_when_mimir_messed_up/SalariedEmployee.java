public class SalariedEmployee extends Employee implements Taxable{
    private double salary;

    public SalariedEmployee(String lastName, String firstName, String dateOfBirth, 
                        String SSN, String employeeNumber, double salary){
        super(lastName, firstName, dateOfBirth, SSN, employeeNumber);
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public double earnings(){
        return salary;
    }

    public double calcTax(){
        return earnings() * .04;
    }

    @Override
    public String toString(){
        return String.format("%sSalary: $%.2f%n", super.toString(), getSalary());
    }

}
