/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n == 1) return 1;
        int l = 1, r = n;
        int m = 0;
        while(l<r){
            m = r/2 + l/2;
            if(isBadVersion(m)){
                r = m;
            }
            else{
                l = m+1;
            }
        }
        return l;
    }
}