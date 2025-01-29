package JAVA.CLASSANDOBJECT;

public class Methods 
{
    public static void main(String[] args) {
        Teacher obj = new Teacher();

        System.out.println(obj.teach());
        System.out.println(obj.Beat(2));

    }    
}


class Teacher
{
    public String teach()
    {
        return "She can teach";
    }
    public String Beat(int num)
    {
        if (num >1)
        return "She will be aggresive while teaching" ;
        return "No not at all";
    }
}