class Solution {
    public int maxArea(int he, int w, int[] h, int[] v) {
        // matrix start from 0 index only;
        int len = 0;
        int wid = 0;
        Arrays.sort(h);
        Arrays.sort(v);
        
        if(h.length == 1)
            len = Math.max(Math.abs(h[0]-0), Math.abs(h[0]-he));
        else{
            int n = h.length;
            for(int i=0; i<n-1; i++){
                len = Math.max(len, Math.abs(h[i+1]-h[i]));
                int l1 = Math.abs(h[0]-0);
                int l2 = Math.abs(h[n-1]-he);
                
                len = Math.max(len, Math.max(l2, l1));
            }
        }
        
        
        
        if(v.length == 1)
            wid = Math.max(Math.abs(v[0]-0), Math.abs(v[0]-w));
        else{
            int n = v.length;
            for(int i=0; i<n-1; i++){
                wid = Math.max(wid, Math.abs(v[i+1]-v[i]));
                int l1 = Math.abs(v[0]-0);
                int l2 = Math.abs(v[n-1]-w);
                
                wid = Math.max(wid, Math.max(l2, l1));
            }
        }
        
        long val = 1L*len*wid;
        return (int)(val%1000000007);
    }
}


/*
class Solution {
    public int maxArea(int he, int w, int[] h, int[] v) {
        // matrix start from 0 index only;
        Arrays.sort(h);
        Arrays.sort(v);
        
        int hLength = h.length;
        int len = Math.max(h[0]-0, he-h[hLength-1]);

            for(int i=1; i<hLength; i++){
                int diff = h[i]-h[i-1];
                len = Math.max(len, diff);
            }
            
        int vLength = v.length;
        int wid = Math.max(v[0]-0, w-v[vLength-1]);
        
            for(int i=1; i<vLength; i++){
                int diff = v[i]-v[i-1];
                wid = Math.max(wid, diff);
            }
        
        long val = 1L*len*wid;
        return (int)(val%1000000007);
    }
}

 
