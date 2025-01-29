package JAVA;

public class Lambda 
{
    public static void main(String[] args) 
    {
        A obj =i->System.out.println("In A"+i);
        obj.show(5);
    }     
}

interface A 
{
    void show(int i);
}