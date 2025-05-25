class Solution {
    // Function to locate the occurrence of the string x in the string s.
    int firstOccurence(String txt, String pat) {
        // Your code here
        if(txt.contains(pat))
      {
        return txt.indexOf(pat);
      }
      return -1;
    }
}