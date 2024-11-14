package Package1;

public class Organization  {
    public int noOfEmp;
    Employee[] employees;

    public Organization(int noOfEmp){
        this.noOfEmp = noOfEmp;
        employees= new Employee[noOfEmp];
    }

    public void printEmployeeDetailsAll(Employee[] employees){
        for(Employee e : employees){
            ;
            e.getDeatils(e);
        }

    }
}