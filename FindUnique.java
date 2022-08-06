import java.io.*;
import java.util.*;
public class Solution{  

    public static int findUnique(int[] arr){
		//Your code goes here
        boolean[] bool=new boolean[arr.length];
        int result=0;
        for(int i=0;i<arr.length ;i++){
            for(int j=i+1;j<arr.length && bool[i]==false;j++){
                if(arr[i]==arr[j]){
                    bool[i]=true;
                    bool[j]=true;
                    break;
                }
            }
            if(bool[i]==false){
                
                result=arr[i];
                break;
            }
        }
        return result;
        
    }
}
