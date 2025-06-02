// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) 
    {
        // Code here
        int low = 0, high = arr.size() - 1;
        int min = Integer.MAX_VALUE;
        int index = 0;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(low <= high)
            {
                if(arr.get(low) < min)
                {
                    index = low;
                    min = arr.get(low);
                }
            }
            if(arr.get(low) <= arr.get(mid))
            {
                if(arr.get(low) < min)
                {
                    index = low;
                    min = arr.get(low);
                }
                low = mid + 1;
            }
            else
            {
                if(arr.get(mid) < min)
                {
                    index = mid;
                    min = arr.get(mid);
                }
                high = mid - 1;
            }
        }
        return index;
    }
}