class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int[] result = new int[2];
        int r = nums.length - 1;
        while(l!=r){
            if(nums[l] + nums[r]  > target) r--;
            else if(nums[l] + nums[r]  < target)l ++;
            else break;
        }
        result[0] = ++l;
        result[1] = ++r;
        return result;
    }
}