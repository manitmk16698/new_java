package JAVA;
public class TypeconversionAndCasting 
    {
        public static void main(String[] args) 
            
            {

                //CASTING 

                byte a = 127;
                int  b = 12 ;
                
                
                a=(byte)b;                      //Explicitly converting using the datatype
                System.out.println(a);

                //Type Conversion

                b=a;                            //Implicitly converting itself
                System.out.println(b);
            }
    }
