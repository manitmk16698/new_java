package JAVA.Encapsulation;

public class GetterSetter 
{
    public static void main(String[] args) 
    {
        Phone obj = new Phone();
        obj.setName("Iphone", obj);
        obj.setMemory_GB(256);

        
        System.out.println(obj.getName());
        System.out.println(obj.getMemory_GB());
    }    
}

class Phone
{
    private String Name  ;
    private int Memory_GB       ;
    public String getName() {
        return Name;
    }
    public void setName(String Name,Phone obj) 
    
    {   
       Phone obj1=obj;
       obj1.Name = Name;
    }
    public int getMemory_GB() {
        return Memory_GB;
    }
    public void setMemory_GB(int memory_GB) {
        Memory_GB = memory_GB;
    }

    
}