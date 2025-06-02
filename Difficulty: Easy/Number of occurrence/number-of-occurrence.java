class Solution 
{
    int countFreq(int[] arr, int target) 
    {
        // code here
        int low = 0, high = arr.length - 1;
        int count1 = -1, count2 = -1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(arr[mid] == target)
            {
                count1 = mid;
                low = mid + 1;
            }
            else if(arr[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        low = 0;
        high = arr.length - 1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(arr[mid] == target)
            {
                count2 = mid;
                high = mid - 1;
            }
            else if(arr[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        if(! (count1 < 0 && count2 < 0))
        {
            return count1 - count2 + 1;
        }
        return 0;
    }
}
