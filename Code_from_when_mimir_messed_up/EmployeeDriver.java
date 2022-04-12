public class EmployeeDriver {
    public static void main(String[] args){
        // Employee emp1 = new Employee();
        // Employee emp2 = new Employee("Jones", "Betty", "6/5/1958", "111-22-3333", "T000543871");

        CommissionEmployee ce1 = new CommissionEmployee("Jones", "Casey", "4/5/1982", "222-33-4444", 
                                                        "T000765983", 29000, .04);

        
        BasePlusCommissionEmployee bce1 = new BasePlusCommissionEmployee("Jones", "Indiana", "8/15/1991", "333-44-5555",
                                                                         "T000123765", 32000.0, .03, 2500.0);
        HourlyEmployee he1 = new HourlyEmployee("Jones", "Betty", "6/5/1958", "111-22-3333", "T000543871", 39.78, 22.72);
        SalariedEmployee se1 = new SalariedEmployee("Jones", "Hannibal", "6/4/1995", "555-66-7777", "T00374652", 5234.16);
        Invoice i1 = new Invoice(47.56);
        Invoice i2 = new Invoice(22.37);
        // System.out.println("emp1 data: " + emp1);
        // System.out.println("emp2 data: " + emp2);
        // System.out.println("ce1 data: " + ce1);
        // System.out.println("bce1 data: " + bce1);
        // System.out.println("he1 data: " + he1);
        // System.out.println("se1 data: " + se1);
        Employee[] employees = new Employee[4];
        employees[0] = ce1;
        employees[1] = bce1;
        employees[2] = he1;
        employees[3] = se1;
        for(int i = 0; i < employees.length; i++){
            printCheck(employees[i]);
        }

        Taxable[] taxEvents = new Taxable[6];
        taxEvents[0] = ce1;
        taxEvents[1] = bce1;
        taxEvents[2] = he1;
        taxEvents[3] = se1;
        taxEvents[4] = i1;
        taxEvents[5] = i2;

        for(Taxable t : taxEvents){
            printTax(t);
        }

        System.out.println("Code ran!");
    }

    private static void printTax(Taxable t){
        System.out.println(t.calcTax());
    }

    private static void printCheck(Employee e){
        System.out.print(e);
        System.out.printf("Earnings: $%.2f%n", e.earnings());
        System.out.println();
    }
}
