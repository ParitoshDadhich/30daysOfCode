
class Solution {
    void immediateSmaller(int arr[], int n) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];
        int k = 0;
        
        for(int i = n-1; i >= 0; i--){
            if(st.size() == 0)
                ans[k++] = -1;
            
            else if(st.size() > 0 && st.peek() < arr[i])
                ans[k++] = st.peek();
            
            else if(st.size() > 0 && st.peek() >= arr[i]){
                while(st.size() > 0 && st.peek() >= arr[i])
                    st.pop();
                if(st.size() == 0)
                    ans[k++] = -1;
                else
                    ans[k++] = st.peek();
            }
            
            st.push(arr[i]);
        }
        
        for(int i=0, j=n-1; i<j; i++, j--){
            int t = ans[i];
            ans[i] = ans[j];
            ans[j] = t;
        }
     
        return ans;
    }
}
