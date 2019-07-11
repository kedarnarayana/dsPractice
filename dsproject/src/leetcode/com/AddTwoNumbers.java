package leetcode.com;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	 
	  public class ListNode {
	      int val;
	     ListNode next;
	      ListNode(int x) { val = x; }
	  }
	
	
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        int r=0,c=0, s = 0;
	        ListNode res = null;ListNode res1 = null;
	        if(l1 != null && l2 != null){
	            s = l1.val+l2.val;
	            if(s >= 10){
	                r = s%10;
	                c = s/10;
	                res = new ListNode(r);
	                res.next = null;
	            }
	            res = new ListNode(s);
	            res.next = null;
	        }
	        
	        while(l1.next !=null || l2.next != null || c != 0){
	            s = ((l1.next != null)?l1.next.val:0)+((l2.next != null)?l2.next.val:0)+c;
	            if(s >= 10){
	                r = s%10;
	                c = s/10;
	                res1 = new ListNode(r);
	                res1.next = res;
	            }else{
	                 res1 = new ListNode(s);
	                 res1.next = res;
	                 l1=l1.next.next;l2=l2.next.next;
	                 res=res1;
	            }           
	        }
	        return res;
	        
	    }
	    
	    public ListNode addTwoNumbersLeet(ListNode l1, ListNode l2) {
	        ListNode dummyHead = new ListNode(0);
	        ListNode p = l1, q = l2, curr = dummyHead;
	        int carry = 0;
	        while (p != null || q != null) {
	            int x = (p != null) ? p.val : 0;
	            int y = (q != null) ? q.val : 0;
	            int sum = carry + x + y;
	            carry = sum / 10;
	            curr.next = new ListNode(sum % 10);
	            curr = curr.next;
	            if (p != null) p = p.next;
	            if (q != null) q = q.next;
	        }
	        if (carry > 0) {
	            curr.next = new ListNode(carry);
	        }
	        return dummyHead.next;
	    }

}
