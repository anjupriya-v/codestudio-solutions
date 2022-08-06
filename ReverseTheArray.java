import java.util.ArrayList;
import java.util.*;
public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int inc=0;
        List<Integer> temp=new ArrayList<Integer>();
		int length=arr.size()-1;
        for(int i=0;i<=m;i++){
		if(i==m){
            for(int j=arr.size()-1;j>=m+1;j--){
                temp.add(arr.get(j));
               
            }
            for(int k=m+1;k<arr.size();k++){
                 arr.set(k, temp.get(inc));
                inc++;;
            }
            break;
        }
        }

    }
}
