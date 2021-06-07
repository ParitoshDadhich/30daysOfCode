package questions;

 
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

public class MaximizeTheCutSegments
{
  public static void main(String args[])throws IOException
  {
      //reading input using BufferedReader class
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
      
      //reading total testcases
      int t = Integer.parseInt(read.readLine());
      
      while(t-- > 0)
      {
          //reading length of line segment
          int n = Integer.parseInt(read.readLine().trim());
          
          
          //reading 3 segment lengths
          String str[] = read.readLine().trim().split(" ");
          
          int x = Integer.parseInt(str[0]);
          int y = Integer.parseInt(str[1]);
          int z = Integer.parseInt(str[2]);
          
          
          //calling method maximizeCuts() of class Solution()
          //and printinting the result
          System.out.println(new Solution().maximizeCuts(n, x, y, z));
      }
  }
}
//} Driver Code Ends


//User function Template for Java


class Solution
{
  //Function to find the maximum number of cuts.
  public int maximizeCuts(int n, int x, int y, int z)
  {
      int arr[] = new int[3];
      arr[0] = x;
      arr[1] = y;
      arr[2] = z;
     return helper(n, arr, 0, 0);
  }
  
  
  private static int helper(int n, int arr[], int sI, int count){
      if(n == 0)
          return count;
      else if(sI >= arr.length || n < 0)
          return 0;
      
      int count1=0, count2=0, count3 = 0;
      
      if(sI == 0){
          int t1=0, t2=0, t3=0;    

          t1 = helper(n-arr[sI], arr, sI, count+1);
          t2 = helper(n-arr[sI+1], arr, sI+1, count+1);
          t3 = helper(n-arr[sI+2], arr, sI+2, count+1);
          
          count1 = Math.max(t1, Math.max(t2, t3));
      }
      
      if(sI == 1){
          int t1=0, t2=0;
  
          t1 = helper(n-arr[sI], arr, sI, count+1);
          t2 = helper(n-arr[sI+1], arr, sI+1, count+1); 
      
          count2 = Math.max(t1, t2);
      }
      
      if(sI == 2){
          count3 = helper(n-arr[sI], arr, sI, count+1);
      }
      
      return Math.max(count1, Math.max(count2, count3));
          
      
  }
}
