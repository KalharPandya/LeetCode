class Solution {
    public int maxSubArray(int[] nums) {
        int maxScore = nums[0];
        int cindex = nums.length-1;
        int currentReward = 0;
        while (cindex>=0){
            currentReward+=nums[cindex--];
            maxScore = Math.max(currentReward,maxScore);
            if(currentReward<=0){
                currentReward=0;
                continue;
            }
        }
        return maxScore;
    }
}