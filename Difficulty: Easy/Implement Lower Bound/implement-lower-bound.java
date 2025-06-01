class Solution 
{
    int lowerBound(int[] arr, int target) 
    {
        int low = 0,count = arr.length, high = arr.length - 1;
        for(int i=0; i<arr.length; i++)
        {
            int mid = (low + high)/2;
            if(arr[mid] >= target)
            {
                count = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return count;
    }
}
