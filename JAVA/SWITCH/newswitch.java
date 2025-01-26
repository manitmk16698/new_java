package JAVA.SWITCH;

public class newswitch

    {
        public static void main(String[] args) 

        {
            String day="Monday";
            String res;
            
            res=switch(day)
                {
                    case "Monday","Tuesday": yield              "8am";
                    case "Wednesday","Thursday","Friday":yield  "10am";
                    default :yield                              "6 AM";
                };

                System.out.println(res);
        }        

    }
