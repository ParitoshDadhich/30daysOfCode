class Solution {
    static int[] kthLargest(int k, int[] arr, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ans[] = new int[n];
        int t=0;
        for(int i: arr){
            pq.add(i);
            
            if(pq.size() < k)
                ans[t++] = -1;
            else{
                ans[t++] = pq.peek();
                pq.poll();
            }
        
        }
        return ans;
    }
};
