//package com.company;
class C
{
    public int a;
    public int preethaa()
    {
        return 5;
    }
    public void method2() //as this method is public so overridden method should also be public
    {
        System.out.println("I'm method2 of class A");
    }
}
class D extends C
{
    public void method2() //method overriding: same method-name but different work //it should also be public
    {
        System.out.println("I'm method2 of class B");
    }
    public void method3()
    {
        System.out.println("I'm method3 of class B");
    }
}
public class MethodOverriding1
{
    public static void main(String[] args)
    {
        C c=new C(); //creating object of A class
        c.method2();

        D d=new D(); //creating object of B class
        d.method2(); //as class B extends A so method2 can be accessible from B
    }
}
//output: I'm method2 of class A
//        I'm method2 of class B
//we can't override static method & final method
