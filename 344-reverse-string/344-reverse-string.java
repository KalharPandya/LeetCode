class Solution {
    public void reverseString(char[] s) {
        int length = s.length;
        for(int i = 0 ; i < length/2 ; i ++){
            
            s[i] += s[length - 1 - i];
            s[length - 1 - i] = (char)(s[i] - s[length - 1 - i]);
            s[i]-=s[length - 1 - i];
        }
    }
}