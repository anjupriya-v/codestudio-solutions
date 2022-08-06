import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String args[]){
        int n,kValue;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        kValue=sc.nextInt();
        int finalValue[]=Klargest(arr,kValue,n);
        System.out.println(Arrays.toString(finalValue));

    }
    public static int[] Klargest(int[] a, int k, int n) {
        int temp;
        int largest[]=new int[k];
        Arrays.sort(a);
        for(int j=(k-1);j>=0;j--){
        		largest[j]=a[n-1];
        		n--;
        	}
     
        return largest;
    }
}
