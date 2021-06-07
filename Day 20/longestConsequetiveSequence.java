import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

class Solution {
	public int  longestConsecutive(int[] arr) {
	 	HashMap<Integer, Boolean> map = new HashMap<>();
        
        for(int i: arr)
            map.put(i, true);
    
        int maxLength = 0;
        int l = arr.length;
        for(int i: arr){
             
            int length = 0;
            // forward;
            int ele = i;
            while(map.containsKey(ele) && map.get(ele)){
                length++;
                map.put(ele, false);
                ele++;
            }
            
            //backword
            ele = i -1;
            while(map.containsKey(ele) && map.get(ele)){
                length++;
                map.put(ele, false);
                ele--;
            }
            
            if(maxLength < length){
                maxLength = length;
            }
        }
        return maxLength;     
    }
    
}
