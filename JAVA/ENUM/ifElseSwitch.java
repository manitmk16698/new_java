package JAVA.ENUM;

public class ifElseSwitch 

    {
            public static void main(String[] args) 
            
                    {
                            Status s = Status.Success;

                            if (s == Status.Pending)
                            {
                                System.out.println("Please Wait");
                            }
                            else if (s == Status.Failed)
                            {
                                System.out.println("Try Again");
                            }
                            else if (s == Status.Running)
                            {
                                System.out.println("All GOOD");
                            }
                            else
                            {
                                System.out.println("Done");
                            }
                    }        
    }

enum Status
{
    Running,Failed,Pending,Success;
}