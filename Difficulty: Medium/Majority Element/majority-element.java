// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
        // code here
        int count = 0, element = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(count == 0)
            {
                count++;
                element = arr[i];
            }
            else if(element == arr[i])
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        int c = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == element)
            {
                c++;
            }
        }
        if (c > (arr.length / 2)) 
        {
        return element;
    }
        return -1;
    }
}