import java.util.*;

public class sort01s {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements : ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter either 0 or 1 at : ");
    for (int i = 0 ; i < n; i++) {
      System.out.print("Index " + i + ": ");
      arr[i] = sc.nextInt();
    }
    sort01(arr);
    print(arr);
  }
  public static void sort01(int[] arr) {
    //0 to j-1 => 0s
    // j to i-1 => 1s
    int i = 0;
    int j = 0;

    while (i < arr.length) {
      if (arr[i] == 1) {
        i++;
      }
      // swaps the 0 to first found 1 thus making all left 0s
      else {
        swap(arr, i, j);
        i++;
        j++;
      }
    }
  }
  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr) {
    for (int i = 0 ; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
