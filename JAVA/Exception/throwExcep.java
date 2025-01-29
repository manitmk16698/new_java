package JAVA.Exception;

public class throwExcep 
{
    public static void main(String[] args) 
    {
        int i=20;
        int j=9;

        try
        {
            j=18/i;
            if (j==0)
                throw new ArithmeticException("I want the value of j instead of zero");
            
        }
        catch(ArithmeticException e)
        {
            j=18;
            System.out.println("Default value if j=0"+e);
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }
    }
}

