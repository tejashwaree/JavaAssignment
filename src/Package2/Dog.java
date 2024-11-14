package Package2;

public class Dog extends Animal{
    // Instance variables can be accessed without dot operator(ND), but not private variable
    public void animal(){
        name = "Fox";
        //age = 3; ////can not be accessed without dot operator as it is private , can be accessed in that class only
        gender = "Male";
        id= 1;
    }

    //// Instance variables can be accessed with dot operator(D), but not private variable
    public void animal2(){
        Animal a = new Animal();
        a.name = "Bear";
        //a.age = 13; ////can not be accessed with dot operator as it is private , can be accessed in that class only
        a.gender = "Female";
        a.id= 2;
    }
}
