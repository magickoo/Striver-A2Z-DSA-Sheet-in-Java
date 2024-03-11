import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;

        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++){
            int val = mpp.getOrDefault(nums[i],0);
            mpp.put(nums[i],val+1);
        }
        for(Map.Entry<Integer, Integer> e: mpp.entrySet()){
            if(e.getValue()==1){
                return e.getKey();
            }
        }
        return -1;
    }
}
//Time Complexity: O(n)
Space: O(n)

Optimized
import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            ans=ans ^ nums[i];
        }
        return ans;

    }
}
TC: O(n)
SC: O(1)
  
