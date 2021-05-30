class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        int count = 0;
        
        int len = length(head);
        if(len < k)
            return head;
        
        while(curr != null && count <k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
            count++;
        }
        
        if(next != null)
            head.next = reverseKGroup(next, k);
        
        return prev;
    }
    
    private int length(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    
}
