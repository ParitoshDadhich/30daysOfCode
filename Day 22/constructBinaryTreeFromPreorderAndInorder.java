class Solution {

	public  TreeNode buildTree(int[] preOrder, int[] inOrder) {
		return helper(preOrder, inOrder, 0, preOrder.length-1, 0, inOrder.length-1);
	}

    private TreeNode helper(int pre[], int in[], int preStart, int preEnd, int inStart, int inEnd){
        
        if(preStart > preEnd) return null;
        if(inStart > inEnd) return null;
        
        // getting rootData, first element in preordet is always a root element;
        int rootData = pre[preStart];
        TreeNode root = new TreeNode(rootData);
        
        // trying to find the index of rootData in in[];
        int index = -1;
        for(int i=inStart; i<=inEnd; i++){
            if(in[i] == rootData){
                index = i;
                break;
            }
        }
        
        if(index == -1) return null;
        
        // calculating the needed calculations
        int leftInStart = inStart;
        int leftInEnd = index-1;
        int rightInStart = index+1;
        int rightInEnd = inEnd;
        
        int leftPreStart = preStart+1;
        int leftPreEnd = leftPreStart+leftInEnd-leftInStart;
        int rightPreStart = leftPreEnd+1;
        int rightPreEnd = preEnd;
        
        
        root.left = helper(pre, in, leftPreStart, leftPreEnd, leftInStart, leftInEnd);
        root.right = helper(pre, in, rightPreStart, rightPreEnd, rightInStart, rightInEnd);
        
        return root;
    }
    
}
