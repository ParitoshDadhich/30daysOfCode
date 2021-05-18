
class Solution {
    int count(int[] arr, int n, int x) {
        int first = -1;
        int last = -1;
        
        
        // scanning in left half
        int start = 0;
        int end = n-1;
        boolean flag1 = false;
        while(start <= end){
            int mid = start + (end  - start)/2;
            
            if(x == arr[mid]){
                first = mid;
                end = mid - 1;
                flag1 = true;
            }
            
            else if(x < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        
        
        end = n-1;
        boolean flag2 = false;
        while(start <= end){
            int mid = start + (end  - start)/2;
            
            if(x == arr[mid]){
                last = mid;
                start = mid + 1;
                flag2 = true;
            }
            
            else if(x < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        
        return (flag1 || flag2) ? last - first + 1 : 0;
    }
}
