import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
       int duplicate=0,flag=0;
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i)==arr.get(j)){
                    duplicate=arr.get(i);
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                break;
            }
        }
        return duplicate;
    }
}
