class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        int i = 0;
        for( ; i < nums.length ; i ++){
            if(nums[i] != 0){
                nums[l++] = nums[i];
            }
        }
        for( i = l; i < nums.length ; i ++){
            nums[i] = 0;
         }
        
    }
}