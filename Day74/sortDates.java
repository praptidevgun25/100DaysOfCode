public class dateSort {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter number of dates : ");
    int n = scn.nextInt();
    String[] arr = new String[n];
    System.out.println("Enter the date for : ");
    for (int i = 0; i < n; i++) {
      System.out.print("Index " + i + " : ");
      String str = scn.next();
      arr[i] = str;
    }
    sortDates(arr);
    System.out.println("Dates sorted : ");
    print(arr);
  }
  public static void sortDates(String[] arr) {
    countSort(arr, 1000000, 100, 32); //sorts on basis of days
    countSort(arr, 10000, 100, 13); //sorts on basis of months
    countSort(arr, 1, 10000, 2501); //sorts on basis of years
  }
  public static void countSort(String[] arr, int div, int mod, int range) {
    int[] farr = new int[range]; 
    for (int i = 0; i < arr.length; i++) {
      farr[Integer.parseInt(arr[i], 10) / div % mod ]++; 
    }
    for (int i = 1; i < farr.length; i++) {
      farr[i] += farr[i - 1];
    }
    String[] ans = new String[arr.length]; //answer array
    for (int i = arr.length - 1; i >= 0; i--) {
      int pos = farr[Integer.parseInt(arr[i], 10) / div % mod] - 1;
      ans[pos] = arr[i];
      farr[Integer.parseInt(arr[i], 10) / div % mod]--;
    }
    // filling the og array
    for (int i = 0; i < arr.length; i++) {
      arr[i] = ans[i];
    }
  }
  public static void print(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int date = Integer.parseInt(arr[i], 10);
      int day = (date / 1000000) % 100;
      int month = (date / 10000) % 100;
      int year = (date / 1) % 10000;
      if (day < 10) {
        System.out.print("0" + day + "/");
      }
      else {
        System.out.print(day + "/");
      }
      if (month < 10) {
        System.out.print("0" + month + "/");
      }
      else {
        System.out.print(month + "/");
      }
      System.out.println(year);
    }
  }
}
