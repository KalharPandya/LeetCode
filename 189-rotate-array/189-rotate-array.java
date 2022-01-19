class Solution {
    
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        if(k == 0 || length == 1)
            return;
        k = k%length;
        int cptr = 0;
        int counter = 0;
        int temp;
        int prev = nums[0];
        int cst = 0;
        while(counter < length){
                cptr = (cptr + k)%length;
                temp = prev;
                prev = nums[cptr];
                nums[cptr] = temp;
                counter ++;
                if(cptr == cst){
                    cptr ++;
                    cst ++;
                    if(cptr >= length)
                        break;
                    prev = nums[cptr];
                }
        }
        
    }
}