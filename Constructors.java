//Constructor:- A member function used to initialize an object while creating it
//package com.company;
class Employee2
{
    private int id; //as this attribute is private so we can't access directly we've to access these after
    //creating a method and by this process we implement Data Hiding
    private String name;
    //creating constructor
    //constructor is a function or method which has same name to the Classname
    //constructor can be invoked automatically while we create object of that class
    //we need not to invoke the constructor method explicitly
    //constructor has no return value
    public Employee2()
    {
        id=1;
        name="abc";
    }
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
public class Constructors
{
    public static void main(String[] args)
    {
        //Instantiating or creating objects of the Employee class
        //<Class name> <object name>=new <Classname()>; //Syntax to make an object
        Employee2 employee1=new Employee2();
        Employee2 employee2=new Employee2();
        /*
        //setting attributes-
        employee1.setId(1);
        employee1.setName("Raju");
        employee2.setId(2);
        employee2.setName("Raja");
         */
        //now displaying the values from constructor
        System.out.println(employee1.getId()); //it'll print 1
        System.out.println(employee1.getName()); //it'll print abc
        System.out.println(employee2.getId()); //it'll print 1
        System.out.println(employee2.getName()); //it'll print abc
    }
}
