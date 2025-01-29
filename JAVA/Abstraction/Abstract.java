package JAVA.Abstraction;

public class Abstract 

    {
            public static void main(String[] args) 
            
                {
                        A obj = new B();
                        obj.show();
                        obj.show1();
                        obj.show2();

                }    
    }

abstract class A
{
    public abstract void show();
    public abstract void show1();

    public void show2()
    {
        System.out.println("In show2");
    }
}
class  B extends A
{
    public void show()
    {
        System.out.println("IN SHOW");
    }
    public void show1()
    {
        System.out.println("IN SHOW1");
    }
    public void show3()
    {
        System.out.println("IN SHOW3");
    }
}
     

