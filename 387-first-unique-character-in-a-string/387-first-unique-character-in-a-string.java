import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        int db[] = new int[26];
        int funique = -1;
        Deque<Integer> q
                = new ArrayDeque<>();
        q.addFirst(-1);
        for (int i = s.length()-1; i >=0 ; i--) {
            db[s.charAt(i) - 'a']++;
            if (q.peekFirst() != -1 && db[s.charAt(q.peekFirst()) - 'a'] > 1)
                q.removeFirst();
            if (db[s.charAt(i) - 'a'] == 1) {
                q.addFirst(i);
                funique = i;
            }
        }
        int n = 0;
        while (!q.isEmpty()){
            n=q.pollFirst();
            if(n==-1)
                return n;
            if(db[s.charAt(n)-'a']==1){
                return n;
            }
        }
        return -1;
    }
}