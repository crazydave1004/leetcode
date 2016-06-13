class WordNode {
    WordNode[] arr;
    boolean isEnd;
    public WordNode() {
        this.arr = new WordNode[26];
    }
}

public class WordDictionary {
    WordNode root;
    public WordDictionary() {
        root = new WordNode();
    }

    // Adds a word into the data structure.
    public void addWord(String word) {
        WordNode p = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (p.arr[index] == null) {
                WordNode tmp = new WordNode();
                p.arr[index] = tmp;
                p = tmp;
            } else {
                p = p.arr[index];
            }
        }
        p.isEnd = true;
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return searchHelper(word, 0, root);
    }
    
    private boolean searchHelper(String word, int index, WordNode p) {
        if (index == word.length() && p.isEnd) {
            return true;
        } else if (index >= word.length()) {
            return false;
        }
        char c = word.charAt(index);
        if (c != '.') {
            int i = c - 'a';
            if (p.arr[i] == null) {
                return false;
            } else {
                return searchHelper(word, index + 1, p.arr[i]);
            }
        } else {
            for (int j = 0; j < p.arr.length; j++) {
                if (p.arr[j] != null) {
                    if (searchHelper(word, index + 1, p.arr[j]) == true) return true;
                }
            }
            return false;
        }
    }
    
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");