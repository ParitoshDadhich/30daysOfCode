class Solution {
    
    class Pair{
        int key;
        int value;
        
        Pair(int key, int value){
            this.key = key;
            this.value = value;
        }
        
    }
    
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        
        // make max priority queue
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            new Comparator<Pair>(){
                public int compare(Pair a, Pair b){
                    return b.key - a.key;
                }
        });
        
        for(int i: arr){
            pq.add(new Pair(Math.abs(i-x), i));
            
            if(pq.size() > k)
                pq.poll();
        }
        
        while(pq.size() != 0){
            Pair p = pq.poll();
            list.add(p.value);
        }
        
        Collections.sort(list);
        return list;
    }
}


 
