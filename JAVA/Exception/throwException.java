package JAVA.Exception;

public class throwException 
{
   


    public static void main(String[] args) 
    {
        int i=20;
        int j=9;

        try
        {
            j=18/i;
            if (j==0)
                throw new ArithmeticException("This is the message");
            
        }
        catch(ArithmeticException e)
        {
            j=18;
            System.out.println("Default value if j=0"+e);
        }

    }
}

    

