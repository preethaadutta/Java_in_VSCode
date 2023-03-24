/*Take reference from javatpoint
Polymorphism:- 'Poly' means 'many' 'Morphism' means 'behavior'
 'same function name but body of the functions are different'
Two types of Polymorphism:-
1) Compile Time Polymorphism or Static Binding or Early Binding:- If which function to invoke is decided in
compile time then it is called Compile Time Polymorphism or Static Binding.Here the function calling statement is
attached with the function body in compile time and which function to invoke is decided by method signature.
Types of Compile Time Polymorphism or Static Binding or Early Binding:-
   a) Method Overloading:- When in one class, two or more methods have same names but have different number
   of parameters or different datatypes of parameters.This is called Method Overloading.
   Constructor overloading is possible because within a class constructor has same name that of the class name.
   b) Method Overriding:- When in different class, two or more methods have same names. I mean Child class
   overrides or redefines the methods of Parent class.
   'super' keyword is used to access the variables or methods of the Parent class. Super is used in the 1st line.
   Constructor overriding is not possible because each class will contain different names constructor
2) Run Time Polymorphism or Dynamic Binding or Late Binding or Dynamic Method Dispatch:- In runtime polymorphism
the method calling statements for all methods of different classes remain same but in runtime depending on the
object of which class the referring object is referencing decides which method is to invoke.
*/

//1) Compile Time Polymorphism or Static Binding or Early Binding:-
//a) Method Overloading:- Methods having different number of parameters
//package com.company;
class Areacalculation
{
    int Area(int a, int b)
    {
        return a*b;
    }
    int Area(int a)
    {
        return a*a;
    }
}
public class PolymorphismMams1
{
    public static void main(String[] args)
    {
        Areacalculation a1=new Areacalculation();
        System.out.println("Area of rectangle="+a1.Area(2, 4));
        System.out.println("Area of square="+a1.Area(4));
    }
}
//a) Method Overloading:- Methods having different datatypes of parameters
/*
class Areacalculation
{
    int Area(int a,int b)
    {
        return a*b;
    }
    double Area(double a,double b)
    {
        return a*b;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Areacalculation a1=new Areacalculation();
        System.out.println("Area of 1st rectangle="+a1.Area(2, 4));
        System.out.println("Area of 2nd rectangle="+a1.Area(1.2,2.1));
    }
}
*/

/*
//Q) Can we overload java main() method?
Ans:- Yes
public class Main
{
    public static void main()
    {
        System.out.println("This is the 3rd main method");
    }
    public static void main(String[] args)
    {
        System.out.println("This is the 1st main method");
    }
    public static void main(String args)
    {
        System.out.println("This is the 2nd main method");
    }
}
*/

/*
//Constructor Overloading:- When in one class, more than one constructor is present that have different
number of parameters or different datatypes of parameters.This is called Constructor Overloading.
//a) Constructor Overloading:- Constructors having different number of parameters
class Areacalculation
{
    void Areacalculation(int a, int b)
    {
        int result=a*b;
        System.out.println("Area of rectangle="+result);
    }
    void Areacalculation(int e)
    {
        int result=e*e;
        System.out.println("Area of square="+result);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Areacalculation a1=new Areacalculation();
        Areacalculation a2=new Areacalculation();
        a1.Areacalculation(1,2);
        a2.Areacalculation(5);
    }
}
//a) Constructor Overloading:- Constructors having different datatypes of parameters
class Areacalculation
{
    void Areacalculation(int a, int b)
    {
        int result=a*b;
        System.out.println("Area of rectangle="+result);
    }
    void Areacalculation(double e,double f)
    {
        double result=e*f;
        System.out.println("Area of square="+result);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Areacalculation a1=new Areacalculation();
        Areacalculation a2=new Areacalculation();
        a1.Areacalculation(1,2);
        a2.Areacalculation(5.1,1.5);
    }
}
*/
