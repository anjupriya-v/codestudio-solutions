import javafx.util.Pair;
import java.util.*;

public class Solution {
    public static Pair < Integer, Integer > swap(Pair < Integer, Integer > swapValues) {
		int temp=0,a=0,b=0;
        a=swapValues.getKey();
        b=swapValues.getValue();
        temp=a;
        a=b;
        b=temp;
        Pair<Integer, Integer> pair = new Pair<>(a, b);
        return pair;
    }
}
