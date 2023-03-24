//package com.company;
class Base3
{
    Base3() //Base3() is a constructor method because it has same name of the class name
    {
        System.out.println("I'm Base class's constructor");
    }
    Base3(int a) //constructor overloading--
    //constructor overloading-- use of two constructor functions within same class but one constructor
    //is taking no parameter another constructor is taking one parameter
    {
        System.out.println("I'm Base class's overloaded constructor with a parameter a as:"+a);
    }
}
class Derived3 extends Base3
{
    Derived3() //Derived3() is a constructor method because it has same name of the class name
    {
        System.out.println("I'm Derived class's constructor");
    }
}
public class ConstructorOverloading
{
    public static void main(String[] args)
    {
        Base3 b=new Base3(); //b is an object of Base2 class
        Derived3 d=new Derived3(); //d is an object of Derived2 class
        /*
        if we run now then base class's overloaded constructor will not be called base class's constructor and
        derived class's constructor will be called but if we want to access base class's overloaded constructor
        then we've to use super() method that we'll see in ConstructorOverloading1.java file
         */
    }
}

