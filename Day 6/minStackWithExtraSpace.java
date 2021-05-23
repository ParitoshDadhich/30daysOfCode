
class GfG{
    Stack<Integer> ss = new Stack<>();
    
	public void push(int a,Stack<Integer> s)
	{
	    s.push(a);
	    if(ss.size() == 0 || ss.peek() >= a)
	        ss.push(a);

	}
	public int pop(Stack<Integer> s)
    {
        if(s.size() == 0)
            return -1;
        int ans = s.pop();
        if(ans == ss.peek())
            ss.pop();
        
        return ans;
	}
	public int min(Stack<Integer> s)
    {
           if(ss.size() == 0)
                return -1;
            return ss.peek();
	}
	public boolean isFull(Stack<Integer>s, int n)
    {
           return s.size() == n ? true: false;
	}
	public boolean isEmpty(Stack<Integer>s)
    {
           return s.size() == 0 ? true: false;
	}
}
