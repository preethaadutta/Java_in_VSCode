//package com.company;
class Base2
{
    Base2() //Base1() is a constructor method because it has same name of the class name
    {
        System.out.println("I'm Base class's constructor");
    }
}
class Derived2 extends Base2
{
    Derived2() //Derived2() is a constructor method because it has same name of the class name
    {
        System.out.println("I'm Derived class's constructor");
    }
}
public class ConstructorinInheritance1
{
    public static void main(String[] args)
    {
        Base2 b=new Base2(); //b is an object of Base2 class
        Derived2 d=new Derived2(); //d is an object of Derived2 class
        /*
        if we create an object of Derived class
        the constructor of Base class is automatically called through Derived class as Derived class inherits
        the Base class and if we create also a constructor of Derived class then 1st base class's constructor will
        be called then 2nd derived class's constructor will also be called
        */
    }
}
