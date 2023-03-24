//CodeWithHarry Tutorial no-46
//package com.company;
class Base5
{
    Base5() //Base4() is a constructor method because it has same name of the class name
    {
        System.out.println("I'm Base class's constructor");
    }
    Base5(int a) //constructor overloading--
    //constructor overloading-- use of two constructor functions within same class but one constructor
    //is taking no parameter another constructor is taking one parameter
    {
        System.out.println("I'm Base class's overloaded constructor with a parameter a as:"+a);
    }
}
class Derived5 extends Base5
{
    Derived5() //Derived2() is a constructor method because it has same name of the class name
    {
        super(0); //now we can access base class's overloaded constructor
        System.out.println("I'm Derived class's constructor");
    }
    Derived5(int a,int b)
    {
        super(a);
        System.out.println("I'm Derived class's overloaded constructor with a parameter a as:"+a);
    }
}
public class ConstructorOverloading2
{
    public static void main(String[] args)
    {
        Base5 b=new Base5(); //b is an object of Base5 class
        Derived5 d1=new Derived5(); //d1 is an object of Derived5 class
        //as here we donot pass any value to this constructor so line number 17 constructor will run
        Derived5 d2=new Derived5(2,4); //d1 is an object of Derived5 class
        //as here we pass two values so line number 22 constructor will run
    }
}
