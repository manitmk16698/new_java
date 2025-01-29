package JAVA.INTERFACE;

public class needFor 

    {
        public static void main(String[] args) 
        
            {
                    computer desk = new Desktop();
                    computer l = new Laptop();
                    Dev mani = new Dev();
                    mani.devApp(desk);

            }
    }

interface  computer
{
    void code();
}
class Desktop implements computer
{
    public void code()
    {
        System.out.println("code,compile,run:faster");
    }
}
class Laptop implements computer
{
    public void code()
    {
        System.out.println("code,compile,run");
    }
}
class Dev
{
    public void devApp(computer desk)
    {
        desk.code();
    }
}
