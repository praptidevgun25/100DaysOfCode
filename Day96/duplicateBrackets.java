import java.io.*;

import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new
    BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    Stack< Character> st = new Stack< >();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == ')') {
        if (st.peek() == '(') {
          System.out.println(true);
          return;
        } else {
          while (st.peek() != '(') {
            st.pop();
          }
          st.pop();
        }
      } else {
        st.push(ch);
      }
    }

    System.out.println(false);
  }
}
