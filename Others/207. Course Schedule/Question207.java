public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < numCourses; i++) list.add(new ArrayList<Integer>());
        for (int i = 0; i < prerequisites.length; i++) list.get(prerequisites[i][1]).add(prerequisites[i][0]);
        int[] pre = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) pre[prerequisites[i][0]]++;
        for (int i = 0; i < numCourses; i++) {
            int j = 0;
            for (; j < numCourses; j++) if (pre[j] == 0) break;
            if (j == numCourses) return false;
            pre[j]--;
            List<Integer> tmp = list.get(j);
            for (int course : tmp) pre[course]--;
        }
        return true;
    }
}