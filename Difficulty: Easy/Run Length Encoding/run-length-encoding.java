class Solution {
    public static String encode(String s) 
    {
        // code here
        StringBuilder sol = new StringBuilder();
        int count = 0;
        char c = s.charAt(0);
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == c)
            {
                count++;
            }
            else
            {
                sol.append(c);
                sol.append(count);
                c = s.charAt(i);
                count = 1;
            }
        }
        sol.append(c);
        sol.append(count);
        return sol.toString();
    }
}