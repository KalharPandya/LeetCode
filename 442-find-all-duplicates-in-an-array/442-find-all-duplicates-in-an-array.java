class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList();
        int l = nums.length;
        int index = 0;
        
        for(int i = 0 ; i < l ; i ++){
            index = Math.abs(nums[i]) -1;
            nums[index]=-nums[index];
            if(nums[index] >=0)
                ans.add(Math.abs(nums[i]));
        }
        return ans;
    }
}