package JAVA.Exception;

public class MultipleCatch 
{
    public static void main(String[] args) 
    {
        int i =2;
        int j =0;
        int[] num = new int [5];
        String str = null;
        try
        {
            j=18/i;
            System.out.println(num[4]);
            System.out.println(num[1]);
            System.out.println(str.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by Zero"+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index should be in range"+e);
        }
        catch(Exception e)
        {
            System.out.println("Something is wrong"+e);
        }
        System.out.println(j);
        System.out.println("BYE");
    }    
}
