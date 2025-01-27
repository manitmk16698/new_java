package JAVA.ARRAYS;

public class ArrayObjects 
{
    public static void main(String[] args) 
    {
        Students stud1 = new Students();
        stud1.Name="MANIKANTA";
        stud1.Age =27         ;
        stud1.Branch="EEE"     ;

        Students stud3= new Students();
        stud3.Name="APOORVA";
        stud3.Age =29         ;
        stud3.Branch="CSE"     ;

        Students stud2 = new Students();
        stud2.Name="MANISHA";
        stud2.Age =24     ;
        stud2.Branch="ECE"     ;

        Students arr[] = new Students[3];
        arr[0]=stud1;
        arr[1]=stud2;
        arr[2]=stud3;
        
        for(Students n:arr)
        {
            System.out.println(n.Name+":"+n.Age+":"+n.Branch);
        }


    } 
      
}

class Students
{
    String Name;
    int Age;
    String Branch;
}