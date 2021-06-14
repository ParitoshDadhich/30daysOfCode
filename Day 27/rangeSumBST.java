class Solution {
    private int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        
        if(root.val < low)
            rangeSumBST(root.right, low, high);
        else if(root.val > high)
            rangeSumBST(root.left, low, high);
        else{
            sum += root.val;
            rangeSumBST(root.left, low, high);
            rangeSumBST(root.right, low, high);
        }
        
        return sum;
    }
}
