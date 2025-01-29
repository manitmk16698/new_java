package JAVA.Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tryResources 
{
    public static void main(String[] args) 
    {
    
        BufferedReader bf=null;
        
        try
        {
            
            bf = new BufferedReader(new InputStreamReader(System.in));

            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        

        }
        catch(Exception e)
        {

            System.out.println("Something went wrong");
        }
        finally
        {
            try {
                bf.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("BYE");
        }
    }    
}
