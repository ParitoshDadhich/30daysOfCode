class Solution {
    public boolean searchMatrix(int[][] arr, int key) {
        int row = arr.length;
        int col = arr[0].length;
        
        int i = 0;
        int j = col - 1;
        while(i >= 0 && i < row && j >=0 && j < col){
            if(arr[i][j] == key)
                return true;
            
            else if(arr[i][j] > key)
                j--;
            
            else if(arr[i][j] < key)
                i++;
        }
        
        return false;
    }
}
