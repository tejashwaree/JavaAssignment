package Package1;

import Package1.Organization;

public class Run {
    public static void main(String[] args) {
        //Q2- create podtest object of Organization class and 5 active employee using constructor of Employee class
        Organization podtest = new Organization(5);
        //provide employee data
        Employee[] emp = new Employee[podtest.noOfEmp];
        emp[0]= new Employee("Ajay", 31, 406000.0F, 1,true);
        emp[1] = new Employee("Masha", 26, 350900.8F, 2,true);
        emp[2] = new Employee("Neha", 29, 356700.5F, 3,true);
        emp[3] = new Employee("Mahi", 25, 658000.29F, 4, true);
        emp[4] = new Employee("Teju", 35, 807400.9F, 5,true);
        podtest.employees = emp;
       //Q5 make one employee as inactive
        emp[2].isActive = false;
        //Q6 Invoke all the methods of organization class and Admin class
        podtest.printEmployeeDetailsAll(emp);

        //Q3 create 'Rohan' As Admin class object
        Admin rohan = new Admin(5);
        System.out.println("--------------------------------------------------");
        System.out.println("Total required Budget  : " + rohan.getTotalRequireBudegt(podtest));
        System.out.println("Total tax calculated : " + rohan.getTotalTaxCalculated(podtest));
        System.out.println("--------------------------------------------------");
        rohan.printTaxAmtPerEmployee(podtest);

    }
}
