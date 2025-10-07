import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);  // input from the keyboard
    /* ============= BEGIN SOLUTION ================================ */

    double target = 1.2345;
    System.out.println("Enter a Number");
    double input = scan.nextDouble();

    if (input == target)
    {
      System.out.println("yes");
    }
    else
    {
      System.out.println("no");
    }

    int number = 48;
    System.out.println("Enter a number");
    int skibidi = scan.nextInt();

    if (number == skibidi)
    {
      System.out.println("YES");
    }

    System.out.println("Enter a number");
    int input1 = scan.nextInt();
    System.out.println("enter another number");
    int input2 = scan.nextInt();
    input1 *= 2;

    if (input1 == input2)
    {
      System.out.println("YES");
    }

    System.out.println("Please enter an integer");
    int toilet = scan.nextInt();

    if (toilet % 2 == 0)
    {
      System.out.println("Divisible by 2!");
    }

    if (toilet % 3 == 0)
    {
      System.out.println("Divisible by 3!");
    }

    System.out.println("Please enter an integer");
    int input3 = scan.nextInt();

    if (input3 % 2 == 0)
    {
      System.out.println("Even");
    }
    else
    {
      System.out.println("odd");
    }


    /* ============= END SOLUTION ================================== */
    scan.close();
  }
}
