package Package1;

public class Employee {

    public String name;
    public int age;
    private float salaryMonthly;
    public int empId;
    public boolean isActive;

    public Employee(String name, int age, float salary, int empId, boolean isActive){
        this.name = name;
        this.age = age;
        this.salaryMonthly = salary;
        this.empId = empId;
        this.isActive = isActive;
    }

    public float getSalary(){
        return salaryMonthly;

    }
    public void getDeatils(Employee employee){
        String details = null;
        details = "Employee name : "+ employee.name+" Employee id : "+employee.empId+" Employee age : "+employee.age;
        System.out.println(details);

        //return details;
    }

    public float getTaxAmtToBePaid(float salary){
            float tax = 0.0f;
            if(salary >= 100000){
                tax = (salary/5);
                return tax;
            }
            else {
                return  0;
            }
            //return tax;
    }
}
