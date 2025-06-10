// User function Template for Java
class Solution {
    public static int aggressiveCows(int[] stalls, int k) 
    {
        // code here
        int n = stalls.length;
        Arrays.sort(stalls);
        int low = 1, high = stalls[n - 1];
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(check(stalls, mid, k) == true)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return high;
    }
    
    public static boolean check(int[] stalls, int mid, int k)
    {
        int cow = 1, last = stalls[0];
        for(int i=1; i<stalls.length; i++)
        {
            if((stalls[i] - last) >= mid)
            {
                cow++;
                last = stalls[i];
            }
            if(cow >= k)
            return true;
        }
        return false;
    }
}