Brute Force ( TC: O(n3) , O(1))
public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int len=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                long s=0;
                
                for(int t=i;t<=j;t++){
                    s=s+a[t];
                }

                if(s==k){
                    len=Math.max(len,j-i+1);
                }
                
            }
        }
        return len;
    }
}
