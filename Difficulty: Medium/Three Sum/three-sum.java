
class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] nums) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++)
        {
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1, k = nums.length-1;
            while(j<k)
            {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum > 0)
                {
                    k--;
                }
                else if(sum < 0)
                {
                    j++;
                }
                else
                {
                    ArrayList<Integer> ad = new ArrayList<>();
                    ad.add(nums[i]);
                    ad.add(nums[j]);
                    ad.add(nums[k]);
                    result.add(ad);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1])
                    {
                        j++;
                    }
                    while(j < k && nums[k] == nums[k+1])
                    {
                        k--;
                    }
                }
            }
        }
        return result;
    }
}
