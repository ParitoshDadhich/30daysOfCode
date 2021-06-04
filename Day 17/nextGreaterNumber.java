class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        long ans[] = new long[n];
        int k = 0;
        Stack<Long> st = new Stack<>();
        
        for(int i = n-1; i >= 0 ; i--){
            if(st.size() == 0)
                ans[k++] = -1;
                
            else if(st.size() > 0 && st.peek() > arr[i])
                ans[k++] = st.peek();
                
            else if(st.size() > 0 && st.peek() <= arr[i]){
                while(st.size() > 0 && st.peek() <= arr[i]){
                    st.pop();
                }
                
                if(st.size() == 0)
                    ans[k++] = -1;
                else
                    ans[k++] = st.peek();
            }
            
            st.push(arr[i]);
        }
        
        // reversing array;
        for(int i=0, j=n-1; i<j; i++, j--){
            long t = ans[i];
            ans[i] = ans[j];
            ans[j] = t;
        }
        
        return ans;
        
    } 
}
