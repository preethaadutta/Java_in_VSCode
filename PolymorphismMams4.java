//1) Compile Time Polymorphism or Static Binding:-
//a) Method Overloading:-
//package com.company;
class Shape
{
    void lengths_of_sides(int a1,int a2,int a3,int a4)
    {
        System.out.println("Legth of 1st side:"+a1);
        System.out.println("Legth of 2nd side:"+a2);
        System.out.println("Legth of 3rd side:"+a3);
        System.out.println("Legth of 4th side:"+a4);
    }
    void lengths_of_sides(int a1,int a2,int a3)
    {
        System.out.println("Legth of 1st side:"+a1);
        System.out.println("Legth of 2nd side:"+a2);
        System.out.println("Legth of 3rd side:"+a3);
    }
}
public class PolymorphismMams4
{
    public static void main(String[] args)
    {
        Shape s1=new Shape();
        Shape s2=new Shape();
        System.out.println("Lengths of square sides are:");
        s1.lengths_of_sides(2,3,4,5);
        System.out.println("Lengths of triangle sides are:");
        s2.lengths_of_sides(2,3,4);
    }
}
/*
class Shape
{
    int no_of_sides(int a1,int a2,int a3,int a4)
    {
        //System.out.println("Legth of 1st side:"+a1);
        //System.out.println("Legth of 2nd side:"+a2);
        //System.out.println("Legth of 3rd side:"+a3);
        //System.out.println("Legth of 4th side:"+a4);
        return 4;
    }
    void no_of_sides(int a1,int a2,int a3)
    {
        System.out.println("Legth of 1st side:"+a1);
        System.out.println("Legth of 2nd side:"+a2);
        System.out.println("Legth of 3rd side:"+a3);
    }
}
public class PolymorphismMams4
{
	public static void main(String[] args)
	{
	    Shape s1=new Shape();
	    Shape s2=new Shape();
		System.out.println("Lengths of square sides are:"+s1.no_of_sides(2,3,4,5));
		System.out.println("Lengths of triangle sides are:");
		s2.no_of_sides(2,3,4);
	}
}
*/