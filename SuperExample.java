//super keyword in Java:-
//1) super can be used to refer immediate parent class instance variable.

/*
//package com.company;
class Animal
{
    String character="ferocious";
}
class Dog extends Animal
{
    String character="domestic";
    void printcharacter()
    {
        System.out.println("Character of dog is "+character); //prints variable character of Dog class
        System.out.println("Character of wild animals are "+super.character); //prints variable character of Animal class
    }
}
public class SuperExample
{
    public static void main(String[] args)
    {
        Dog d=new Dog();
        d.printcharacter();
    }
}
*/

//2) super can be used to invoke immediate parent class method.

/*
package com.company;
class Animal
{
    void eat()
    {
        System.out.println("Animal is eating meat.");
    }
}
class Dog extends Animal
{
    void eat()
    {
        System.out.println("Dog is eating bread.");
    }
    void printeat()
    {
        eat();
        super.eat(); //prints method of Animal class
    }
}
class SuperExample
{
    public static void main(String[] args)
    {
        Dog d=new Dog();
        d.printeat();
    }
}
*/

//3) super() can be used to invoke immediate parent class constructor.


//package com.company;
class Animal
{
    Animal()
    {
        System.out.println("animal is created");
    }
}
class Dog extends Animal
{
    Dog()
    {
        super();
        System.out.println("dog is created");
    }
}
class SuperExample
{
    public static void main(String[] args)
    {
        Dog d=new Dog();
    }
}

/*
Output:-
animal is created
dog is created
*/
