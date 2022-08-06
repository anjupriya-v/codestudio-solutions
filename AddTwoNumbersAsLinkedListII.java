import java.io.*;
import java.util.*;

public class Solution {
    static ListNode<Integer> reverse(ListNode<Integer> nodes){
        ListNode<Integer> reverseNodes=null;
        ListNode<Integer> current=nodes;
        ListNode<Integer> nextValue=nodes;
        while(current!=null){
            nextValue=nextValue.next;
           current.next=reverseNodes; 
            reverseNodes=current;
            current=nextValue;
        }
        return reverseNodes;
    }
	public static ListNode<Integer> addTwoLists(ListNode<Integer> first, ListNode<Integer> second) {
		
        ListNode<Integer> first1=reverse(first);
        ListNode<Integer> second1=reverse(second);
        ListNode<Integer> result=null;
        int carry=0,a=0,b=0,sum=0;
        while(first1!=null || second1!=null){
            a=first1!=null?first1.data:0;
            b=second1!=null?second1.data:0;
            sum=carry+a+b;
            carry=sum/10;
            sum%=10;
            ListNode<Integer> newNode=new ListNode<Integer>(sum);
            if(result==null){
                result=newNode;
            }
            else{
                newNode.next=result;
                result=newNode;
            }
            if(first1!=null){
                first1=first1.next;
            }
            if(second1!=null){
                second1=second1.next;
            }
            
        }
        if(carry != 0){
            ListNode<Integer> newNode = new ListNode<Integer>(carry);
             newNode.next=result;
                result=newNode;
        }
        return result;
	}
}
