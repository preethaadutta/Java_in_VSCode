//constructor with parameters
//package com.company;
class Employee3
{
    private int id; //as this attribute is private so we can't access directly we've to access these after
    //creating a method and by this process we implement Data Hiding
    private String name;
    //creating constructor
    //constructor is a function or method which has same name to the Classname
    //constructor can be invoked automatically while we create object of that class
    //we need not to invoke the constructor method explicitly
    //constructor has no return value
    public Employee3(String myname,int myid) //passing parameters to constructor
    {
        id=myid;
        name=myname;
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
public class Constructors1
{
    public static void main(String[] args)
    {
        //Instantiating or creating objects of the Employee class
        //<Class name> <object name>=new <Classname()>; //Syntax to make an object
        Employee3 employee1=new Employee3("Raju",1); //giving values of parameters
        Employee3 employee2=new Employee3("Raja",2); //giving values of parameters
        /*
        //setting attributes-
        employee1.setId(1);
        employee1.setName("Raju");
        employee2.setId(2);
        employee2.setName("Raja");
         */
        //displaying the values
        System.out.println(employee1.getId()); //it'll print 1
        System.out.println(employee1.getName()); //it'll print Raju
        System.out.println(employee2.getId()); //it'll print 2
        System.out.println(employee2.getName()); //it'll print Raja
    }
}
