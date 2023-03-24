//User defined Functions or Methods
//4 types- 1) Parameterized with return type
//         2) Parameterized without return type
//         3) Non-Parameterized with return type
//         4) Non-Parameterized without return type

//one method(only method call part is different):-
//1) Parameterized with return type
//package com.company;
import java.util.*;
public class Functions
{
    //usage of static keyword:- when we want to call some method directly from main method
    //(means public static void main) without creating any object then we've to create that method
    //as a static method
    //<access specifier> <return datatype> <method name>(Parameters which the method will take with their datatype)
    //x,y are parameters
    static int userdefinedmethod(int x,int y) //User defined Method block //2nd control will come this method block
    {
        int z;
        if(x>y)
        {
            z=x+y;
        }
        else
        {
            z=y-x;
        }
        return z; //return variablename
    }
    public static void main(String[] args) //main method block //1st control will come in this main block
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value=");
        int a=sc.nextInt();
        System.out.print("Enter a value=");
        int b=sc.nextInt();
        int c;
        ////process 1 for method calling:- (without creating an object):-////
        //variable name=method name(arguments); //method call
        //a,b are arguments
        c=userdefinedmethod(a,b); //method call or method invoke //3rd controll will come here
        System.out.print(c);
    }
}

//another method(only method call part is different):-
/*
//1) Parameterized with return type
package com.company;
import java.util.*;
public class Functions
{
    //usage of static keyword:- when we want to call some method directly from main method
    //(means public static void main) without creating any object then we've to create that method
    //as a static method
    //<access specifier> <return datatype> <method name>(Parameters which the method will take with their datatype)
    //x,y are parameters
    int userdefinedmethod(int x,int y) //User defined Method block //2nd control will come this method block
    {
        int z;
        if(x>y)
        {
            z=x+y;
        }
        else
        {
            z=y-x;
        }
        return z; //return variablename
    }
    public static void main(String[] args) //main method block //1st control will come in this main block
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a value=");
        int a=in.nextInt();
        System.out.print("Enter a value=");
        int b=in.nextInt();
        int c;
        ////process 2 for method calling:- (with creating an object of the class):-////
        //<Classname> <object name>=new <Classname()>; //syntax to create an object of a class
        Functions object1=new Functions();
        //variable name=object name.method name(arguments); //method call or method invoke
        //a,b are arguments
        c=object1.userdefinedmethod(a,b);
        System.out.print(c);
    }
}
 */