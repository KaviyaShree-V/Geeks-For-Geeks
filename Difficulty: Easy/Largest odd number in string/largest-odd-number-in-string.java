//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String s = br.readLine();
            Solution obj = new Solution();
            System.out.println(obj.maxOdd(s));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends

import java.util.*;
class Solution {

    String maxOdd(String num) {
        // code here
        int index = -1;
        index = Math.max(num.lastIndexOf('1'),index);
        index = Math.max(num.lastIndexOf('3'),index);
        index = Math.max(num.lastIndexOf('5'),index);
        index = Math.max(num.lastIndexOf('7'),index);
        index = Math.max(num.lastIndexOf('9'),index);
        return num.substring(0,index+1);
    }
}