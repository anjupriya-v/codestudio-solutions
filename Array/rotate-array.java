import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        ArrayList <Integer> list = new ArrayList<>();
        k = k%arr.size();
        for(int i = k; i<arr.size();i++){
            list.add(arr.get(i));
        }
        for(int i = 0; i<k; i++){
            list.add(arr.get(i));
        }
        return list;
    }
}
