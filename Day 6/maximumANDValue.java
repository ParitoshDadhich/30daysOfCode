class Solution{
    
   // Function for finding maximum AND value.
    public static int maxAND (int arr[], int n) {
      
      int res = 0;
      for(int i=31; i>=0; i--){
          int count = function(res | 1<<i, arr, n);
          if(count >= 2)
            res = res | 1<<i;
      }
        
        return res;
    }
    
    private static int function(int pattern, int arr[], int n){
        int count = 0;
        for(int i=0; i<n; i++){
            if((pattern & arr[i]) == pattern)
                count++;
        }
        
        return count;
    }
    
}
