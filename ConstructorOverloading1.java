//package com.company;
class Base4
{
    Base4() //Base4() is a constructor method because it has same name of the class name
    {
        System.out.println("I'm Base class's constructor");
    }
    Base4(int a) //constructor overloading--
    //constructor overloading-- use of two constructor functions within same class but one constructor
    //is taking no parameter another constructor is taking one parameter
    {
        System.out.println("I'm Base class's overloaded constructor with a parameter a as:"+a);
    }
}
class Derived4 extends Base4
{
    Derived4() //Derived2() is a constructor method because it has same name of the class name
    {
        super(0); //now we can access base class's overloaded constructor
        System.out.println("I'm Derived class's constructor");
    }
}
public class ConstructorOverloading1
{
    public static void main(String[] args)
    {
        Base4 b=new Base4(); //b is an object of Base4 class
        Derived4 d=new Derived4(); //d is an object of Derived4 class
    }
}
