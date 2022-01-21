class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int reqMatrics [] = new int[26] ;
        int reqSum = 0;
        int s1length = s1.length();
        if(s1length > s2.length())
            return false;
        int curMatrics [] = new int[26] ;
        int curSum = 0;
        for(int i = 0 ; i < s1length ; i ++){
            reqMatrics[(s1.charAt(i) - 'a')] ++;
            reqSum+=(s1.charAt(i) - 'a');
        }
        int i = 0;
        // System.out.println(Arrays.toString(reqMatrics));
        // System.out.println(reqSum);
        for(;i<s1length-1;i++){
            curMatrics[(s2.charAt(i) - 'a')] ++;
            curSum+=(s2.charAt(i) - 'a');
        }
        for( ; i < s2.length(); i ++){
            curSum+=(s2.charAt(i) - 'a');
            curMatrics[(s2.charAt(i) - 'a')] ++;
            // for(int j = i-s1length+1 ; j <= i ; j++){
            //     System.out.print(s2.charAt(j));
            // }
            // System.out.println();
            // System.out.println(Arrays.toString(curMatrics));
            // System.out.println(curSum);
            if(curSum == reqSum){
                if(Arrays.equals(curMatrics, reqMatrics)) return true;
            }
            curSum-=(s2.charAt(i-s1length+1) - 'a');
            curMatrics[(s2.charAt(i-s1length+1) - 'a')] --;
        }
        return false;
    }
}