class Solution {
    public static boolean areAnagrams(String s1, String s2) 
    {
        // code here
        char[] ch = s1.toCharArray();
        char[] c = s2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(c);
        s1 = String.valueOf(ch);
        s2 = String.valueOf(c);
        if(s1.equals(s2))
        return true;
        return false;
    }
}