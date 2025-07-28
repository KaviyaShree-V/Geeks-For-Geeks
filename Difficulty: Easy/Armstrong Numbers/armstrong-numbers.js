// User function Template for javascript

/**
 * @param {number} n
 * @returns {boolean}
 */

class Solution {
    armstrongNumber(n) {
        // code here
        let num = n;
        const s = n.toString();
        const len = s.length;
        let sum = 0;
        while(num > 0)
        {
            let add = num % 10;
            let mul = 1;
            for(let i=0; i<len; i++)
            {
                mul = add * mul;
            }
            sum += mul;
            num = parseInt(num/10);
        }
        return (sum === n);
    }
}
