// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
       ArrayList<Integer> result = new ArrayList<>();
       int low = 0, high = arr.length - 1;
       int a = -1;
       while(low <= high)
       {
           int mid = (low + high)/2;
           if(arr[mid] >= x)
           {
               if(arr[mid] == x)
               a = mid;
               high = mid - 1;
           }
           else
           {
               low = mid + 1;
           }
       }
       result.add(a);
       low = 0; high = arr.length - 1;
       while(low <= high)
       {
           int mid = (low + high)/2;
           if(arr[mid] <= x)
           {
               if(arr[mid] == x)
               a = mid;
               low = mid + 1;
           }
           else
           {
               high = mid - 1;
           }
       }
       result.add(a);
       return result;
    }
}
