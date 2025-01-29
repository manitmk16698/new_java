package JAVA.Encapsulation;

public class constructor 
{
    public static void main(String[] args) 
    {
            Human obj = new Human();
            System.out.println();
            obj.show(null, 0);

    }
}

class Human
{
    private String Name ;
    private int Age;

    public Human()
    {
        System.out.println("In constructor");
        Name="MANI";
        Age=27;
    }

    public void show(String Name,int Age)
    {
        System.out.println(this.Name+":"+this.Age);
    }

  
}