class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])&& target == 2*nums[i]){
                return new int[]{map.get(nums[i]),i};
            }
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {

            int ansKey = target-nums[i];
            if(ansKey == nums[i])
                continue;
            if(map.containsKey(ansKey)){
                return new int[]{i,map.get(ansKey)};
            }
        }
        int ans[] = new int[2];
        return ans;
    }
}