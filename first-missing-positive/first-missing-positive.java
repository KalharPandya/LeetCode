class Solution {
    
    public HashMap<Integer, Integer> map = new HashMap<>();
    public int firstMissingPositive(int[] nums) {
        for (int i:
             nums) {
            map.put(i,1);
        }
        int minInt = 1;
        while (true){
            if(!map.containsKey(minInt))
                return minInt;
            minInt++;
        }

    }
    
}