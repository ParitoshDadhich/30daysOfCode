class Solution {
    public int shipWithinDays(int[] arr, int stu) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        
        if(stu > n)
            return -1;
        
        // find max in array
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i: arr){
            if(i > max)
                max = i;
            sum += i;
        }
        
        // allocating max to start and sum to end;
        start = max;
        end = sum;
        
        // b search
        int res = -1;
        while(start <= end){
            
            // mid is a max weight capacity
            int mid = start + (end - start)/2;
            
            if(isValid(arr, n, stu, mid)){
                res = mid;
                end = mid - 1;
            }
            else
                start = mid + 1;
        }
        
        return res;
    }
    
    private boolean isValid(int arr[], int n, int stu, int mid){
        int day = 1;
        int weight = 0;
        
        for(int i=0; i<n; i++){
            
            weight += arr[i];
            if(weight > mid){
                day++;
                weight = arr[i];
            }
            
            if(day > stu)
                return false;      
        }
        
        return true;
    }
    
}
