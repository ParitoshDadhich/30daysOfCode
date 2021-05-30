class Solution {
    public ListNode swapNodes(ListNode head, int n) {
        
        if(head == null || head.next == null)
            return head;
        
        ListNode temp = head;
        int len = length(temp);
        int m = len-n+1;

            
        if(m == 1 || n == 1){
            int max = m>n?m:n;
            ListNode c1 = head;
            ListNode c2 = head;
            ListNode p = null;
            int count = 0;
            while(c2 != null && count<max-1){
                count++;
                p = c2;
                c2 = c2.next;
            }
            // System.out.println(c1.val + " " + c2.val + " " + p.val);
            
            p.next = c1;
            c2.next = head.next;
            c1.next = null;
            head = c2;
            
        }
        
        
        else if(Math.abs(m-n) == 1){
            int max = m>n?m:n;
            ListNode c1 = head, c2 = head, prev = null;
            int count = 0;
            while(c1 != null && count < max-1){
                prev = c2;
                c2 = c1;
                c1 = c1.next;
                count++;
            }
            
            c2.next = c1.next;
            prev.next = c1;
            c1.next = c2;
            // System.out.println(c1.val + " " + c2.val);
        }
        
        
        else{
            ListNode c1 = head, c2 = head;
            ListNode p1 = null, p2 = null;
            int count = 0;
            while(c1 != null && count<n-1){
                p1 = c1;
                c1 = c1.next;
                count++;
            }
            ListNode t = c1.next;
            
            count = 0;
            while(c2 != null && count<m-1){
                p2 = c2;
                c2 = c2.next;
                count++;
            }
            // System.out.println(c1.val + " " + c2.val);
            
            c1.next = c2.next;
            p1.next = c2;
            c2.next = t;
            p2.next = c1;
        }
        
        return head;
        
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
