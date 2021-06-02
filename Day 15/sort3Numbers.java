public List<Integer> sort(int p, int q, int r){
        int ans[] = new int[3];
        
        if(q < p){
            int temp = p;
            p = q;
            q = temp;
        }
        
        if(r < q){
            int temp = q;
            q = r;
            r = temp;
        }
        
         if(q < p){
            int temp = p;
            p = q;
            q = temp;
        }

        
        ans[0] = p;
        ans[1] = q;
        ans[2] = r;
        
        return Arrays.asList(ans[0], ans[1], ans[2]);
    }
    
