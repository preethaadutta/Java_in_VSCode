//Two methods of writing programs:-
//OOP- Object Oriented Programming
//POP- Procedural Oriented Programming

//class:- a class is a blueprint for creating objects.
//object:- an object is an instantiatian of a class. Memory is allocated only after object instantiation.
//noun-Class-Employee
//adjective-Attributes-
//

/*
Pillars of OOPs-
i) Abstraction:- Hiding internal details[show only essential information]
 Ex:- Use a phone without bothering about how it is working
ii) Encapsulation:- The act of putting various components together(in a capsule).
 Ex:- Laptop is a single entity with wifi+speaker+camera+storage in a single box
      In java we encapsulate different types of methods inside a class.
iii) Inheritance:- The act of deriving new things with new features from existing things
 Ex:- From Phone we can make Smart Phone
iv) Polymorphism:- One entity many forms or many behaviour
 Ex:- From Smart Phone we can use as Calculator, we can use as Camera
 */
//package com.company;
class Employee
{
    //id,name are two attributes
    int id;
    String name;
    int salary;
    public void printDetails() //defining method
    { //method body
        System.out.println("Id of the 1st employee is: "+id);
        System.out.println("His name is: "+name);
    }
    public int getSalary() //defining method
    { //method body
        return salary;
    }
}
public class Oops1 //in one java file one public access modifier can be there
{
    public static void main(String[] args)
    {
        //Instantiating or creating objects of the Employee class
        //<Class name> <object name>=new <Classname()>; //Syntax to make an object
        Employee employee1=new Employee();
        Employee employee2=new Employee();
        //setting attributes or properties
        employee1.id=1;
        employee1.name="Raju";
        employee1.salary=500;
        employee2.id=2;
        employee2.name="Raja";
        employee2.salary=400;
        //calling printDetails() method
        employee1.printDetails();
        employee2.printDetails();
        //after calling getSalary() method as it is returning int type value so we've to store that in a variable
        int salary1=employee1.getSalary();
        int salary2=employee2.getSalary();
        //printing the attributes or properties
        //System.out.println(employee1.id);
        //System.out.println(employee1.name);
        System.out.println("Salary of 1st employee is:"+salary1);
        System.out.println("Salary of 2nd employee is:"+salary2);
    }
}
