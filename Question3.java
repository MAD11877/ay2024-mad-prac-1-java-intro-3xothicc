import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  { 
    Scanner in = new Scanner(System.in);
    //enter integer
    System.out.println("Enter an integer:");

    //read input
    int number = in.nextInt();

    //multiply integer
    int squared = number * number;

    System.out.println(number + " multiplied by itself is " + squared);

    in.close();
  }
}
