class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        int i = 0;
        int length = nums.length;
        for( ; i < length ; i ++)
            if(nums[i] != 0)    nums[l++] = nums[i];
            
        for( i = l; i < length ; i ++)
            nums[i] = 0;
        
    
    }
}