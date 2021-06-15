class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)
            return false;
        
        if(root.right == null && root.left == null && (targetSum - root.val == 0))
            return true;
        
        boolean flag1 = hasPathSum(root.left, targetSum-root.val);
        boolean flag2 = hasPathSum(root.right, targetSum-root.val);
        
        return flag1 || flag2;
    }
}
