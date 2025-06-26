import java.math.BigInteger;
class Solution {
    // Complete the function
    int remainderWith7(String n) {
        // Your code here
        // int num = Integer.parseInt(n);
        // int remainder = num;
        // if(num<7)
        // return num;
        // else
        // {
        //     remainder = num % 7;
        // }
        // return remainder;
        BigInteger big = new BigInteger(n);
        BigInteger remainder = big.mod(BigInteger.valueOf(7));
        return remainder.intValue(); 
    }
}