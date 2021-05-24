 
class Solution {
    public int[] nextGreaterElements(int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int nextGreater[] = new int[nums2.length];
        
        int n = nums2.length;
        int k=0;
        for(int i=2*n-1; i>=0; i--){
            if(st.size() == 0)
                nextGreater[(k++)%nums2.length] = -1;
            
            else if(st.size()>0 && st.peek() > nums2[i%nums2.length])
                nextGreater[(k++)%nums2.length] = st.peek();
            
            else if(st.size()>0 && st.peek() <= nums2[i%nums2.length]){
                while(st.size()>0 && st.peek() <= nums2[i%nums2.length])
                    st.pop();
                
                if(st.size() == 0)
                    nextGreater[(k++)%nums2.length] = -1;
                else
                    nextGreater[(k++)%nums2.length] = st.peek();
            }
            st.push(nums2[i%nums2.length]);
        }
        
        for(int i=0, j=n-1; i<j; i++, j--){
            int temp = nextGreater[i];
            nextGreater[i] = nextGreater[j];
            nextGreater[j] = temp;
        }
        
        return nextGreater;
    }
}
