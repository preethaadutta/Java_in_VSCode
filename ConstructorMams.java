/*
//Constructor: Constructor is a special method or member function that is used to initialize an object
   while creating it.Constructor name will be same as class name.
//2 types of Constructor:-
1) Parameterized Constructor:- Constructor which has parameter within it
2) Non-Parameterized Constructor:- Constructor which has no parameter within it
//Overloading: it means same names in the same class
//Overriding: it means same names in the different classes
//Constructor Overloading: If in a class, there more than one constructors are present then it is called
   constructor overloading.As in one class so the names of constructors will also be same.In Constructor
   Overloading, the constructors will take different number of parameters or different datatypes parameters
   within it.
//Constructor Overriding: it is not possible.As constructor name will be same as class name so same name
   constructors can't be present in different classes.
*/
//package com.company;
class Employee6
{
    int employeeid;
    String employeename;
    int employeesalary;
    String employeerole;
    String employeeaddress;
    Employee6(int i,String n) //Employee6() is a constructor so it has same name of the classname
            //Employee6() is Parameterized Constructor
    {
        employeeid=i;
        employeename=n;
    }
    Employee6(int s,String r,String a) //constructor overloading
    //Employee6() is Parameterized Constructor
    {
        employeesalary=s;
        employeerole=r;
        employeeaddress=a;
    }
    void display()
    {
        System.out.println("id of the employee:"+employeeid);
        System.out.println("name of the employee:"+employeename);
    }
    //void display() //same methodname it'll give error
    void show()
    {
        System.out.println("salary of the employee:"+employeesalary);
        System.out.println("role of the employee:"+employeerole);
        System.out.println("address of the employee:"+employeeaddress);
    }
}
public class ConstructorMams
{
    public static void main(String[] args)
    {
        Employee6 e1=new Employee6(115,"Rajib");
        Employee6 e2=new Employee6(120,"Raju");
        e1.display();
        e2.display();
        Employee6 e3=new Employee6(200,"Engineer","ABC Road");
        Employee6 e4=new Employee6(500,"Manager","BCD Road");
        e3.show();
        e4.show();
    }
}
/*
output:
id of the employee:115
name of the employee:Rajib
id of the employee:120
name of the employee:Raju
salary of the employee:200
role of the employee:Engineer
address of the employee:ABC Road
salary of the employee:500
role of the employee:Manager
address of the employee:BCD Road
*/
//========================================================================================================//
/*
public class ConstructorMams
{
    public static void main(String[] args)
    {
        Employee6 e1=new Employee6(115,"Rajib");
        Employee6 e3=new Employee6(200,"Engineer","ABC Road");
        Employee6 e2=new Employee6(120,"Raju");
        Employee6 e4=new Employee6(500,"Manager","BCD Road");
        e1.display();
        e3.show();
        e2.display();
        e4.show();
    }
}
*/
/*
output:
id of the employee:115
name of the employee:Rajib
salary of the employee:200
role of the employee:Engineer
address of the employee:ABC Road
id of the employee:120
name of the employee:Raju
salary of the employee:500
role of the employee:Manager
address of the employee:BCD Road
*/
//======================================================================================================//
/*
public class ConstructorMams
{
    public static void main(String[] args)
    {
        Employee6 e1=new Employee6(115,"Rajib");
        e1=new Employee6(200,"Engineer","ABC Road");
        e1.display();
        e1.show();
        Employee6 e2=new Employee6(120,"Raju");
        e2=new Employee6(500,"Manager","BCD Road");
        e2.display();
        e2.show();
    }
}
*/
/*
output:
id of the employee:0
name of the employee:null
salary of the employee:200
role of the employee:Engineer
address of the employee:ABC Road
id of the employee:0
name of the employee:null
salary of the employee:500
role of the employee:Manager
address of the employee:BCD Road
*/
//====================================================================================================//

