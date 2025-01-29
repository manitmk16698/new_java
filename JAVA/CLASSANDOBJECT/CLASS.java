package JAVA.CLASSANDOBJECT;


public class CLASS 
{
    public static void main(String[] args) {
        
        int number1 = 4 ;
        int number2 = 5 ;

        calc obj = new calc();

        int result = obj.add(4,5);
        System.out.println(result);
    }    
}


class calc 
{
    public int  add(int num1,int num2)
    {
        int r=num1+num2;
        return r;
    }
}

