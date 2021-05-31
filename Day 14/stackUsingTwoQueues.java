class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    q1.add(a);
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
        if(q1.size() == 0)
            return -1;
        
	    while(q1.size() > 1)
	        q2.add(q1.poll());
	  
	    int ans = q1.poll();
	    while(q2.size() != 0)
	        q1.add(q2.poll());
	    return ans;
    }
	
}
