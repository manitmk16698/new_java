package JAVA.Exception;

public class tryCatch 
{
    public static void main(String[] args) 
    {
        int i =0;
        int j =0;
        
        try
        {
            j=18/i;
        }
        catch(Exception obj)
        {
            System.out.println("Something went wrong"+obj);
        }
        System.out.println(j);
        System.out.println("BYE");
    }    
}
