package problems.Trie;

import java.util.*;

class Trie1 {
    HashMap<String, Trie1> map = new HashMap<>();
    boolean endOfTrie;
}

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Trie1 root = new Trie1();
        for(String f : folder)
            insert(root, f.split("/"));

        Set<String> result = new HashSet<>();
        for(String f : folder)
            result.add(search(root, f.split("/")));

        return new ArrayList(result);
    }

    public void insert(Trie1 root, String[] folders){
        Trie1 temp = root;
        for(String folder: folders){
            temp.map.putIfAbsent(folder, new Trie1());
            if(temp.map.containsKey(folder)){
                temp = temp.map.get(folder);
            }
        }
        temp.endOfTrie = true;
    }

    public String search(Trie1 root, String[] folders){
        StringBuffer sb = new StringBuffer();
        Trie1 temp = root;
        for(String folder: folders){
            System.out.println(folder);
            if(temp.endOfTrie){
                System.out.println(folder+ "if");
                return sb.toString().substring(1);
            }

            temp = temp.map.get(folder);
            sb.append("/"+folder);
        }
        return sb.toString().substring(1);
    }
}

public class RemoveSubFolders {

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.removeSubfolders(new String[]{"/a","/a/b"}));



    }
}
