class Solution {
    public String reverseWords(String s) {
        int length = s.length();
        char [] str = s.toCharArray();
        int l = 0; char c; int wlen = 0, i;
        for(i = 0 ; i < length; i ++){
            if(str[i] == ' '){
                for(int j = 0 ; j < (i-l)/2; j ++){
                    c = str[l+j];
                    str[l+j] = str[i-1 - j];
                    str[i-1 - j] = c;
                }    
                l = i+1;   
            }
        }
        for(int j = 0 ; j < (length-l)/2; j ++){
            c = str[l+j];
            str[l+j] = str[length-1 - j];
            str[length-1 - j] = c;
         }
        
        return new String(str);
    }
}