public class Solution {

	public static long sumOrProduct(int n, int q) {
		long sum=0,product=1;
        if(q==1){
           for(int i=1;i<=n;i++){
            sum+=i;
        }  
            return sum;
        }
             for(int i=1;i<=n;i++){
                product=(product*i)%1000000007;
            }
        
       return product;
	}
}
