import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
        Scanner in = new Scanner(System.in);

        // Height in m
        System.out.print("Enter your height in meters: ");
        double height = in.nextDouble();

        // Weight in kg
        System.out.print("Enter your weight in kilograms: ");
        double weight = in.nextDouble();
        in.close();

        // Calculate BMI
        double bmi = weight / (height * height);
      
        System.out.printf("Your BMI is: %.2f\n", bmi);
  }
}
