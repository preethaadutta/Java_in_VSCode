//CodeWithHarry Tutorial no-48
//package com.company;
class A
{
    public int a;
     public int preethaa()
     {
         return 5;
     }
    public void method2()
    {
        System.out.println("I'm method2 of class A");
    }
}
class B extends A
{
    public void method3()
    {
        System.out.println("I'm method3 of class B");
    }
}
public class MethodOverriding
{
    public static void main(String[] args)
    {
         A a=new A(); //creating object of A class
         a.method2();

         B b=new B(); //creating object of B class
         b.method2(); //as class B extends A so method2 can be accessible from B
    }
}
//output: I'm method2 of class A
//        I'm method2 of class A

