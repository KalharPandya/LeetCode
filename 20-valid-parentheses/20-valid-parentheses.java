class Solution {
    public boolean isValid(String s) {
        char[] sc = s.toCharArray();
        Deque<Character> dq = new ArrayDeque<Character>();
        for(char c: sc){
            if(c == '('){
                dq.addFirst(')');
            }
            else if(c == '{'){
                dq.addFirst('}');
            }
            else if(c == '['){
                dq.addFirst(']');
            }
            else{
                if(dq.isEmpty() || dq.pollFirst()!=c)
                    return false;
            }
        }
        return dq.isEmpty();
    }
}
    
