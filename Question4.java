import java.util.Scanner;

public class Question4
{
  public static void main(String[] args) 
  {
      Scanner in = new Scanner(System.in);
    //enter the number of stars on the base of the triangle, called baseSize
      int baseSize = in.nextInt();
    
    //print each row of the triangle
      for (int i = baseSize; i > 0; i--) 
      {
          for (int j = 0; j < i; j++) {
              System.out.print("*"); 
          }
          System.out.println();
      }

      in.close(); 
  }
}
