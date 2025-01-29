package JAVA.WRAPPERCLASSES;

public class boxingUnboxing 
    {
        public static void main(String[] args) 
        
            {
                    int num1 = 5 ;
                    //Integer n = new Integer(6);
                    //System.out.println(n);
                    Integer num2 =(Integer) num1;         //Boxing
                    Integer num3 =num1;                  //storing int in Integer Object (AutoBoxing)
                    System.out.println(num2); 
                    System.out.println(num3);

                    int a =(int)num3;
                    System.out.println(a);                  //Unboxing
                    int b = num3;
                    System.out.println(b);
            }   
    }
