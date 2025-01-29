package JAVA.INTERFACE;

public class Moreoninter 

    {
        public static void main(String[] args) 
        
            {
                c obj = new c();
                obj.mani();
                obj.sai();
                A obj1 = new c();
                B obj2 = new c();
                obj1.mani();
                obj2.sai();

            }
    }
interface A
{
    void mani();
}
interface B 
{
    void sai();
}

class c implements A,B
{
    public void mani()
    {
        System.out.println("IN MANI");
    }
    public void sai()
    {
        System.out.println("IN SAI");
    }
}