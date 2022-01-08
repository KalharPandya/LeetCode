class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int db[] = new int[26];
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        for (char c :
                sc) {
            db[c-'a']++;
        }
        for (char c :
                tc) {
            if (db[c - 'a']-- == 0)
                return false;
        }
        return true;
    }
}