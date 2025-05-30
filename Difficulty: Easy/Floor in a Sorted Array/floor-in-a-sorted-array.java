class Solution {

    static int findFloor(int[] arr, int x) 
    {
        // write code here
        int end = arr.length-1, send = -1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == x)
            {
                send = i;
                continue;
            }
            else if(arr[i]<x)
            {
                send = i;
                continue;
            }
            if(arr[i] > x)
            {
                send = i-1;
                break;
            }
        }
        return send;
    }
}
