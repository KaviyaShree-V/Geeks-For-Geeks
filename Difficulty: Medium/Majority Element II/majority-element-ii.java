class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        List<Integer> result = new ArrayList<>();
        int count1 = 0, count2 = 0;
        int element1 = Integer.MIN_VALUE, element2 = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            if(count1 == 0 && element2 != nums[i])
            {
                count1++;
                element1 = nums[i];
            }
            else if(count2 == 0 && element1 != nums[i])
            {
                count2++;
                element2 = nums[i];
            }
            else if(element1 == nums[i])
            {
                count1++;
            }
            else if(element2 == nums[i])
            {
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }
        }
        
        int c1 = 0, c2 = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(element1 == nums[i])
            {
                c1++;
            }
            if(element2 == nums[i])
            {
                c2++;
            }
        }
        
        int n = (nums.length/3)+1;
        if(c1 >= n)
        {
            if(!(result.contains(element1)))
            result.add(element1);
        }
        if(c2 >= n)
        {
            result.add(element2);
        }
        Collections.sort(result);
        return result;
    }
}