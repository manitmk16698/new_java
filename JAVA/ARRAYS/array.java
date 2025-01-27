package JAVA.ARRAYS;

public class array 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5};
        int arr1[] = new int[4];

        for (int i=0;i <4;i++)
        {
            arr1[i]=i;
        }

        for(int j=0;j <4;j++)
        {
            System.out.println(arr1[j]);
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
