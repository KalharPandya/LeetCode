class Solution {
    public int getCharPos(char c){
        return (int)c-(int)'a';
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] r_map = new int[26];
        int[] m_map = new int[26];
        ransomNote.toLowerCase();
        magazine.toLowerCase();
        Arrays.fill(r_map,0);
        Arrays.fill(m_map,0);
        for(int i=0;i<ransomNote.length();i++){
            r_map[getCharPos(ransomNote.charAt(i))]++;
        }
        for(int i=0;i<magazine.length();i++){
            m_map[getCharPos(magazine.charAt(i))]++;
        }
        for(int i=0;i<26;i++){
            if(r_map[i]>m_map[i]){
                return false;
            }
        }
        return true;
    }
}