class Solution { 
    
    public static void merge(int []arr, int l,int m, int r){
        int k = l;
        int n1 = m - l + 1;
        int n2 = r-m;
        int [] larr = new int[n1];
        int [] rarr = new int[n2];
        for (int i = 0; i < n1; i++) larr[i] = arr[l + i];
        for (int i = 0; i < n2; i++) rarr[i] = arr[m + i +1];
        int i = 0;
        int j = 0;
        while (i < n1 && j < n2){
            if(larr[i] < rarr[j])
                arr[k++] = larr[i++];
            else
                arr[k++] = rarr[j++];
        }
        while (i<n1)    arr[k++] = larr[i++];
        while (j<n2)    arr[k++] = rarr[j++];
    }

    public static void sort(int [] arr, int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            sort(arr,l,mid);
            sort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    public static void sort(int [] arr){
        sort(arr,0,arr.length-1);
    }
    public boolean containsDuplicate(int[] nums) {
        sort(nums);
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(prev == nums[i])
                return true;
            prev = nums[i];
        }
        return false;
    }
    
}