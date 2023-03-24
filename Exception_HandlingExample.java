/*
//try-catch code example:-
package com.company;
public class Exception_HandlingExample
{
    public static void main(String[] args)
    {
        try
        {
            int data=100/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("JavaExceptionExamplrest of the code...");
    }
}
*/

/*
//multiple try-catch example:-
package com.company;
public class Exception_HandlingExample
{
    public static void main(String[] args)
    {
        try
        {
            int a[]=new int[5];
            System.out.println(a[10]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}
*/

//nested-try-catch code example:-
//package com.company;
public class Exception_HandlingExample
{
    public static void main(String[] args)
    {
        try
        {
            try
            {
                System.out.println("going to divide by 0");
                int b =39/0;
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
            try
            {
                int a[]=new int[5];
                a[5]=4;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
            System.out.println("other statement");
        }
        catch(Exception e)
        {
            System.out.println("handled the exception (outer catch)");
        }
        System.out.println("normal flow..");
    }
}
