class Solution {
    public int m = 0;
    public int findRow(int[][]arr,int l, int r, int x) {
        if (r < l)
            return -1;
        m = (l + r) / 2;
        if (arr[m][0] <= x && arr[m][arr[m].length - 1] >= x) {
            return m;
        }
        if (arr[m][0] > x)
            return findRow(arr, l, m - 1, x);

        return findRow(arr, m + 1, r, x);
    }
    public boolean findCol(int[][]arr,int row,int l, int r, int x) {
        if(row<0)
            return false;
        if (r < l)
            return false;
        m = (l + r) / 2;
        if (arr[row][m] == x) {
            return true;
        }
        if (arr[row][m] > x)
            return findCol(arr,row, l, m - 1, x);

        return findCol(arr,row,m + 1, r, x);
    }


    public boolean searchMatrix(int[][] matrix, int target) {
        return findCol(matrix,(findRow(matrix,0,matrix.length-1,target)),0,matrix[0].length-1,target);
    }
}