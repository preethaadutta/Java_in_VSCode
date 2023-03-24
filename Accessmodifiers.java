//Access Modifier:- it specifies where a property or method is accessible this means
//if we are doing inheritance or we're trying to access the properties of this class from
//another class then we can do that directly or not.
//Types of Access Modifiers:-
//1) Private- to make any property or method private we use Private keyword
//2) Default- to make any property or method default we need not to write any keyword
//3) Protected- to make any property or method protected we use Protected keyword
//4) Public- to make any property or method public we use Public keyword

//package com.company;
//as Employee class is already there in this package so we'll keep class name as Employee1
class Employee1
{
    private int id; //as this attribute is private so we can't access directly we've to access these after
    //creating a method and by this process we implement Data Hiding
    private String name;
    //creating Setters- Setters will always take argument and return nothing
    //syntax of creating Setters-
    //<access modifier><void><setMethod name>(<data type of the variable><variable name>)
    public void setId(int i)
    {
        id=i; //this.id=i; //same
    }
    public void setName(String n)
    {
        name=n; //this.name=n; //same
    }
    //creating Getters- Getters will not take anything but always return something
    //syntax of creating Getters-
    //<access modifier><returntype><getMethod name>()
    public int getId()
    {
        return id; //return variable
    }
    public String getName()
    {
        return name;
    }
}
public class Accessmodifiers
{
    public static void main(String[] args)
    {
        //Instantiating or creating objects of the Employee class
        //<Class name> <object name>=new <Classname()>; //Syntax to make an object
        Employee1 employee1=new Employee1();
        Employee1 employee2=new Employee1();
        //Below lines will throw error due to private access modifier
        //setting attributes or properties
        //employee1.id=1;
        //employee1.name="Raju";
        //employee2.id=2;
        //employee2.name="Raja";
        //to avoid that error we'll set attributes like this-
        employee1.setId(1);
        employee1.setName("Raju");
        employee2.setId(2);
        employee2.setName("Raja");
        //displaying the values
        System.out.println(employee1.getId());
        System.out.println(employee1.getName());
        System.out.println(employee2.getId());
        System.out.println(employee2.getName());
    }
}
