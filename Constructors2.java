//Method Overloading by constructor
//we can overload constructor as many times as we want we've to just give
//different number of parameters each time

//package com.company;
class Employee4
{
    private int id;
    private String name;
    //creating constructor
    public Employee4() //Overloaded constructor
    {
        id=1;
        name="abc";
    }
    //Method overloading with Constructor: again creating constructor and passing parameters to constructor
    public Employee4(String myname,int myid) //Overloaded constructor
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
public class Constructors2
{
    public static void main(String[] args)
    {
        //Instantiating or creating objects of the Employee class
        //<Class name> <object name>=new <Classname()>; //Syntax to make an object
        //giving values of parameters so public Employee4(String myname,int myid) this constructor will be called
        Employee4 employee1=new Employee4("Raju",1);
        Employee4 employee2=new Employee4("Raja",2);
        //displaying the values
        System.out.println(employee1.getId()); //it'll print 1
        System.out.println(employee1.getName()); //it'll print Raju
        System.out.println(employee2.getId()); //it'll print 2
        System.out.println(employee2.getName()); //it'll print Raja
    }
}
//============================================================================================================//
/*
//Method Overloading by constructor
package com.company;
class Employee4
{
    private int id;
    private String name;
    //creating constructor
    public Employee4()
    {
        id=1;
        name="abc";
    }
    //Method overloading with Constructor: again creating constructor and passing parameters to constructor
    public Employee4(String myname,int myid)
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
public class Constructors2
{
    public static void main(String[] args)
    {
        //Instantiating or creating objects of the Employee class
        //<Class name> <object name>=new <Classname()>; //Syntax to make an object
        //not giving values of parameters so public Employee4() this constructor will be called
        Employee4 employee1=new Employee4();
        Employee4 employee2=new Employee4();
        //displaying the values
        System.out.println(employee1.getId()); //it'll print 1
        System.out.println(employee1.getName()); //it'll print Raju
        System.out.println(employee2.getId()); //it'll print 2
        System.out.println(employee2.getName()); //it'll print Raja
    }
}
 */