class Solution {
    public void moveZeroes(int[] nums) {
        int w = 0;
        int zero = 0;
        for(int r = 0; r < nums.length; r++) {
            if(nums[r] != 0) {
                nums[w++] = nums[r];
            }
            else zero++;
        }
        while(zero-->0) {
            nums[w++] = 0;
        }
    }
}