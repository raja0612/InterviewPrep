import java.util.HashSet;

public class HashSetDemo {

    public static void addFolders(String[] folders) {
        HashSet<String> hs = new HashSet<>();

        for(String folder : folders) {
            hs.add(folder);
        }
        System.out.println(hs);
    }

    public static void main(String[] args) {
        String[] folders = {"/a","/a/b","/c/d","/c/d/e","/c/f"};
        addFolders(folders);
    }
}
