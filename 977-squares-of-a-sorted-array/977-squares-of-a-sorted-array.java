class Solution {
    public int[] sortedSquares(int[] nums) {
        int pos = 0;
        int ansIndex = 0;
        Stack <Integer> stack = new Stack();
        for(int i : nums){
            if(i>=0)
                break;
            stack.push(i);
            pos++;
        }
        while(!stack.isEmpty() && pos < nums.length){
            if(stack.peek()*-1 < nums[pos]){
                nums[ansIndex++] = (int)Math.pow(stack.pop(),2);
            }
            else{
                nums[ansIndex++] = (int)Math.pow(nums[pos++],2);
            }
        }
        while(!stack.isEmpty()){
            nums[ansIndex++] = (int)Math.pow(stack.pop(),2);
        }
        while(pos < nums.length){
            nums[ansIndex++] = (int)Math.pow(nums[pos++],2);
        }
        return nums;   
    }
}