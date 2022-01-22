class Solution {
    int [][] image;
    int newColor ;
    int m;
    int n;
    int oldColor = 0;
    public void dfs(int sr, int sc){
        // System.out.println(sr + ", " + sc);
        if(sr < 0 || sr >= m || sc < 0 || sc >=n)
            return;
        if(image[sr][sc]!= oldColor){
            return;
        }
        image[sr][sc] = newColor;
        dfs(sr, sc +1);
        dfs(sr, sc -1);
        dfs(sr+1, sc);
        dfs(sr-1, sc);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        this.image = image;
        oldColor = image[sr][sc];
        if(oldColor!=newColor){
            this.newColor = newColor;

            m = image.length;
            n = image[0].length;
            dfs(sr,sc);
        }
        return image;
    }
}