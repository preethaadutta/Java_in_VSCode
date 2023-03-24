/*         Switch case program using OOPs concept          */
/* By taking user input:- */
//package com.company;
import java.util.*; //means importing all classes and methods from java utility package
//import java.util.Scanner; means importing Scanner class and its methods from java utility package
class Method1
{
    void sum(int a,int b)
    {
        int result=a+b;
        System.out.println("Result is="+result);
    }
    void sub(int a,int b)
    {
        if(a>b)
        {
            int result=a-b;
            System.out.println("Result is="+result);
        }
        else
        {
            int result=b-a;
            System.out.println("Result is="+result);
        }
    }
    void mul(int a,int b)
    {
        int result=a*b;
        System.out.println("Result is="+result);
    }
    void div(int a,int b)
    {
        if(a>b)
        {
            float result1=a/b;
            System.out.println("Result is="+result1);
        }
        else
        {
            float result1=b/a;
            System.out.println("Result is="+result1);
        }
    }
}
public class SwitchcasewithOOPs
{
    public static void main(String[] args)
    {
        //to take user input in Java OOPs we've to create objects of Scanner class
        Scanner in = new Scanner(System.in); //creating 'in' object of Scanner class
        System.out.println("Enter value of the first number=");
        int a=in.nextInt();
        Scanner sc = new Scanner(System.in); //creating 'sc' object of Scanner class
        System.out.println("Enter value of the second number=");
        int b=sc.nextInt();
        Scanner dm = new Scanner(System.in); //creating 'dm' object of Scanner class
        System.out.println("Enter what calculation you want to do:");
        int choice = dm.nextInt();
        Method1 m = new Method1();
        switch (choice)
        {
            case 1:
                m.sum(a,b);
                break;
            case 2:
                m.sub(a,b);
                break;
            case 3:
                m.mul(a,b);
                break;
            case 4:
                m.div(a,b);
                break;
            default:
                System.out.println("No choice found");
        }
    }
}

//========================================================================================================//
/* By taking normal input:- */
/*
package com.company;
import java.util.*;
class Method1
{
    void sum(int a,int b)
    {
        int result=a+b;
        System.out.println("Result is="+result);
    }
    void sub(int a,int b)
    {
        if(a>b)
        {
            int result=a-b;
            System.out.println("Result is="+result);
        }
        else
        {
            int result=b-a;
            System.out.println("Result is="+result);
        }
    }
    void mul(int a,int b)
    {
        int result=a*b;
        System.out.println("Result is="+result);
    }
    void div(int a,int b)
    {
        if(a>b)
        {
            float result1=a/b;
            System.out.println("Result is="+result1);
        }
        else
        {
            float result1=b/a;
            System.out.println("Result is="+result1);
        }
    }
}
public class SwitchcasewithOOPs
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter what calculation you want to do:");
        int choice=in.nextInt();
        Method1 m=new Method1();
        switch(choice)
        {
            case 1:
                m.sum(4,5);
                break;
            case 2:
                m.sub(5,2);
                break;
            case 3:
                m.mul(2,3);
                break;
            case 4:
                m.div(5,2);
                break;
            default:
                System.out.println("No choice found");
        }
    }
}
*/