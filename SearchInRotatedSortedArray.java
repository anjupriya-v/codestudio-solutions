public class Solution {
    public static int search(int arr[], int key) {
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
