//{ Driver Code Starts


import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            if (ob.isPrime(n)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    static boolean isPrime(int n) {
        // code here
        boolean b = true;
        if (n <= 1) {
            b = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    b = false;
                    break;
                }
            }
        }
    return b;
    }
}