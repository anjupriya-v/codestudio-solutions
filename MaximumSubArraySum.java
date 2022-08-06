import java.io.*;
import java.util.*;
public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
        List<Integer> list=new ArrayList<Integer>();
        int sum=0;
		for(int i=0;i<n;i++){
            sum+=arr[i]; 
            list.add(sum); 
            if(sum<0) sum = 0;
            
           
        }
        int max=0;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        return Long.valueOf(max);
	}

}
