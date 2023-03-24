/*take reference of geeksforgeeks
2) Run Time Polymorphism or Dynamic Binding or Late Binding or Dynamic Method Dispatch:-
In runtime polymorphism the method calling statements for all methods of different classes remain
same but in runtime depending on the object of which class the referring object is referencing decides which
method is to invoke.
*/

//2) Run Time Polymorphism or Dynamic Binding or Dynamic Method Dispatch:-
//package com.company;
class E
{
    void callme()
    {
        System.out.println("Inside E");
    }
}
class F extends E
{
    void callme()
    {
        System.out.println("Inside F");
    }
}
class G extends E
{
    void callme()
    {
        System.out.println("Inside G");
    }
}
public class PolymorphismMams3
{
    public static void main(String[] args)
    {
        E e=new E();
        F f=new F();
        G g=new G();
        e.callme();
        e=f; //here e is referencing object //object e is referencing class F's object f
        e.callme();
        e=g; //here e is referencing object //object e is referencing class G's object g
        e.callme();
    }
}
