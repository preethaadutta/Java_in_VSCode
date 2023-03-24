//4) Non-Parameterized without return type
//package com.company;
public class Functions1
{
    //usage of static keyword:- when we want to call some method directly from main method
    //(means public static void main) without creating any object then we've to create that method
    //as a static method
    //<access specifier> <return datatype> <method name>(Parameters which the method will take with their datatype)
    //here nothing is returning so return data type is void
    static void telljoke() //User defined Method block //2nd control will come this method block
    //a static method will always be shared among all the objects of that class so it is not needed to call that
    //method after creating an object of that class rather than that we can directly call that method
    {
        System.out.println("I invented a new world!");
    }
    public static void main(String[] args)
    {
        telljoke(); //method call or method invoke
    }
}
