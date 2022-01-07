class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ans.add(new ArrayList<>());
            for (int j = 0; j < i+1; j++) {
                ans.get(i).add(0);
            }
        }
        ans.get(0).set(0,1);
        for (int i = 1; i < numRows; i++) {
            ans.get(i).set(0,1);
            ans.get(i).set(i,1);
            for (int j = 1; j < i; j++) {
                ans.get(i).set(j,(ans.get(i-1).get(j-1)+ans.get(i-1).get(j)));
            }

        }
        return ans;
    }
}