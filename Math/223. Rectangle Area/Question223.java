public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int a1 = (C - A) * (D - B);
        int a2 = (G - E) * (H - F);
        if (A > G || C < E || B > H || D < F) {
            return a1 + a2;
        }
        int x1 = Math.max(A, E);
        int y1 = Math.max(B, F);
        int x2 = Math.min(C, G);
        int y2 = Math.min(D, H);
        return a1 + a2 - (x2 - x1) * (y2 - y1);
    }
}