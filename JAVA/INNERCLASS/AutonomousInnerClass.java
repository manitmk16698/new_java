package JAVA.INNERCLASS;

public class AutonomousInnerClass 
    {
        public static void main(String[] args) 
        
        {
                A obj = new A()
                {
                    public void Amethod()
                        {
                            System.out.println("In Autonomous nethod");
                        }
                };
                obj.Amethod();
                obj.Amethod();
        }
    }
class A
    {
        public void Amethod()
            {
                System.out.println("In A method");
            }
    }    
