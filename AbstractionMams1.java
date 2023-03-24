/*
Abstraction:- Abstraction is the process of hiding the internal or lower level details. By
abstraction we hide method body or definition.
Abstract Method:- The method which has no method body means no definition, has only method signature or
declaration, that method is called Abstract Method.
Abstract Class:- The class which contains one or more abstract methods is called Abstract Class.
Concrete Class:- The class which is complete means does not contain any abstract method is called Concrete Class.
Characteristics of Abstract Class:-
1) As Abstract Class contains Abstract Method means incomplete method so Abstract Class is also incomplete for that
reason we can't create object of Abstract Class.
2) Abstract class needs to be derived by its child class for its implementation means child class
completes that abstract method.
3) Child class needs to define all the abstract methods of the parent class in order to be called as a
concrete class. if it does not define all the abstract methods then it will be also called as Abstract class.
Utility of Abstraction:- Abstraction provides generalization.
*/

//Abstraction:-
//package com.company;
abstract class Mobile
{
    abstract void internet();
}
abstract class Mobiles extends Mobile
{
    abstract void operatingsystem();
}
class Mobiledemo extends Mobiles
{
    void internet()
    {
        System.out.println("It has 4G internet");
    }
    void operatingsystem()
    {
        System.out.println("It has Android operating system");
    }
    void camera()
    {
        System.out.println("It has 15 Megapixel camera");
    }
}
public class AbstractionMams1
{
    public static void main(String[] args)
    {
        Mobiledemo m=new Mobiledemo();
        m.internet();
        m.operatingsystem();
        m.camera();
    }
}
