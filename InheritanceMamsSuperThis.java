/*
super keyword:- 'super' keyword is used to access variable or function of immediate parent class.
//In case of Inheritance, the child class constructor invokes the parent class constructor first. If we don't
specify the parent class constructor explicitly then the compiler by default calls the constructor using
'super' keyword.If we don't have a default constructor(parameterized constructor) then we've to explicitly
call the parent class constructor using 'super'.
this keyword:- 'this' keyword is used to refer the invoking object it is used when both the instance variable
and the parameter, with which the instance variable has initialized, has same name.
*/
//difficult and confusing part. if all the syllabus is completed then you can tell mam to explain this again
//package com.company;
class A3
{
    int i=10,a,b;
    A3(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void sum()
    {
        int c=a+b;
        System.out.println("sum="+c);
    }
}
class B3 extends A3
{
    int i=15,x;
    B3(int a,int b,int x)
    {
        super(a,b);
        this.x=x;
    }
    void sub()
    {
        int c= a-b;
        System.out.println("substract="+c);
        System.out.println("x="+i);
        System.out.println("x of parent="+super.i);
    }
}
class C3 extends B3
{
    int y;
    C3(int a,int b,int x,int y)
    {
        super(a,b,x);
        this.y=y;
    }
    void mult()
    {
        int c= a*y;
        System.out.println("multiplication="+c);
    }
}
public class InheritanceMamsSuperThis
{
    public static void main(String[] args)
    {
        C3 c=new C3(10,5,4,3);
        B3 b=new B3(10,8,7);
        b.sub();
        b.sum();
        c.sum();
        c.sub();
        c.mult();
    }
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
//for any further information see javatpoint site uses of super keyword in java
*/
