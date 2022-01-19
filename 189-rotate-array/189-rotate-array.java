class Solution {
    
    public void rotate(int[] nums, int k) {
        if(k == 0 || nums.length == 1)
            return;
        k = k%nums.length;
        int cptr = 0;
        int counter = 0;
        int temp;
        int prev = nums[0];
        int cst = 0;
        while(counter < nums.length){
                cptr = (cptr + k)%nums.length;
                temp = prev;
                prev = nums[cptr];
                nums[cptr] = temp;
                counter ++;
                if(cptr == cst){
                    cptr ++;
                    cst ++;
                    if(cptr >= nums.length)
                        break;
                    prev = nums[cptr];
                }
        }
        
    }
}