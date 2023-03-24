/*
//Object-Oriented Programming: Object-Oriented Programming is a methodology or paradigm to 
design a program using classes and objects.
//Components of OOP:-
1) Class: A class is a blueprint for creating objects.
2) Objects: An Object is an instantiation of the class.When a class is defined a template is 
defined.Memory is allocated only after object instantiation.
3) Data members: means variables
4) Member functions: means methods
//Advantages or features of OOP:-
1) Easy debugging: As in OOP a complex problem is divided into small segments so troubleshooting 
or debugging becomes easier in OOP.
2) Code reusability: Through inheritance we can achieve code reusability in OOP.It is not needed 
to write same block of codes again & again in a program.
3) Code flexibility: Through polymorphism we can achieve code flexibility in OOP.
4) Data security: Through abstraction, complexity is hidden and a limited amount of data is 
shown to the user, it provides data security. Through encapsulation also, the internal contents
of a class is protected from getting accessed by the system.
//4 Main Pillars of OOPs:-
1) Encapsulation
2) Polymorphism
3) Inheritance
4) Abstraction
//1) Encapsulation: Encapsulation is a process of binding or wrapping of data members and member 
functions into a single unit.
Ex: The java class where all the data members are private is the example of fully encapsulated 
class.
*/
//package com.company;
class Employee5 //classname
{
    //employeeid & employeename are the data members
    int employeeid;
    String employeename;
    Employee5(int i,String n) //Employee6() is a constructor so it has same name of the 
    //classname, which is referred by the object.
    //int i & String n parameters which are taken by constructor
    {
        employeeid=i;
        employeename=n;
    }
    void display() //Member function
    {
        System.out.println("ID of the employee is:"+employeeid);
        System.out.println("Name of the employee is:"+employeename);
    }
}
public class EncapsulationMams
{
    //<access modifier> <static> <returntype> <methodname>(String[] args)
    public static void main(String[] args)
    {
        //"new" keyword:-'new' is a memory allocation operator which allocates memory 
        //according to the data members of the class and it returns base address, of 
        //memory allocation, which is reffered by the object.
        //object creation syntax:-
        //<classname> <objectname>=new <constructorname with parameters>;
        Employee5 e1=new Employee5(115,"Rajib");
        Employee5 e2=new Employee5(120,"Raju");
        //Member function calling syntax:-
        //<objectname>.methodname();
        e1.display();
        e2.display();
    }
}

