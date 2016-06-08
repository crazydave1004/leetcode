public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode header = new TreeLinkNode(0);
        header.next = root;
        TreeLinkNode cur, prev;
        while (header.next != null) {
            cur = header.next;
            prev = header;
            header.next = null;
            while (cur != null) {
                if (cur.left != null) {
                    prev.next = cur.left;
                    prev = prev.next;
                }
                if (cur.right != null) {
                    prev.next = cur.right;
                    prev = prev.next;
                }
                cur = cur.next;
            }
        }
    }
}