class Solution { 
    public static long sumBetweenTwoKth(long arr[], long n, long k1, long k2)
    {
        long first = kthSmallestNumber(arr, k1);
        long seconnd = kthSmallestNumber(arr, k2);
        
        long sum = 0;
        for(long i: arr){
            if(first < i && seconnd > i)
                sum += i;
        }
        return sum;
    }
    
    private static long kthSmallestNumber(long arr[], long k){
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(long i: arr){
            pq.add(i);
            if(pq.size() > k)
                pq.poll();
        }
        
        return pq.peek();
    }
}
