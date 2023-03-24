//package com.company;
class Base1
{
    Base1() //Base1() is a constructor method because it has same name of the class name
    {
        System.out.println("I'm a constructor");
    }
    public int x;
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
}
class Derived1 extends Base1
{
    public int y;
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
}
public class ConstructorsinInharitance
{
    public static void main(String[] args)
    {
        Base1 b=new Base1(); //b is an object of Base1 class
        Derived1 d=new Derived1(); //d is an object of Derived1 class
        /*
        we donot create any constructor in Derived1 class but as soon as we created an object of Derived1 class
        the constructor of Base1 class is automatically called through Derived class as Derived class inherits
        the Base1 class
        */
    }
}
