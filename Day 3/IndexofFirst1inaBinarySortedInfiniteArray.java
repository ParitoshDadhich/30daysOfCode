class Solution {
    
    public long firstIndex(long arr[], long n)
    {
        // edge case
        if(n == 1)
            return arr[0] == 1 ? 0 : -1;
        
        long key = 1;
        int start = 0;
        int end = 1;
        
        // finding the range in which we can get the answer;
        while(1 > arr[end]){
            start = end;
            end = end * 2;
        }
        
        // apply first occurence algorithm to find our answer;
        
        int res = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(key == arr[mid]){
                res = mid;
                end = mid - 1;
            }
            
            else
                start = mid + 1;
        }
        
        return res;
        
    }
}
