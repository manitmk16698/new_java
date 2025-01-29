package JAVA.Encapsulation;

public class encap 
{
    public static void main(String[] args) 
    {
        MANI obj = new MANI();

        System.out.println(obj.Blood_group);

        System.out.println(obj.speak());
        System.out.println(obj.write());
    }    
}

class MANI
{
        private int Age=27;
        private String Name="MANIKANTA";
        String Blood_group="A+";

        public String speak()
        {
            return Name;
        }
        public int write()
        {
            return Age;
        }


}