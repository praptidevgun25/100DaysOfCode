import java.util.*;

public class Main {
  public static void main (String[] args) {

    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt(); // number of balls drawn

    int x = scn.nextInt(); // nummber of red balls required

    // numerator part choosing x balls from 4 red balls * choosing remaining balls from n-x balls
    double num = nCr(4, x) * nCr(4, n - x);

    // denominator : all possible ways to choose n balls from 8 balls
    double den = nCr(8, n);

    int ans = (int)((num / den) * 100);
    System.out.print(ans);

  }

  // combination nCr
  public static double nCr(int n, int r) {

    double x = factorial(n) / (factorial(r) * factorial(n - r));
    return x;
  }

  // factorial
  public static int factorial(int n) {

    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    return fact;
  }
}
