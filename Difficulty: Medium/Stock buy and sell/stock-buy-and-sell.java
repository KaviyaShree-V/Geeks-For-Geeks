// User function Template for Java

class Solution {
    // Function to find the days of buying and selling stock for max profit.
    int stockBuySell(int arr[]) {
        // code here
        int total = 0, profit = 0, check = arr[0];
        for(int i = 0; i<arr.length; i++)
        {
            int p = arr[i]-check;
            profit = Math.max(p, profit);
            
            if(i==arr.length-1)
            {
                total+=profit;
            }
            
            if(i+1 < arr.length && arr[i+1] <= arr[i])
            {
                total += profit;
                profit = 0;
                check = arr[i+1];
            }
        }
        return total;
    }
}
