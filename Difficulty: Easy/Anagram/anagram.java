class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) 
    {
        // Your code here
        char[] chars = s1.toCharArray();
        Arrays.sort(chars);
        s1 = new String(chars);
        char[] charss = s2.toCharArray();
        Arrays.sort(charss);
        s2 = new String(charss);
        if(s1.equals(s2))
        return true;
        return false;
    }
}