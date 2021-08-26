import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    ArrayList<String> res = gss(str);
    System.out.println(res);
  }

  // bc -> [--, -c, b-, bc]
  // abc -> [---, --c, -b-, -bc, a--, a-c, ab-, abc]
  public static ArrayList<String> gss(String str) {

    //base case
    if (str.length() == 0) {
      ArrayList<String> bres = new ArrayList();
      bres.add("");
      return bres;
    }
    // separated the first character of the string
    char ch = str.charAt(0); // a

    // separated rest of the string from the first character
    String ros = str.substring(1); // bc

    ArrayList<String> rres = gss(ros); // [--, -c, b-, bc]

    ArrayList<String> mres = new ArrayList<>(); // to store the answer

    for (String rstr : rres) {
      mres.add("" + rstr); // subsequence intereacted with blank
    }

    for (String rstr : rres) {
      mres.add(ch + rstr); // subsequence interacted with character
    }


    return mres; //returning my result

  }

}
