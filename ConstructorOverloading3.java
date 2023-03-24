//CodeWithHarry Tutorial no-46
//package com.company;
class Base6
{
    Base6() //Base4() is a constructor method because it has same name of the class name
    {
        System.out.println("I'm Base class's constructor");
    }
    Base6(int a) //constructor overloading--
    //constructor overloading-- use of two constructor functions within same class but one constructor
    //is taking no parameter another constructor is taking one parameter
    {
        System.out.println("I'm Base class's overloaded constructor with a parameter a as:"+a);
    }
}
class Derived6 extends Base5
{
    Derived6() //Derived2() is a constructor method because it has same name of the class name
    {
        super(0); //now we can access base class's overloaded constructor
        System.out.println("I'm Derived class's constructor");
    }
    Derived6(int a,int b)
    {
        super(a);
        System.out.println("I'm Derived class's overloaded constructor with a parameter a as:"+a);
    }
}
class ChildofDerived extends Derived6
{
    ChildofDerived()
    {
        System.out.println("I'm a constructor of ChildofDerived class");
    }
    ChildofDerived(int a,int b,int c)
    {
        super(a,b);
        System.out.println("I'm Derived class's overloaded constructor with a parameter c as:"+c);
    }
}
public class ConstructorOverloading3
{
    public static void main(String[] args)
    {
        Base6 b=new Base6(); //b is an object of Base6 class
        Derived6 d1=new Derived6(); //d1 is an object of Derived6 class
        //as here we donot pass any value to this constructor so line number 17 constructor will run
        Derived6 d2=new Derived6(2,4); //d1 is an object of Derived6 class
        //as here we pass two values so line number 22 constructor will run
        ChildofDerived cd=new ChildofDerived(5,8,10); //cd is an object of ChildofDerived class
        //as here we pass three values so line number 35 constructor will run
    }
}
