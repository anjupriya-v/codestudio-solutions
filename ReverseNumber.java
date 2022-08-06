import java.io.*;
import java.util.*;
public class Solution {
	public static void main(String[] args) {    
		int num,rem,sum=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        while(num!=0){
        rem=num%10;
		    sum=sum*10+rem;
        num=num/10;
        }
       System.out.println(sum);

	}
}
