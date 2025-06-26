// User function Template for Java
class Solution {
    String isVowel(char c) {
        // code here
        String s ="aeiouAEIOU";
        String str = String.valueOf(c);
        if(s.contains(str))
        return "YES";
        return "NO";
    }
}
