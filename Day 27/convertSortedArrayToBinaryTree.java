 
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }
    
    private TreeNode helper(int arr[], int sI, int eI){
        if(sI > eI) 
            return null;
        
        int mid = sI + (eI - sI)/2;
        int rootData = arr[mid];
        TreeNode root = new TreeNode(rootData);
        
        root.left = helper(arr, sI, mid-1);
        root.right = helper(arr, mid+1, eI);
        
        return root;
    }
}
