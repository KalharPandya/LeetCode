class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        
        int left=0;
        int right=numbers.length-1;
        
        while(left<right){
            int sum = numbers[left]+numbers[right];
            
            if(sum==target){
                result[0]=left+1;
                result[1]=right+1;
                break;
            } else if(sum>target){
                right--;
            } else{
                left++;
            }
                
            
        }
        
        
        //this solution is exceeding the expected time
        // for(int i=0;i<numbers.length;i++){
        //    for(int j=numbers.length-1;j>i;j--){
        //     if(numbers[i]+numbers[j]==target){
        //         result[0] = i+1;
        //         result[1] = j+1;
        //     }
        //    }
        // }
        
        return result;
    }
}