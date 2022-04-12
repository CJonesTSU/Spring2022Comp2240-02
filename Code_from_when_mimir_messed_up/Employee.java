public abstract class Employee extends Object{
    private String lastName;
    private String firstName;
    private String dateOfBirth;
    private String SSN;
    private String employeeNumber;

    public Employee(){
        lastName = "";
        firstName = "";
        dateOfBirth = "";
        SSN = "";
        employeeNumber = "";
    }

    public Employee(String lastName, String firstName, String dateOfBirth, String SSN, String employeeNumber){
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.SSN = SSN;
        this.employeeNumber = employeeNumber;
    }

    // abstract method must be implemented in every class that inherets from Employee
    public abstract double earnings();

    @Override
    public String toString(){
        // String temp = "";
        // temp = String.format("%s, %s%n", lastName, firstName);
        // temp += String.format("Date of birth: %s%n", dateOfBirth);
        // temp += String.format("Social Security Number: %s%n", SSN);
        // temp += String.format("Employee Number: %s%n", employeeNumber);
        return String.format("%s, %s%nDate of birth: %s%nSocial Security Number: %s%nEmployee Number: %s%n", 
                              lastName, firstName, dateOfBirth, SSN, employeeNumber);
    }
}