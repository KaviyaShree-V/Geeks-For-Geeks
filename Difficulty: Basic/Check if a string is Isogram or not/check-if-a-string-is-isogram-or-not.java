

class Solution {
    // Function to check if a string is Isogram or not.
    static boolean isIsogram(String data) {
        // Your code here
        char[] ch = data.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<ch.length;i++)
        {
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) 
        {
            int value = entry.getValue();
            if(value>1)
            return false;
        }
        return true;
    }
}