package JAVA.Exception;

public class CustomException 
{
    public static void main(String[] args) 
    {
        int i =20;
        int j =0;
        
        try{
            j=18/i;
            if (j==0)
                throw new ManiException("MANI EXCEPTION MESSAGE");
        }
        catch(ManiException e)
        {
            System.out.println( "IN MANI excpetion occcured"+e);
        }
        catch(Exception e)
        {
            System.out.println("In exception");
        }
    }    
}
class ManiException extends Exception
{
    public ManiException(String s)
    {
        super(s);
    }
}
