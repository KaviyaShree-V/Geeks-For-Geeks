//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().missingNum(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends

import java.util.*;
class Solution {
    int missingNum(int nums[]) {
        // code here
        // int max = 0, count = 0;
        // if(nums.length==1 && nums[0]==1)
        // {
        //     return 2;
        // }
        // ArrayList<Integer> check = new ArrayList<>();
        // for(int i=0; i<nums.length; i++)
        // {
        //     check.add(nums[i]);
        //     max= Math.max(max, nums[i]);
        // }
        // for(int i=0; i<=max; i++)
        // {
        //     if(!check.contains(i))
        //     {
        //         count=i;
        //     }
        // }
        // return count;
        
        
    Arrays.sort(nums);
    int index=1;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==index){
            index++;
        }
    }
    return index;
    }
}