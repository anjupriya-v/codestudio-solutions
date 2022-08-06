public class Solution {
  public static int sumOfMaxMin(int[] arr, int n) {
      int max=arr[0],min=arr[0];
      for(int i=0;i<arr.length;i++){
          if(max<arr[i]){
              max=arr[i];
          }
          if(min>arr[i]){
              min=arr[i];
          }
      }
      return (max+min);
  }
}
