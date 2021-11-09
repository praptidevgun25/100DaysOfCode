import java.util.*;
public class nextGreaterElemToRight{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        int[]arr = new int[n];

        System.out.println("Enter element at : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Index "+ i + " : ");
            arr[i] = sc.nextInt();
        }

        int[]ans = nge(arr);
        display(ans, arr);
    }

    public static int[] nge(int[] arr) {
        
        int[]nge = new int[arr.length];
        
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length - 1]); //pushes last element to stack
        nge[arr.length - 1] = -1; // as there are no element to right of last element

        for(int i=arr.length-2; i>=0; i--) {
            // while stack has elem and current elem of array is greater than elems of stack => pop
            while(st.size() > 0 && arr[i] >= st.peek()){
                st.pop();
            }
            if(st.size() == 0) {
                nge[i] = -1; //current elem is greatest till now
            }
            else{
                nge[i] = st.peek();//storing the topmost element of stack => nge to current elem of array
            }
            st.push(arr[i]);//pushing this elem of array to stack => pottential next greater element
        }

        return nge;  
    }

    public static void display(int[] ans, int[] arr){
        
        for(int i = 0; i < ans.length; i++){
            
            if(ans[i] == -1){
                System.out.println("There is no greater element to right of " + arr[i]);
            }
            else{
                System.out.println("Next greater element to right of "+ arr[i]+" is "+ans[i]);
            }
        }
    }
}
