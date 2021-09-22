import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int sizeOfArray = scn.nextInt();
        
        int[] arr = new int[sizeOfArray];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int dataToBeFound = scn.nextInt(); 

        int low = 0;
        int high = arr.length - 1;
        int foundAt = -1;
        while(low <= high){
            int mid = (low + high) / 2;

            if(dataToBeFound > arr[mid]){
                low = mid + 1;
            } else if(dataToBeFound < arr[mid]){
                high = mid - 1;
            } else {
                foundAt = mid;
                break;
            }
        }

        System.out.println(foundAt);

    }

}
