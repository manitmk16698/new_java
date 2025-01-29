package JAVA.Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput 
{
public static void main(String[] args) throws IOException
{
   
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println(num);

}    
}
