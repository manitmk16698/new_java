package JAVA;

public class Annotation 
{
    public static void main(String[] args) 
    {
        A obj = new B();
        obj.show();
    }    
}
class A{
    public void show()
    {
        System.out.println("IN A");
    }
}
class B extends A
{
    @Override
    public void show()
    {
        System.out.println("IN B");
    }
}