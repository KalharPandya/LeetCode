class Solution {
     int [][] ans;
     int pos = 0;
    public  void validate(int rows, int cols, int rStart, int cStart){
        if((rStart >= 0 && rStart < rows) && (cStart >= 0 && cStart < cols)){
            ans[pos][0]= rStart;
            ans[pos][1]= cStart;
            pos++;
        }
    }
    public  int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        ans = new int[rows*cols][2];
        int direction =0;
        int jump = 1;
        ans[0][0] = rStart;
        ans[0][1] = cStart;
        pos++;
        int cj = 0;
        while(pos < rows*cols){

            if(direction %4 == 0){
                for (int i = 0 ; i < jump ; i ++){
                    cStart++;
                    validate(rows,cols,rStart,cStart);
                }
                direction++;
            }
            if(direction %4 == 1){
                for (int i = 0 ; i < jump ; i ++){
                    rStart++;
                    validate(rows,cols,rStart,cStart);
                }
                direction++;
                jump++;

            }
            if(direction %4 == 2){
                for (int i = 0 ; i < jump ; i ++){
                    cStart--;
                    validate(rows,cols,rStart,cStart);
                }
                direction++;
            }
            if(direction %4 == 3){
                for (int i = 0 ; i < jump ; i ++){
                    rStart--;
                    validate(rows,cols,rStart,cStart);
                }
                direction++;
                jump++;
            }
        }
        return ans;
    }
}