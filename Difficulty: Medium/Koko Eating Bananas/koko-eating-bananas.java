class Solution {
    public static int kokoEat(int[] arr, int k) 
    {
        // code here
        int low = 1, high = calMethod(arr);
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            long calTotal = calTotal(arr,mid);
            if(calTotal <= k)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return low;
    }
    
    public static long calTotal(int[] piles, int mid)
    {
        long total_hours = 0;
        for(int pile : piles)
        {
            total_hours += (pile + mid - 1)/mid;
        }
        return total_hours;
    }
    
    public static int calMethod(int[] piles)
    {
        int high = 0;
        for(int pile=0; pile<piles.length; pile++)
        {
            high = Math.max(high, piles[pile]);
        }
        return high;
    }
}
