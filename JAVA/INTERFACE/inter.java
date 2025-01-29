package JAVA.INTERFACE;

public class inter 
{
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.dontshow();
        System.out.println(A.Age);
        System.err.println(A.Area);
    }    
}

interface A 
{
    int Age =27;
    String Area ="HYDERABAD";

    void show();
    void dontshow();
}

class B implements A
{
    public void show()
    {
        System.out.println( "IN SHOW");
    }
    public void dontshow()
    {
        System.out.println("IN dont show");
    }
}
