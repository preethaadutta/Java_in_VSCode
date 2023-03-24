//1) Compile Time Polymorphism or Static Binding or Early Binding:-
//b) Method Overriding:-
//package com.company;
class P
{
    void display()
    {
        System.out.println("dislay function within Parent");
    }
}
class Child extends P
{
    void display()
    {
        super.display();
        System.out.println("display function within child");
    }
}
public class PolymorphismMams2
{
    public static void main(String[] args)
    {
        P p1=new P();
        Child c1=new Child();
        // p1.display();
        c1.display();
    }
}
