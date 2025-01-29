package JAVA;

public class LambdaReturn 
{
    public static void main(String[] args) 
    {
        A obj = (a,b)->a+b;
        obj.add(3, 5);
    }    
}

interface A
{
    int add(int a,int b);
}


