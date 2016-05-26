public class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (n == 0) return res;
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        res.add(new ArrayList<Integer>(list));
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < res.get(i).size(); j++) {
                list.set(j, res.get(i).get(j - 1) + res.get(i).get(j));
            }
            list.add(1);
            res.add(new ArrayList<Integer>(list));
        }
        return res;
    }
}