Brute Force
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int arr[] =new int[n+1];
        for(int i=0;i<n;i++){
            if(nums[i]>=0 && nums[i]<=n){
                arr[nums[i]]=1;
            }
        }
        for(int i=0;i<n+1;i++){
            if(arr[i]==0){
                return i;
            }
        }
        return -1;
        
    }
}

Complexity Analysis
Time Complexity: O(N) + O(N) ~ O(2*N),  where N = size of the array+1.
Space Complexity: O(N), where N = size of the array+1. Here we are using an extra hash array of size N+1.
  
Better
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum = (n*(n+1))/2 ; 
        for(int i=0;i<n;i++){
            sum = sum - nums[i];
                
    }
    return sum;

}
}

Optimal
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int res =0;
        for(int i=0;i<n;i++){
            res =  res ^ i ^ nums[i];
    }
    res=res^n;
    return res;

}
}
Time Complexity: O(N), where N = size of array+1.
Reason: Here, we need only 1 loop to calculate the XOR. The loop runs for approx. N times. So, the time complexity is O(N).

Space Complexity: O(1) as we are not using any extra spa
