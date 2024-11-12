import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter statement:");
    input = sc.NextLine();
    int count = 0;

    for (int i = 0; i < input.length(); i++)
    {
      String pair = input.substring(i, i+2);
      if(pair.equals("pa") || pair.equals("pe") || pair.equals("pi") || pair.equals("po") || pair.equals("pu"))
      {
        count++;
      }
    }
    System.out.println("P followed by a vowel " + count + " times.");

    Scanner sc = new Scanner(System.in);
    String input;
    String other = "";

    for (int i = 0; i < input.length(); i++)
    {
      String check = input.substring(i, i++);
      if(!(check.equals("a") || check.equals("e") || check.equals("i") || check.equals("o") || check.equals("u")))
      {
        other += check;
      }
    }
    System.out.println(other);

    // You can test your method here
    // System.out.println(isPrime(1));
    // System.out.println(isPrime(17));
  }

  public static boolean isPrime(int N)
  {
    // TODO: Replace and write your code below
    return false;
  }
}
