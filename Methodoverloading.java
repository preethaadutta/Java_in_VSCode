/* Method Overloading:- Two or more methods can have same names but different parameters.
 Such methods are called Method Overloading. */
//package com.company;
public class Methodoverloading
{
    //<access specifier> <return datatype> <method name>(Parameters which the method will take with their datatype)
    //here nothing is returning so return data type is void
    //User defined Method block //2nd control will come this method block
    static void greeting() //here greeting() method is not taking any parameter
    {
        System.out.println("Good Morning All!");
    }
    //a is parameter
    static void greeting(int a) //here greeting() method is taking one parameter
    // greeting() is overloaded function
    {
        System.out.println("Good Morning"+a+" All!");
    }
    //a,b are parameters
    static void greeting(int a,int b) //here greeting() method is taking two parameters
    //greeting() is overloaded function
    /*
    static int greeting(int a,int b) //this will give error because Method
    overloading can't be performed by changing return type of that method
    */
    {
        System.out.println("Good Morning"+a+" Brothers!");
        System.out.println("Good Morning"+b+" Sisters!");
    }
    public static void main(String[] args)
    {
        //method call or method invoke
        greeting(); //greeting() no parameter taking method is calling
        greeting(4000); //greeting() one parameter taking method is calling
        //4000 is argument
        greeting(200,300); //greeting() two parameters taking method is calling
        //200,300 are arguments
        //Arguments are always Actual values
    }
}
/*
As name of these three greeting() method is same but they're taking different number of parameters so that
function is called overloaded function. This is called Method Overloading.
*/