class Solution {

    static int findFloor(int[] arr, int target) 
    {
        // write code here
        int low = 0, high = arr.length -1;
        int result = -1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(arr[mid] <= target)
            {
                result = mid;
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return result;
    }
}
