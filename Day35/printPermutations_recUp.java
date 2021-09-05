import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    printPermutations(str, "");
  }

  public static void printPermutations(String ques, String ansSoFar) {

    // base case
    if (ques.length() == 0) {
      System.out.println(ansSoFar);
      return;
    }

    for (int i = 0; i < ques.length(); i++) {
      char ch = ques.charAt(i); // ith character
      String quesLeftPart = ques.substring(0, i); // characters from 0 to i - 1
      String quesRightPart = ques.substring(i + 1); // characters from i + 1 till end
      String restOfQuestion = quesLeftPart + quesRightPart;
      printPermutations(restOfQuestion, ansSoFar + ch);
    }
  }

}
