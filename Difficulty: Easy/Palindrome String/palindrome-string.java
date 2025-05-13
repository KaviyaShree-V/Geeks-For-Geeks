//{ Driver Code Starts
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine(); // Use lowercase 's'

            Solution ob = new Solution();
            if (ob.isPalindrome(s)) // Check palindrome
                System.out.println("true");
            else
                System.out.println("false");
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    boolean isPalindrome(String s) {
        // code here
        // char[] ch = s.toCharArray();
        // String reversed = reverse(ch, ch.length-1);
        // return s.equals(reversed);
        // }
        // String reverse(char[] ch, int index) {
        //     if (index < 0) 
        //     return "";
        //     return ch[index] + reverse(ch, index - 1);
        // }
        
        StringBuilder sb = new StringBuilder();
     for(int i=0;i<s.length();i++)
     {
        char ch = s.charAt(i);
        if(Character.isLetterOrDigit(ch))
        {
            // g.append(Character.toLowerCase(ch));
             sb.append(Character.toLowerCase(ch));
        }
     }
      if (sb.length() == 0) 
      {
        return true;
      }
     for(int i=0;i<=sb.length()/2;i++)
     {
        int end = sb.length()-1-i;
        char ch = s.charAt(i);
        if (sb.charAt(i) != sb.charAt(end)) 
        {
            return false;
        }
     }
     return true;
        }
};