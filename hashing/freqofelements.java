public class Solution {
    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.
        int hash[] = new int[n];
        for(int i=0;i<n;i++){
            int num= nums[i];
            if(num<=n){
            hash[nums[i]-1]++;
            }

        }
        return hash;
    }
}
//Time complexity:O(N)
