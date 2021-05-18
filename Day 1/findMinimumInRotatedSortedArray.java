class Solution {
    public int findMin(int[] arr) {
        int l = arr.length;
        int start = 0;
        int end = l-1;
        
        while(start <= end){
            
            if(arr[start] <= arr[end])
                return arr[start];
            
            int mid = start + (end - start)/2;
            int next = (mid + 1) % l;
            int pre = (mid + l -1) % l;
            
            if(arr[mid] <= arr[pre] && arr[mid] <= arr[next])
                return arr[mid];
            
            else if(arr[mid] >= arr[start])
                start = mid + 1;
            
            else if(arr[mid] <= arr[end])
                end = mid - 1;
        }
        
        return -1;
    }
}
