class Solution {
    int binarySearch(int [] nums , int l , int r, int target){
        
        if(nums[(l+r)/2] == target){
            return (l+r)/2;
        }
        if(l >= r )
            return -1;
        if(nums[(l+r)/2] > target){
            return binarySearch(nums , l, (l+r)/2, target);
        }
        if(nums[(l+r)/2] < target)
            return binarySearch(nums, (l+r)/2 + 1 , r, target);
        return -1;
    }
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, -1  + nums.length , target);
    }
}