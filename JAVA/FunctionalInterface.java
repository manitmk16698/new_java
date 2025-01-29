package JAVA;

public class FunctionalInterface 
{
    public static void main(String[] args) 
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("IN B");
            }
        };
        obj.show();
    }    
}

interface A 
{
    void show();
}

