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


                int  x = 258;                   
                byte y = (byte)x;
                System.out.println(y);          //The output=2 as byte range exceded it will give the modulus of byte range to the value(256%258)

                float f = 2.34f;
                int   i = (int)f;
                System.out.println(i);
                

            }
    }
