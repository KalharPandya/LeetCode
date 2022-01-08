class Solution {
    public boolean isValid(String s) {
        char[] sc = s.toCharArray();
        Deque<Character> dq = new ArrayDeque<Character>();
        for(int i = 0; i < sc.length ; i ++){
            if(sc[i] == '('){
                dq.addFirst(')');
            }
            else if(sc[i] == '{'){
                dq.addFirst('}');
            }
            else if(sc[i] == '['){
                dq.addFirst(']');
            }
            else{
                if(dq.isEmpty() || dq.pollFirst()!=sc[i])
                    return false;
            }
            if(dq.size() > sc.length - i)
                return false;
        }
        return dq.isEmpty();
    }
}
    
