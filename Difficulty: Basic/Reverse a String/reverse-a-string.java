class Solution {
    static String revStr(String s) {
        // code here
        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length/2; i++)
        {
            char c = ch[i];
            ch[i] = ch[ch.length-1-i];
            ch[ch.length-1-i] = c;
        }
        return String.valueOf(ch);
    }
}