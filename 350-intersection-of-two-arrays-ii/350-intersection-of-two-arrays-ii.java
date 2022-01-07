class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int []db = new int[1001];
        int ans[] = new int[Math.min(nums1.length, nums2.length)];
        int aindex = 0;
        for (int i:
             nums1) {
            db[i]+=1;
        }
        for (int i:
                nums2) {
            if(db[i]-->=1){
                ans[aindex++] = i;
            }
        }
        
        return Arrays.copyOfRange(ans,0,aindex);
    }
}