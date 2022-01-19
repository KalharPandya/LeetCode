class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int[] result = new int[2];
        int r = nums.length - 1;
        int s = 0;
        while(l!=r){
            s = nums[l] + nums[r];
            if( s > target) r--;
            else if(s  < target)l ++;
            else break;
        }
        result[0] = ++l;
        result[1] = ++r;
        return result;
    }
}