// User function Template for Java

class Solution {
    public int nthRoot(int n, int m)
    {
        // code here
        int low = 1, high = m;
        if(n == 1)
            return m;
        if(m == 1)
            return 1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            int check = check(mid, n, m);
            if(check == 2)
            {
                high = mid - 1;
            }
            else if(check == 1)
            {
                return mid;
            }
            else
            {
                low = mid + 1;
            }
        }
        return -1;
    }
    
    public int check(int mid , int n, int m)
    {
        long ans = 1;
        for(int i=1; i<=n; i++)
        {
            ans = ans * mid;
            if(ans > m)
            return 2;
        }
        if(ans == m)
            return 1;
        return 0;
    }
}