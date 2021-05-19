class Solution {
    public int searchInsert(int[] arr, int key) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        
        int res = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(arr[mid] == key) return mid;
            
            else if(arr[mid] < key){
                res = mid;
                start = mid + 1;
            }
            
            else if(arr[mid] > key) end = mid - 1;
        }
        
        return res + 1;
    }
}
