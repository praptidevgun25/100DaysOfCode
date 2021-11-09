import java.util.*;
public class balancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with brackets : ");
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // if we get a closing bracket
            if(ch == ')'){

                // if we directly get ( wirhout any othe char
                if(st.peek() == '('){
                    System.out.println(true + " There are extra brackets.");
                    return;
                }
                else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    // to pop the corresponding (
                    st.pop();
                }
            }
            // if we get anything other than  )
            else{
                st.push(ch);
            }
        }
        System.out.println(false + "There are no extra brackets.");
    }
}
