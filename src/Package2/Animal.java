package Package2;

public class Animal {
    public String name;
    private int age;
    protected  String gender;
    int id;

    // Instance variables can be accessed without dot operator(ND)
    public void animal(){
        name = "Fox";
        age = 3;
        gender = "Male";
        id= 1;
    }

    // Instance variables can be accessed with dot operator(D)
    public void animal2(){
        Animal a = new Animal();
        a.name = "Bear";
        a.age = 13;
        a.gender = "Female";
        a.id= 2;
    }
}
