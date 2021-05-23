class GfG{
    int min = Integer.MAX_VALUE;    
	public void push(int a,Stack<Integer> s)
	{
	    if(s.size() == 0){
	        s.push(a);
	        min = a;
	    }
	    else{
	        if(a >= min)
	            s.push(a);
	        else{
	            s.push(2*a-min);
	            min = a;
	        }
	    }
	}
	public int pop(Stack<Integer> s)
    {
        if(s.size() == 0)
            return -1;
        else{
            if(s.peek() >= min)
                return s.pop();
            else{
                min = 2*min - s.peek();
                return s.pop();
            }
        }
	}
	public int min(Stack<Integer> s)
    {
           return min;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           return s.size() == n ? true: false;
	}
	public boolean isEmpty(Stack<Integer>s)
    {
           return s.size() == 0? true:false;
	}
}
