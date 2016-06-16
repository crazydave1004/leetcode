public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];
        List<List> adjacency = new ArrayList<List>();
        for (int i = 0; i < numCourses; i++) adjacency.add(new ArrayList<Integer>());
        for (int i = 0; i < prerequisites.length; i++) adjacency.get(prerequisites[i][1]).add(prerequisites[i][0]);
        int[] pres = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) pres[prerequisites[i][0]]++;
        for (int i = 0; i < numCourses; i++) {
            int j = 0;
            for (; j < numCourses; j++) {
                if (pres[j] == 0) {
                    res[i] = j;
                    break;
                }
            }
            if (j == numCourses) return new int[0];
            pres[j] = -1;
            List<Integer> list = adjacency.get(j);
            for (int course : list) pres[course]--;
        }
        return res;
    }
}