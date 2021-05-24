class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int nextGreater[] = new int[nums2.length];
        
        int n = nums2.length;
        int k=0;
        for(int i=n-1; i>=0; i--){
            if(st.size() == 0)
                nextGreater[k++] = -1;
            
            else if(st.size()>0 && st.peek() > nums2[i])
                nextGreater[k++] = st.peek();
            
            else if(st.size()>0 && st.peek() <= nums2[i]){
                while(st.size()>0 && st.peek() <= nums2[i])
                    st.pop();
                
                if(st.size() == 0)
                    nextGreater[k++] = -1;
                else
                    nextGreater[k++] = st.peek();
            }
            st.push(nums2[i]);
        }
        
        for(int i=0, j=n-1; i<j; i++, j--){
            int temp = nextGreater[i];
            nextGreater[i] = nextGreater[j];
            nextGreater[j] = temp;
        }
       
        Map<Integer, Integer> map = new HashMap<>();
        k=0;
        for(int i: nums2){
            map.put(i, nextGreater[k++]);
        }
        
        int ans[] = new int[nums1.length];
        k=0;
        for(int i: nums1)
            ans[k++] = map.getOrDefault(i, -1);
        
        return ans;
    }
}
