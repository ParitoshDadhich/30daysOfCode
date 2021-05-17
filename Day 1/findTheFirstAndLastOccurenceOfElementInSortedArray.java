class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        Arrays.fill(ans, -1);
        
        int start = 0;
        int end = nums.length-1;
        
        // first occurence
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == nums[mid]){
                ans[0] = mid;
                end = mid - 1;
            }
            else if(target > nums[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        
        // last ocurence
        // in the second half we need not to initialize start with 0 again
        end = nums.length - 1;
        while(start <= end){    
            int mid = start + (end-start)/2;
            if(target == nums[mid]){
                ans[1] = mid;
                System.out.println(mid);
                start = mid + 1;
            }
            else if(target > nums[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        
        return ans;
    }
}
