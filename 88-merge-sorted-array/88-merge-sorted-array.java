class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] larr = new int[m];
        int[] rarr = new int[n];
        for (int i = 0; i < m; i++) {
            larr[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            rarr[i] = nums2[i];
        }
        int i = 0 ; int j = 0, k = 0;
        while (i < m && j < n){
            if(larr[i] < rarr[j])
                nums1[k++] = larr[i++];
            else
                nums1[k++] = rarr[j++];
        }
        while (i<m)    nums1[k++] = larr[i++];
        while (j<n)    nums1[k++] = rarr[j++];

    }
}