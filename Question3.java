import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  { 
    Scanner in = new Scanner(System.in);
    //enter integer
    
    //read input
    int number = in.nextInt();

    //multiply integer
    int squared = number * number;
    
    //print result
    System.out.print(squared);

    in.close();
  }
}
