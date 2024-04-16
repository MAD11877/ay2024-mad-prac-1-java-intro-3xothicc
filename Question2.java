import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
        Scanner in = new Scanner(System.in);

        // Height in m
        double height = in.nextDouble();

        // Weight in kg
        double weight = in.nextDouble();
        in.close();

        // Calculate BMI
        double bmi = weight / (height * height);

        System.out.print(bmi);
  }
}
