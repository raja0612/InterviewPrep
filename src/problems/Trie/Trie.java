package problems.Trie;

import java.util.Arrays;
import java.util.TreeMap;

class TrieNode {
    boolean endOfWord;
    // 26 represents if we construct trie for english alphabets
    TrieNode children[] = new TrieNode[26];
    public TrieNode() {
        // initialize TrieNode endOfWord with false and all 26 children = null
        endOfWord = false;
        for(int i =0; i < 26; i++) {
            children[i] = null;
        }
    }
    @Override
    public String toString() {
        return "TrieNode{" +
                "endOfWord=" + endOfWord +
                ", children=" + Arrays.toString(children) +
                '}';
    }
}

public class Trie {
    // define root;
    TrieNode root;
    public Trie() {
        // point root to start of the tree.
        root = new TrieNode(); // initially root node children is null and endOfWord = false
    }

    public void addWord(String word) {
        //start from root;
        TrieNode temp = root;
        for(char ch : word.toCharArray()) {
            System.out.println("insert ch..."+ch);
            // first find index of ch where to insert in children array
            int index = ch - 'a' ; // ex: 'b' - 'a' 98 - 97 = 1
            // create new TrieNode if the character is not in children
            if(temp.children[index] == null) {
                // for ex: char 'a'  children[0] = TrieNode object and endOfWord = false by default
                temp.children[index] = new TrieNode();
            }
            //point temp node to above created children[0] = TrieNode
            temp = temp.children[index];
        }
        // after end of each word  and mark endOfWord  = true
        temp.endOfWord = true;
        System.out.println("temp..."+temp);
    }

    public boolean search(String word) {

        // start from root;
        TrieNode temp = root;

        for(char ch : word.toCharArray()) {
            int index = ch - 'a';

            // check if temp children index is null or not
            if(temp.children[index] == null){
                return  false;
            }
            // update temp children index
            temp = temp.children[index];
        }
        return temp.endOfWord;
    }
    public static void main(String[] args) {
        String str[] = {"apple", "app", "ape"};
        Trie tree = new Trie();
        for(String s: str) {
            tree.addWord(s);
        }
        System.out.println(tree.search("apple"));
        System.out.println(tree.search("app"));
        System.out.println(tree.search("ape"));
        System.out.println(tree.search("apex"));
    }

}
