class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        ArrayList<Integer> check = new ArrayList<>();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, count=0, send=0;
        for(int i=0; i<arr.length; i++)
        {
            check.add(arr[i]);
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        
        for(int i=min; i<=max; i++)
        {
            if(check.contains(i))
            {
                count++;
                send = Math.max(send, count);
            }
            else
            {
                count = 0;
            }
        }
        return send;
    }
}