package JAVA.CLASSANDOBJECT;

public class Methodoverloading 
{
    public static void main(String[] args) 
    {
        overLoad obj = new overLoad();
        System.out.println(obj.add(3.4,5));
        System.out.println(obj.add(2,3,4));
        System.out.println(obj.add(5,6));
    }    
}


class overLoad
{
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public int add(int a ,int b)
    {
        return a+b;
    }
    public double add(double a, int b)
    {
        return a+b;
    }
}