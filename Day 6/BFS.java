class Solution
{
    //Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj)
    {
        boolean visited[] = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        visited[0] = true;
        queue.add(0);
        
        while(!queue.isEmpty()){
            int curr = queue.poll();
            ans.add(curr);
            
            Iterator<Integer> i = adj.get(curr).listIterator();
            while(i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    queue.add(n);
                    visited[n] = true;
                }
            }
        }
        return ans;
    }
}
