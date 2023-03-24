/* Program on Interface */
//package com.company;
public interface printable
{
    void print();
}
class A6 implements printable
{
    public void print()
    {
        System.out.println("Hello");
    }
    public static void main(String args[])
    {
        A6 a=new A6();
        a.print();
    }
}
//=======================================================================================================//
/*
//Interface declaration: by first user
interface Drawable
{
void draw();
}
//Implementation: by second user
class Rectangle implements Drawable
{
public void draw()
{
System.out.println("drawing rectangle");
}
}
class Circle implements Drawable
{
public void draw()
{
System.out.println("drawing circle");
}
}
//Using interface: by third user
class TestInterface1
{
public static void main(String args[])
{
Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()
d.draw();
}
}
*/
//================================================================================================//
//for more details and more code refer javatpoint

