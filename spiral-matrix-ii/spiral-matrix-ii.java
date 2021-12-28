class Solution {
    public int[][] generateMatrix(int ng) {
        int n = ng;
        int m = ng;
        int total = m*n;
        int sm = 0;
        int sn = 0;
        int[][] ans = new int[n][n];
        int cindex =-1;
        int i = 0; int j = -1;
        int direction = 0;
        while (cindex<total-1) {
            if (direction == 0) {
                j++;
                if (j == m) {
                    direction = 1;
                    j--;
                }
            }
            if(direction == 1) {
                i++;
                if(i==n) {
                    direction = 2;
                    i--;
                }


            }
            if(direction == 2) {
                j--;
                if(j<sm) {
                    direction = 3;
                    j++;
                }

            }
            if(direction == 3) {

                i--;
                if(i<sn+1) {
                    direction = 4;
                    i++;
                }
            }
            if(direction == 4) {

                m--;
                n--;
                if(sm>m && sn > n) {
                    direction = -1;
                    break;
                }
                else {
                    direction = 0;
                    sm++;
                    sn++;
                    i = sn;
                    j = sm;
                }

            }
            cindex++;
            ans[i][j]=cindex+1;
        }
        return  ans;
    }
}