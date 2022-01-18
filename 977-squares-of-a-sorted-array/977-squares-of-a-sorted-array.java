class Solution {
    public int[] sortedSquares(int[] nums) {
        int pos = 0;
        int neg = 0;
        int cindex = 0;
        int ansIndex = 0;
        int ans[] = new int[nums.length];
        for(int i : nums){
            if(i>=0)
                break;
            cindex++;
        }
        pos = cindex;
        neg = cindex-1;
        while(neg>=0 && pos < nums.length){
            if(nums[neg]*-1 < nums[pos]){
                ans[ansIndex++] = (int)Math.pow(nums[neg--],2);
            }
            else{
                ans[ansIndex++] = (int)Math.pow(nums[pos++],2);
            }
        }
        while(neg>=0){
            ans[ansIndex++] = (int)Math.pow(nums[neg--],2);
        }
        while(pos < nums.length){
            ans[ansIndex++] = (int)Math.pow(nums[pos++],2);
        }
        return ans;   
    }
}