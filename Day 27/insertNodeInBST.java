class Solution {
    public TreeNode insertIntoBST(TreeNode root, int Key)
    {
        TreeNode node = new TreeNode(Key);
        return insertHelper(root, node);
    }
    
    private TreeNode insertHelper(TreeNode root, TreeNode node){
        if(root == null)
            return node;
            
        if(root.val > node.val)
            root.left = insertHelper(root.left, node);
        
        if(root.val < node.val)
            root.right = insertHelper(root.right, node);
            
        return root;
        
    }
    
    
}
