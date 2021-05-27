class Solution{
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]
    
    //Function to sort an array according to the other array.
    public static int[] sortA1ByA2(int arr1[], int n, int arr2[], int m)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i: arr1){
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else
                map.put(i, 1);
        }
        
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i: arr2){
            if(map.containsKey(i)){
                int count = map.get(i);
                for(int k=0; k<count; k++)
                    ans.add(i);
                    
                map.remove(i);
            }
        }
        
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: arr1){
            if(map.containsKey(i)){
                int count = map.get(i);
                for(int k=0; k<count; k++)
                    list.add(i); 
                    
                map.remove(i);
            }
        }
        
        Collections.sort(list);
        
        for(int i=0; i<list.size(); i++)
            ans.add(list.get(i));
            
        int ansArr[] = new int[ans.size()];
        for(int i=0; i<ans.size(); i++)
            ansArr[i] = ans.get(i);
            
        return ansArr;
    }
}
