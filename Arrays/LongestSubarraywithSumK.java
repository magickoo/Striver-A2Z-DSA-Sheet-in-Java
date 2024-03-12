1)Brute Force ( TC: O(n3) , O(1))
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
2) 
    public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int len=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            long s=0;
            for(int j=i;j<n;j++){
                
                s=s+a[j];
                if(s==k){
                    len=Math.max(len,j-i+1);
                }
                
            }
        }
        return len;
    }
}
3) Hashing O(n*logn) O(n)

import java.util.*;
public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        Map<Long,Integer> preSumMap = new HashMap<>();
        long sum=0;
        int maxlen=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            sum += a[i];

            if(sum==k){
                maxlen = Math.max(maxlen,i+1);
            }

        long rem = sum - k;
        if(preSumMap.containsKey(rem)){
            int len = i-preSumMap.get(rem);
            maxlen= Math.max(maxlen,len);
        }
        if(!preSumMap.containsKey(rem)){
            preSumMap.put(sum,i);
        }

        }
        return maxlen;
    }
}
    
4) two pointers 
    
