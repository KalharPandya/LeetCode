class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int cr = mat.length;
        int cc = mat[0].length;
        if(r*c!=cr*cc)
            return mat;
        int ans[][] = new int[r][c];
        for (int i = 0; i < cr*cc; i++) {
            ans[i/c][i%c]=mat[i/cc][i%cc];
        }

        return ans;
    }
}