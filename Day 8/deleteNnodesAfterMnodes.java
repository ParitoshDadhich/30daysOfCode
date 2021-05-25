class Solution
{
    static void linkdelete(Node head, int m, int n)
    {
        int count = 0;
        Node temp = head;
        
        while(temp != null){
            count = 0;
            
            while(temp != null && count < m-1){
                temp = temp.next;
                count++;
            }
            Node node = temp;
            count = 0;
            
            while(temp != null && count < n){
                count++;
                temp = temp.next;
            }
            
            if(temp != null){
                node.next = temp.next;
                temp = temp.next;
            }
            else if(node != null && temp == null)
                node.next = null;
        }
        //return head;
    }
}


