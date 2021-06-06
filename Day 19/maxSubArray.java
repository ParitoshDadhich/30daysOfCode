class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        return maxSubArraySum(nums, 0, n-1);
    }
    
    private int maxSubArraySum(int nums[], int sI, int eI){
        // if only one element is present
        if(sI == eI)
            return nums[sI];
        
        int mid = sI + (eI - sI)/2;
        int LSS = maxSubArraySum(nums, sI, mid);
        int RSS = maxSubArraySum(nums, mid+1, eI);
        int CSS = maxCrossOverSum(nums, sI, mid, eI);
        
        return Math.max(LSS, Math.max(RSS, CSS));
    }
    
    private int maxCrossOverSum(int nums[], int sI, int mid, int eI){
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        
        for(int i=mid; i>=sI; i--){
            sum += nums[i];
            if(sum > leftSum)
                leftSum = sum;
        }
        
        sum = 0;
        for(int i=mid+1; i<=eI; i++){
            sum += nums[i];
            if
                (sum > rightSum)
                    rightSum = sum;
        }
        
        return Math.max(rightSum + leftSum, Math.max(leftSum, rightSum));
    }
    
}
