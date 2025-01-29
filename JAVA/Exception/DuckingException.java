package JAVA.Exception;

public class DuckingException 
{
    public static void main(String[] args) 
    {
        Mani obj = new Mani();
        try {
            obj.ma();
        } catch (ClassNotFoundException e) {
            
            e.printStackTrace();
        }
    }    
}
class Mani
{
    public void ma() throws ClassNotFoundException
    {
        int i=0;
        int j=0;
        
        
        Class.forName("calc");
        j=18/i;
        System.out.println(j);
           

    }
}
