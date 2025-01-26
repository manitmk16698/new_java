package JAVA.OPERATORS;

public class ArithmeticOperators
    {
        public static void main(String[] args) 
            {
                

                int number1 = 8 ;
                int number2 = 5 ;

                //Addition

                int Addition = number1 + number2 ;
                System.out.println(Addition);

                //Substraction
                
                int Substractiontion = number1 - number2 ;
                System.out.println(Substractiontion);

                //Multiplication

                int Multiplication = number1 * number2 ;
                System.out.println(Multiplication);

                //Division

                int Division = number1 / number2 ;
                System.out.println(Division);

                //Modulus
               
                int Modulus = number1 % number2 ;
                System.out.println(Modulus);

                //ShortHand

                number1 = number1 + 2 ;
                number1 += 2;
                System.out.println(number1);
                number1 -= 2;
                System.out.println(number1);
                number1 *= 2;
                System.out.println(number1);
                number1 /= 2;
                System.out.println(number1);
                number1 %= 2;
                System.out.println(number1);

                //Increment


                //POST-INCREMENT
                int a = number1++;
                System.out.println(number1); //After increment
                System.out.println(a);       //Before increment

                //PRE-INCREMENT
                int b = ++number1;
                System.out.println(number1);
                System.out.println(b);

                // DECREMENT

                //POST-DECEMENT
                int c = number2--;
                System.out.println(c);
                System.out.println(number2);

                //PRE_DECREMENT
                int d = --number2;
                System.out.println(d);
                System.out.println(number2);

            }        
    }
