public class Solution{

    public static int fibonacciNumber(int n){
       int n1=0,n2=1,n3=0;
        if(n==0||n==1){
            return n;
        }
       for(int i=2;i<=n;i++){
           n3=(n1+n2)%1000000007;
           n1=n2;
           n2=n3;
       }
        
      return (n3);
        
    
    }
}
