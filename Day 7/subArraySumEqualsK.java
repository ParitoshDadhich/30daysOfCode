// method 1

/*
class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++){
            
            int sum = arr[i];
            if(k == sum)
                count++;
            
            for(int j=i+1; j<n; j++){
                sum += arr[j];

                if(k == sum)
                    count++;        
            }
        }
        
        return count;
    }
}

*/

/*
// method 2;

class Solution{
    public int subarraySum(int arr[], int k){
        int n = arr.length;
        int preSum[] = new int[n];
        int count = 0;
        
        preSum[0] = arr[0];
        for(int i=1; i<n; i++)
            preSum[i] = preSum[i-1] + arr[i];
        
        for(int i : preSum)
            System.out.print(i + " ");
        
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                if(i == 0)
                    sum = preSum[j];
                else
                    sum = preSum[j] - preSum[i-1];
                
                if(sum == k)
                    count++;
            }
        }
        
        return count;
    }
}

*/

// method 3 (without extra space)

/*
class Solution{
    public int subarraySum(int arr[], int k){
        int count = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += arr[j];
                if(sum == k)
                    count++;
            }
        }
        return count;
    }
}


*/

// method 4 

class Solution{
    public int subarraySum(int arr[], int k){
        int n = arr.length;
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);      // sum, count
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(map.containsKey(sum-k))
                count += map.get(sum-k);
            
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
