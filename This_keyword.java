/*
//1) 'this' keyword is used to refer current class instance variable
class Student
{  
    int rollno;
    String name;
    float fee;
    //constructor
    Student(int rollno,String name,float fee)
    {
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;  
    }  
    //method
    void display()
    {
        System.out.println(rollno+" "+name+" "+fee);
    }  
}  
class This_keyword
{
    public static void main(String args[])
    {
        Student s1=new Student(111,"ankit",5000f);
        Student s2=new Student(112,"sumit",6000f);
        s1.display();
        s2.display();
    }
}
*/ 
/*
//2) 'this' keyword is used to invoke current class method
class A
{
    void m()
    {
        System.out.println("hello m");
    }
    void n()
    {
        System.out.println("hello n");
        //m();//same as this.m();
        this.m();  
    }  
}  
class This_keyword
{
    public static void main(String args[])
    {
        A a=new A();
        a.n();  
    }
}
*/
//3) 'this' keyword is used to invoke current class constructor
class A
{
    A()
    {
        System.out.println("hello a");
    }
    A(int x)
    {
        this();
        System.out.println(x);  
    }  
}  
class This_keyword
{
    public static void main(String args[])
    {
        A a=new A(10);  
    }
}
//For more information about 'this' keyword refer javatpoint.com