//package com.company;
public class Supercode
{

}
/*
//Without using 'super' keyword:-

class Employee
{
    int s=50;
    public void salary()
    {
        System.out.println("Salary of Employee class");
    }
}
class Engineer extends Employee
{
    int s=80;
    public void salary()
    {
        System.out.println("Salary of Engineer class");
    }
}
public class Main
{
	public static void main(String[] args)
	{
	    Employee e1=new Employee();
	    Engineer e2=new Engineer();
	    System.out.println("Salary of all Employees:"+e1.s); //Salary of all Employees:50
	    System.out.println("Salary of all Engineers:"+e2.s); //Salary of all Engineers:80
	    e1.salary(); //Salary of Employee class
	    e2.salary(); //Salary of Engineer class
	}
}

//==================================================================================================//

//Using 'super' keyword:- to refer immediate parent class instance variable

class Employee
{
    int s=50;
}
class Engineer extends Employee
{
    int s=80;
    public void salary()
    {
        System.out.println(s); //80 will be printed as local variable has higher priority than global
        System.out.println(super.s); //50 will be printed as 'super' is used to refer immediate parent
        //class instance variable
    }
}
public class Main
{
	public static void main(String[] args)
	{
	    Engineer e1=new Engineer();
	    e1.salary();
	}
}

//==================================================================================================//

//Using 'super' keyword:- to invoke immediate parent class method

class Employee
{
    int s=50;
    public void salary()
    {
        System.out.println("Salary of Employee class");
    }
}
class Engineer extends Employee
{
    int s=80;
    public void salary()
    {
        System.out.println("Salary of Engineer class");
    }
    public void printsalary()
    {
        salary(); //Salary of Engineer class will be printed as local method has higher priority than global
        super.salary(); //Salary of Employee class will be printed as 'super' is used to invoke immediate parent class method
    }
}
public class Main
{
	public static void main(String[] args)
	{
	    Engineer e1=new Engineer();
	    e1.printsalary();
	}
}

//==================================================================================================//

//Without using 'super' keyword:- to invoke Parent class and Child class constructors

class Employee
{
    int s=50;
    public void Employee()
    {
        System.out.println("Salary of Employee class");
    }
}
class Engineer extends Employee
{
    int s=80;
    public void Engineer()
    {
        System.out.println("Salary of Engineer class");
    }
    public void printsalary()
    {
        Employee(); //Salary of Employee class will be printed
        //as for constructor there are different names of the constructor method
        Engineer(); //Salary of Engineer class will be printed
        //as for constructor there are different names of the constructor method
    }
}
public class Main
{
	public static void main(String[] args)
	{
	    Engineer e1=new Engineer();
	    e1.printsalary();
	}
}

//==================================================================================================//

//correct use of 'super()':-

class Employee
{
    int s=50;
    public void Employee()
    {
        System.out.println("Salary of Employee class");
    }
}
class Engineer extends Employee
{
    int s=80;
    public void Engineer()
    {
        System.out.println("Salary of Engineer class");
    }
    public void printsalary()
    {
        super(); //error will be occured as 'super' must be first statement in constructor method
        Engineer();
    }
}
public class Main
{
	public static void main(String[] args)
	{
	    Engineer e1=new Engineer();
	    e1.printsalary();
	}
}

//==================================================================================================//

//Using 'super' keyword:- to invoke Parent class constructor

class Employee
{
    int s=50;
    public Employee()
    //Employee() //same
    {
        System.out.println("Salary of Employee class");
    }
}
class Engineer extends Employee
{
    int s=80;
    public Engineer()
    //Engineer() //same
    {
        super(); //Salary of Employee class
        System.out.println("Salary of Engineer class"); //Salary of Engineer class
    }
}
public class Main
{
	public static void main(String[] args)
	{
	    Engineer e1=new Engineer(); //after creating object those constructor methods will be called
	    //automatically we've not to call constructor method explicitly
	}
}

//==================================================================================================//

*/