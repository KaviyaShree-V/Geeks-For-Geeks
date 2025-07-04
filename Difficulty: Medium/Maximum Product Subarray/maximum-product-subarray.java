class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] nums) {
        // code here
        int prefix = 1, suffix = 1;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            if(prefix == 0)
            {
                prefix = 1;
            }
            if(suffix == 0)
            {
                suffix = 1;
            }
            prefix *= nums[i];
            suffix *= nums[nums.length - 1 - i];
            max = Math.max(max, Math.max(prefix, suffix));
        }
        return max;
    }
}