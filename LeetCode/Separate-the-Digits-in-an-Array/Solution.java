/**
 * @param {number[]} nums
 * @return {number[]}
 */
const separateDigits = (nums) => {
    const res = [];
    
    for (let i = 0; i < nums.length; i++) {
        let num = nums[i];
        let pow = 0 | Math.log10(num);
        
        while (pow > -1) {
            const div = 10 ** pow--;
            const d = 0 | (num / div);
            res.push(d);
            num %= div;
        }
    }
    
    return res;
};