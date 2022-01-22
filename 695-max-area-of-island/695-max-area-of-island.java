class Solution {
    int grid[][];
    int m;
    int n;
    int ans = 0;
    public int maxAreaOfIsland(int[][] grid) {
        this.grid= grid;
        this.m = grid.length;
        this.n = grid[0].length;
        for(int i = 0 ; i < m ; i ++){
            for(int j = 0 ; j < n ; j ++){
                if(grid[i][j] == 1)
                    ans = Math.max(ans,calculateArea(i,j));
            }
        }
        return ans;
        
    }
    public int calculateArea(int i, int j){
        if(i <0 || i >=m || j < 0 || j >=n )
            return 0;
        if(grid[i][j] == 0)
            return 0;
        grid[i][j] = 0;
        return 1+calculateArea(i-1, j) +calculateArea(i+1, j) +calculateArea(i,1+ j) +calculateArea(i, j-1)  ;
    }
}