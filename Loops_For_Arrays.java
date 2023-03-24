//package com.company;
import java.util.*;
public class Loops_For_Arrays
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of elements in array:");
        int n=in.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter elements of array:");
            array[i]=in.nextInt();
        }
        //Iterating over the array using for loop //array traversal using for loop
        for(int i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }
        //Iterating over the array using for-each loop //array traversal using for loop
        //syntax- for(<datatype of each element of array> element : <array name>)
        for(int element:array)
        {
            System.out.println(element); //it'll print each element of array
        }
        //printing the array in reverse order
        for(int i=n-1;i>=0;i--) //decrementing for loop
        {
            System.out.println(array[i]);
        }
    }
}
