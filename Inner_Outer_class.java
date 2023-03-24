/*                            Wiley-mthree Java sample question
WAP implementing multiple inner classes. Class A is the outer class, Class B is inner class which is
inside method of class A and class Local is the method local inner class inside method of class B. Access these
classes from the main method in class Test and override the method of class Local and print "inside anonymous"
 */
//package com.company;
class A8 //class A outer class
{
    void outerMethod()
    {
        //System.out.println("inside outer method");
        class B8 //class B inner class
        {
            void innerMethod()
            {
                System.out.println("inside B");
                class Local //class Local method local class
                {
                    void localinnerMethod()
                    {
                        System.out.println("inside local inner method");
                    }
                }
            }
        }
        B8 y=new B8();
        y.innerMethod();
    }
}
public class Inner_Outer_class extends A8 //class Inner_Outer_class class Test
{
    void localinnerMethod() //overrides
    {
        super.outerMethod();
        System.out.println("inside anonymous");
    }
    public static void main(String[] args)
    {
        A8 x=new A8();
        Inner_Outer_class io=new Inner_Outer_class();
        io.localinnerMethod();
    }
}
/*
output:
inside B
inside anonymous
 */

