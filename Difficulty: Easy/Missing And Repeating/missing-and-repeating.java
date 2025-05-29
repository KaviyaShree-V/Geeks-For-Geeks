// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        long n = arr.length;
        long s1 = (n*(n+1))/2, s2 = (n*(n+1) * (2*n+1))/6;
        long val1 = 0, val2 = 0;
        for(int i=0; i<arr.length; i++)
        {
            val1 += arr[i];
            val2 += (long)arr[i] * (long)arr[i];
        }
        long findv1 = s1 - val1;
        long findv2 = s2 - val2;
        findv2 = findv2 / findv1;
        long repeat =  (findv1 + findv2)/2;
        long nfval = repeat - findv1;
        
        result.add((int) nfval);
        result.add((int) repeat);
        return result;
    }
}
