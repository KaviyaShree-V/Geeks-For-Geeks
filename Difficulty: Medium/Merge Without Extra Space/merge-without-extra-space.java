// User function Template for Java

class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int nums1[], int nums2[]) 
    {
        // code here
        int n = nums1.length;
        int m = nums2.length;
        int len = n + m;
        int gap = (len / 2) + ( len % 2);
        while(gap > 0)
        {
            int left = 0;
            int right = left + gap;
            while ( right < len )
            {
                if(left < n && right >= n)
                {
                    swap(nums1, nums2, left , right - n);
                }
                else if( left >= n)
                {
                    swap(nums2, nums2, left - n , right - n);
                }
                else
                {
                    swap(nums1, nums1, left , right);
                }
                left++;
                right++;
            }

            if (gap == 1) 
            break;
            else
            gap = (gap / 2) + (gap % 2);
        }
    }

    public void swap(int a[], int b[], int x, int y)
    {
        if (a == b) {
            if (a[x] > a[y]) {
                int temp = a[x];
                a[x] = a[y];
                a[y] = temp;
            }
        } else {
            if (a[x] > b[y]) {
                int temp = b[y];
                b[y] = a[x];
                a[x] = temp;
            }
        }
    }
}