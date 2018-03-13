public class Test9 {
    public ListNode FindKthToTail(ListNode head,int k) {
    	ListNode p, q;
    	p = q = head;
    	for(int i = 0; p != null; i++){
    		if(i >= k){
    			q = q.next;
    		}
    		p = p.next;
    	}
    	return i < k? null : q;
    }
}
//ListNode类
/*class ListNode{
	int val;
	ListNode next;

	ListNode(int x){
	val = x;
	next = null;
	}
}
*/