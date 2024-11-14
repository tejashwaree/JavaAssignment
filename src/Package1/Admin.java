package Package1;

public class Admin extends Organization{

    String role;
    public Admin(int noOfEmp) {
        super(noOfEmp);
    }

    public float getTotalRequireBudegt(Organization podtest){
        float totalBudegt =0.0f;
        for(Employee e : podtest.employees) {
            if (e.isActive == true) {
                totalBudegt = totalBudegt + e.getSalary();
            }
        }
        return totalBudegt;
    }

    public float getTotalTaxCalculated(Organization podtest){
        float totalTax = 0.0f;
        for(Employee e : podtest.employees) {
            if (e.isActive == true) {
            float salary = e.getSalary();
            totalTax = totalTax + e.getTaxAmtToBePaid(salary);
        }}
        return totalTax;
    }

    public void printTaxAmtPerEmployee(Organization podtest){
        float tax = 0.0f;
        for(Employee e : podtest.employees) {
            if (e.isActive == true) {
            float salary = e.getSalary();
            tax = e.getTaxAmtToBePaid(salary);
            System.out.println("Tax paid by " + e.name + " is " + tax);
        }}
    }

}
