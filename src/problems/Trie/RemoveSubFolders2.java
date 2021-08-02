package problems.Trie;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RemoveSubFolders2 {
    public static void main(String[] args) {
      String[] input1 = new String[]{ "/a","/a/b","/c/d","/c/d/e","/c/f" };
      String[] input2 = new String[]{ "/a","/a/b/c","/a/b/d" };
      String[] input3 = new String[]{ "/a/b/c","/a/b/ca","/a/b/d" };
      removeSubFolders(input1);
      removeSubFolders(input2);
      removeSubFolders(input3);
    }

    private static void removeSubFolders(String[] folders) {
        LinkedList<String> list = new LinkedList<>();
        Arrays.sort(folders);
        for (String f : folders) {
            if (list.isEmpty() || !f.startsWith(list.peekLast() + "/")) {
                list.add(f);
            }
        }
        System.out.println(list);

        // O(M * nlogn)  M is the length of folders and nlogn for sorting
    }
}
