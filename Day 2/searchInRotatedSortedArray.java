class Solution {
    public int search(int[] arr, int key) {
        int n = arr.length;
        
        int start = 0;
        int end = n - 1;
        int minIndex = 0;
        
        while(start <= end){
             
            if(arr[start] <= arr[end]){
                minIndex = start;
                break;
            }
            
            int mid = start + (end - start)/2;
            int next = (mid + 1) % n;
            int prev = (mid - 1 + n) % n;
            
            // applying min element check;
            if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]){
                minIndex = mid;
                break;
            }
            
            // logic of where to move if ele is not the min element;
            else if(arr[mid] >= arr[start])
                start = mid + 1;
            else if(arr[mid] <= arr[end])
                end = mid - 1;  
        }
        
        start = 0;
        end = n-1;
        // search in the first half;
        int v1 = bSearch(arr, start, minIndex-1, key);
        // search in the other half;
        int v2 = bSearch(arr, minIndex, end, key);
        
        if(v1 != -1)
            return v1;
        else if(v2 != -1)
            return v2;
        
        return -1;
    }
    
    
    private int bSearch(int arr[], int start, int end, int ele){
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(arr[mid] == ele)
                return mid;
            else if(arr[mid] <= ele)
                start = mid + 1;
            else
                end = mid - 1;
        }
        
        return -1;
    }
}
