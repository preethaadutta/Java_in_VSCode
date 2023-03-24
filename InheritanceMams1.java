//Multilevel Inheritance:-
//package com.company;
class A2
{
    void sum(int a, int b)
    {
        int result=a+b;
        System.out.println("Sum="+result);
    }
}
class B2 extends A2
{
    void sub(int a, int b)
    {
        int result=a-b;
        System.out.println("Substraction="+result);
    }
}
class C2 extends B2
{
    void mul(int a, int b)
    {
        int result=a*b;
        System.out.println("Multiplication="+result);
    }
}
public class InheritanceMams1
{
    public static void main(String[] args)
    {
        C2 c=new C2();
        c.sum(3,4);
        c.sub(4,1);
        c.mul(4,2);
    }
}
/*
//Multilevel Inheritance:-
package com.company;
class A2
{
    void sum(int a, int b)
    {
        int result=a+b;
        System.out.println("Sum="+result);
    }
}
class B2 extends A2
{
    void sub(int a, int b)
    {
        int result=a-b;
        System.out.println("Substraction="+result);
    }
}
class C2 extends B2
{
    int x=5;
    void mul(int a, int b)
    {
        int result=a*b;
        System.out.println("Multiplication="+result);
    }
}
public class InheritanceMams1
{
    public static void main(String[] args)
    {
        C2 c=new C2();
        c.sum(3,4);
        c.sub(4,1);
        c.mul(4,2);
        System.out.println("x="+c.x);
    }
}
*/