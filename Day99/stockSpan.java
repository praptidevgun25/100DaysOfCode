import java.util.*;
public class stockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days : ");
        int n = sc.nextInt();
        int[] prices = new int[n];

        System.out.println("Enter price of stock for : ");
        for(int i = 0; i < prices.length; i++) {
            System.out.print("Day "+(i+1)+" : ");
            prices[i] = sc.nextInt();
        }

        int[] span = findSpan(prices);
        display(span);
    }

    public static int[] findSpan(int[] prices) {
        int[] span = new int[prices.length];
        Stack<Integer> st = new Stack<>();
        st.push(0); //pushing in index of 1st day
        span[0] = 1;//span of 1st day is always 0 as there is no price higher before
        // comparing prices from day 2
        for(int i=1; i<prices.length; i++) {
            // keep poping till stack is empty or price of prev day is less than current
            while(st.size() > 0 && prices[st.peek()] < prices[i]) {
                st.pop();
            }
            // today is the highest price till date
            if(st.size() == 0){
                span[i] = i+1;
            }
            else{
                span[i] = i - st.peek();
            }
            st.push(i);//pushing today's index
        }
        return span;
    }

    public static void display(int[] span){
        System.out.println("Span for : ");
        for(int i=0; i<span.length; i++){
            System.out.println("Day "+ (i+1)+ " is "+ span[i]);
        }
    }
}
