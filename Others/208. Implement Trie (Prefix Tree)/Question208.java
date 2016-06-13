class TrieNode {
    TrieNode[] arr;
    boolean isEnd;
    // Initialize your data structure here.
    public TrieNode() {
        this.arr = new TrieNode[26];
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode p = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (p.arr[index] == null) p.arr[index] = new TrieNode();
            p = p.arr[index];
        }
        p.isEnd = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode p = searchHelper(word);
        if (p == null) {
            return false;
        } else if (p.isEnd) {
            return true;
        } else return false;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode p = searchHelper(prefix);
        if (p == null) {
            return false;
        } else return true;
    }
    
    private TrieNode searchHelper(String str) {
        TrieNode p = root;
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            if (p.arr[index] == null) return null;
            p = p.arr[index];
        }
        if (p == root) return null;
        return p;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");