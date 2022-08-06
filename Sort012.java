import java.util.*;
public class Solution 
{
    public static void sort012(int[] arr)
    {
        int c0=0,c1=0,c2=0;
        for(int i=0;i<arr.length;i++){
            switch(arr[i]){
                case 0:
                    c0++;
                    break;
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(c0>0){
                arr[i]=0;
                c0--;
            }
            else if(c1>0){
                arr[i]=1;
                c1--;
            }
            else{
                arr[i]=2;
                c2--;
            }
        }
// 		Arrays.sort(arr);
    }
}
