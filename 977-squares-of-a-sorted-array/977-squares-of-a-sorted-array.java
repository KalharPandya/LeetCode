class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int i=0;
        int j = nums.length-1;
        
        int[] ans = new int[nums.length];
        int pos = nums.length-1;
        
        while(i!=j){
            if((-nums[i])<nums[j]){
                ans[pos] = nums[j]*nums[j];
                j--;
            }
            else{  
                ans[pos] = (nums[i]*nums[i]);
                i++;
            }
               
            pos--;
        }
        ans[pos] = nums[i]*nums[i];
        return ans;
    }
}