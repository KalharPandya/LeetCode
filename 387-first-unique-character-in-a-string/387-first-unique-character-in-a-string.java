class Solution {
    public int firstUniqChar(String s) {
        int db[] = new int[26];
        char funique = s.charAt(0);
        for (int i = s.length()-1; i >=0 ; i--) {
            db[s.charAt(i) - 'a'] ++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(db[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}