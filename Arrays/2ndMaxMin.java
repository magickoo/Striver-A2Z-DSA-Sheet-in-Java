import java.util.*;
public class Solution {
    public static int[] getSecondOrderElements(int n, int []arr) {
        // Write your code here.
        int ans[]=new int[2];
        int small=Integer.MAX_VALUE;
        int second_small=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<small){
                second_small=small;
                small=arr[i];
            }
            else if(arr[i]<second_small && arr[i]!=small){
                second_small=arr[i];
            }
        }

        int large= Integer.MIN_VALUE;
        int second_large=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>large){
                second_large=large;
                large=arr[i];
            }
            else if(arr[i]>second_large && arr[i]!=large){
                second_large= arr[i];
            }
        }
        ans[0]=second_large;
        ans[1]=second_small;
        return ans;
    }
}
Time Complexity: O(N), Single-pass solution

Space Complexity: O(1)
