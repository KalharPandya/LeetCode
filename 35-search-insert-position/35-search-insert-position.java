class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0 ; 
        int r = nums.length;
        int m = 0;
        while(l<r){
            m = (l+r)/2;
            if(target> nums[m]){
                l = m+1;        
            }
            else if (target< nums[m]){
                r = m;
            }
            else{
                break;
            }
        
        }
        if(nums[m]<target)
            m++;
        return m;
    }
}