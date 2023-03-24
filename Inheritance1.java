/*
Inheritance:- After inheriting Base class from the Derived class, all the variables and methods
which are in the Base class are available in the Derived class but those variables and methods
can be accessed or not from the Derived class that will depend on the access modifiers (public,protected,private)

if access modifier is public then those Base class's variables and methods can be accessed from the Derived class

Java doesn't support Multiple intehitance and Hybrid inheritance
*/

//package com.company;
class Base //Base or Parent class or Super class
{
    int x;
    //public int x; //line 5 and 6 same
    //creating getters
    public int getX()
    {
        return x;
    }
    //creating setters
    public void setX(int x)
    {
        System.out.println("I'm in Base and setting x now");
        this.x=x;
    }
    public void printMe()
    {
        System.out.println("I'm a constructor");
    }
}
class Derived extends Base //Derived or Child class or Subclass
{
    int y;
    //public int y; //line 25 and 26 same
    //creating getters
    public int getY()
    {
        return y;
    }
    //creating setters
    public void setY(int y)
    {
        this.y=y;
    }
    public void printMe()
    {
        System.out.println("I'm a constructor");
    }
}
public class Inheritance1
{
    public static void main(String[] args)
    {
        Base b=new Base(); //b is an object of Base class
        //Derived b=new Derived(); //b is an object of Derived class //line 44 or line 45 same we can write anything
        b.setX(4);
        System.out.println(b.getX());
        Derived d=new Derived(); //d is an object of Derived class
        d.setY(25);
        System.out.println(d.getY());
    }
}
