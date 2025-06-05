/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution 
{
    int floorSqrt(int n) 
    {
        // Your code here
        int low = 1, high = n;
        while(low <= high)
        {
            long mid = (low + high)/2;
            long m = mid * mid;
            if(m <= (long)n)
            {
                low = (int)mid + 1;
            }
            else
            {
                high = (int)mid - 1;
            }
        }
        return high;
    }
}