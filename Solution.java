class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max_first = Integer.MIN_VALUE, max_end = 0;
        for(int i=0; i<n; i++){
            max_end = max_end + nums[i];
             if (max_first < max_end) 
                max_first = max_end; 
            if (max_end < 0) 
                max_end = 0;
        }
        return max_first;
        
        
    }
}
