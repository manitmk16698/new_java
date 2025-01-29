package JAVA.ENUM;

public class enumone 
{
    public static void main(String[] args) 
    {
        Status[] s = Status.values();
        for (Status i : s)
        {
            System.out.println(i);
        }
    }    
}

enum Status
{
    Running,Failed,Pending,Success;
}
