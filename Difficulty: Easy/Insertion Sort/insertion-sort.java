//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            new Solution().insertionSort(arr);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            // System.out.println();

            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// class Solution {
//     // Please change the array in-place
//     public void insertionSort(int arr[]) {
//         // code here
//         for(int i=0;i<arr.length;i++){
//             int k=i;
//             while(k>0 && arr[k-1]>arr[k]){
//                 int temp = arr[k-1];
//                 arr[k-1] = arr[k];
//                 arr[k] = temp;
//                 k--;
//             }
//         }
//     }
// }

class Solution {
    
    // Please change the array in-place
    public void insertionSort(int arr[])
    {
    int index=0;
    check(index,arr);
    }
    
    void check(int index,int[] arr)
    {
        if(index==arr.length)
        return;
        
         int k=index;
         while(k>0 && arr[k-1]>arr[k])
         {
                int temp = arr[k-1];
                arr[k-1] = arr[k];
                arr[k] = temp;
                k--;
            }
        
        check(index+1,arr);
    }
}