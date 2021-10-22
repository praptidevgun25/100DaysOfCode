import java.io.*;

import java.util.*;

public class fibonacciDp {

  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    // we use dp when same question is being solved again and again
    
    // size of question bank array will be from 0 to n, so we need n + 1 size array which is initially filled with 0
    int[] questionBank = new int[n + 1];
    int FibMemoized = FibMemoized(n, questionBank);

    System.out.println(FibMemoized);

  }
  
  // Memoized - answer is being memoized
  public static int FibMemoized(int n, int[] questionBank) {
    
    // 1 is the base case
    if (n == 0 || n == 1) {
      return n;
    }

    // if question bank contains the answer already, don't solve it instead return it from the question bank
    if (questionBank[n] != 0) {
      return questionBank[n];
    }
    int fibn1 = FibMemoized(n - 1, questionBank);
    int fibn2 = FibMemoized(n - 2, questionBank);
    int fibn = fibn1 + fibn2;

    // n is the question and fibn is the result so in questionBank at the position of question we will store its answer
    questionBank[n] = fibn;

    return fibn;
  }
}
