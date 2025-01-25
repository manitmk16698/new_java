public class classes 
    {
        public static void main(String[] args) 
            {
                Cars obj = new Cars("v8");
                obj.speed();
                System.out.println(obj.Name);
                System.out.println(obj.Wheels);
                System.out.println(obj.engine);

            }    
    }


class Cars
    {
        String Name="Swift";
        int Wheels= 4;
        String engine;

        public void speed()
        {
            System.out.println("The car can achieve a speed of max 220kmph");
        }

        public  Cars( String engine)
        {
            this.engine=engine;
        }
    }