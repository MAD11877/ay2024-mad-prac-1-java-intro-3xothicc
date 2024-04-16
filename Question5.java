import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    //count of number user will input
    int numIntegers = in.nextInt();  

    HashMap<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
    int maxFreq = 0;
    int mode = 0;

    //prompt to enter integers
    for (int i = 0; i < numIntegers; i++) {
      int current = in.nextInt();  // Read each integer
      // Update frequency count for every integer
      if (frequencyMap.containsKey(current)) {
        frequencyMap.put(current, frequencyMap.get(current) + 1);
      } else {
        frequencyMap.put(current, 1);
      }

      // Check if current integer has a higher frequency
      if (frequencyMap.get(current) > maxFreq) {
        maxFreq = frequencyMap.get(current);
        mode = current;
      }
    }

    // Output mode
    System.out.print(mode);
    in.close();
  }
}
