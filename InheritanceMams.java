/*
Inheritance:- After inheriting Base class from the Derived class, all the variables and methods
which are in the Base class are available in the Derived class but those variables and methods
can be accessed or not from the Derived class that will depend on the access modifiers (public,protected,private)

if access modifier is public then those Base class's variables and methods can be accessed from the Derived class

Java doesn't support Multiple intehitance and Hybrid inheritance but if we want to implement then we've to use
interface.
//Types of Inheritance:- [Pictorial representation is in mam's copy]
1) Single Inheritance:-
2) Multilevel Inheritance:-
3) Hierarchical Inheritance:-
*/
//Single Inheritance:-
//package com.company;
class A1
{
    void sum(int a, int b)
    {
        int c=a+b;
        System.out.println("Sum="+c);
    }
}
class B1 extends A1
{
    void sub(int a, int b)
    {
        int c=a-b;
        System.out.println("Substraction="+c);
    }
}
public class InheritanceMams
{
    public static void main(String[] args)
    {
        B1 b=new B1();
        b.sum(3,4);
        b.sub(4,1);
    }
}
/*
Inheritance mam's assignment:-
write a class called shape which has a method called area which print "area of this shape". Write 2 chile class
triangle and circle of Area.Within each of the child class the area method print the area of the shape.
triangle:- 1/2 * base*height.circle:- 3.14*(rad)2.all the initialization should be done through constructors.

class Shape
{
    void area()
    {
        System.out.println("Area of this Shape");
    }
}
class Triangle_area extends Shape
{
    void area(int base,int height)
    {
        double result=0.5*base*height;
        System.out.println("Area of Triangle="+result);
    }
}
class Circle_area extends Shape
{
    void area(int radius)
    {
        double result=3.14*radius*radius;
        System.out.println("Area of Circle="+result);
    }
}
public class Main
{
	public static void main(String[] args)
	{
	    Shape s=new Shape();
	    Triangle_area a=new Triangle_area();
	    Circle_area c=new Circle_area();
	    s.area();
	    a.area(5,2);
	    c.area(4);
	}
}
*/