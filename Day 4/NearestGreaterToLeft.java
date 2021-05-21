package stack;
import java.util.*;


class NearestGreaterToLeft {
  public static void main(String args[] ) throws Exception {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int arr[] = new int[n];

     for(int i=0; i<n; i++)
          arr[i] = sc.nextInt();

      int ans[] = new int[n];
      ans = smallestElement(arr, n);

      for(int i: ans)
          System.out.print(i + " ");
  }

  private static int[] smallestElement(int arr[], int n){
      int ans[] = new int[n];
      int k = 0;
      Stack<Integer> st = new Stack<>();
   

      for(int i = 0; i < n ; i++){
          if(st.size() == 0)
              ans[k++] = -1;
              
          else if(st.size() > 0 && st.peek() > arr[i])
              ans[k++] = st.peek();
              
          else if(st.size() > 0 && st.peek() <= arr[i]){
              while(st.size() > 0 && st.peek() <= arr[i]){
                  st.pop();
              }
              
              if(st.size() == 0)
                  ans[k++] = -1;
              else
                  ans[k++] = st.peek();
          }
          
          st.push(arr[i]);
      }

      return ans;
  }
}
