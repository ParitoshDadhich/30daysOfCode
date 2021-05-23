class Solution {
    static int trappingWater(int[] height, int n) {
        int mxl[] = new int[n];
        int mxr[] = new int[n];
        
        if(n==0)
            return 0;
        
        // for mxl, we traverse from left to right
        mxl[0] = height[0];
        for(int i=1; i<n; i++)
            mxl[i] = Math.max(mxl[i-1], height[i]);
        
        // for mxr, we traverse from right to left;
        mxr[n-1] =height[n-1];
        for(int i=n-2; i>=0; i--)
            mxr[i] = Math.max(mxr[i+1], height[i]);
        
        int water[] = new int[n];
        for(int i=0; i<n; i++)
            water[i] = Math.min(mxl[i], mxr[i]) - height[i];
        
        int sumWater = 0;
        for(int i: water)
            sumWater += i;
        
        return sumWater;
    }
}

