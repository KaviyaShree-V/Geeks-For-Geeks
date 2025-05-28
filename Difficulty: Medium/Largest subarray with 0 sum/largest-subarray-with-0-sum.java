class Solution {
    int maxLen(int arr[]) {
        // code here
        HashMap<Integer, Integer> check = new HashMap<>();
        int sum = 0, max = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];
            if(sum == 0)
            {
                max = i+1;
            }
            else
            {
                if(check.containsKey(sum))
                {
                    int index = i - check.get(sum);
                    max = Math.max(max, index);
                }
                else
                {
                    check.put(sum,i);
                }
            }
        }
        return max;
    }
}