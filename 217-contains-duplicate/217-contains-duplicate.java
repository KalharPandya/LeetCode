class Solution { 
    
        public HashMap<Integer, Boolean> map = new HashMap<>();
        public boolean containsDuplicate(int[] nums) {
        for (int i:
             nums) {
            if(map.containsKey(i))
                return true;
            map.put(i,true);
        }
        return false;
    }
    
}