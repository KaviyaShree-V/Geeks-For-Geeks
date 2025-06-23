// User function Template for Java

class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> digits, int N) 
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();

        for (int digit : digits) 
        {
            list.add(digit);
        }

        int n = list.size();
        for (int i = n - 1; i >= 0; i--) 
        {
            if (list.get(i) < 9) {
                list.set(i, list.get(i) + 1);
                return list;
            }
            list.set(i, 0);
        }

        list.add(0, 1);
        return list;
    }
};