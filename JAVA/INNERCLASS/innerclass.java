package JAVA.INNERCLASS;

public class innerclass 

    {
            public static void main(String[] args) 
            
                {   
                        A outerobj = new A();
                        System.out.println(outerobj.outervariable);
                        outerobj.outermethod();

                        A.B innerobj = outerobj.new B();
                        System.out.println(innerobj.innervariable);
                        innerobj.innerMethod();

                }
    }

class A 
    {

        int outervariable = 06;

        public void outermethod()
            {
                System.out.println("IN OUTERMETHOD");
            }
        
        class B
            {

                int innervariable = 007;

                public void innerMethod()
                    {
                        System.out.println("IN INNERMETHOD");
                    }
            }

        
    }