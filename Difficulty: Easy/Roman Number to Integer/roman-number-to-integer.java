// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String s) 
    {
        // code here
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        int check = 0;

        for (int i = s.length() - 1; i >= 0; i--) 
        {
            int amount = map.get(s.charAt(i));
            if (amount < check)
                total -= amount;
            else
                total += amount;
            check = amount;
        }

        return total;
    }
}