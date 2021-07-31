package problems.Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}

class Tree {
    Node root;
    public Tree(){
        this.root = null;
    }

    public List<Integer> bfs(Node node) {

        List<Integer> result = new ArrayList<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(node);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            result.add(temp.data);
            if(temp.left != null) queue.offer(temp.left);
            if(temp.right != null) queue.offer(temp.right);
        }
        return result;
    }

    public List<List<Integer>> bfsByLevel(Node node) {

        List<List<Integer>> result = new ArrayList<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(node);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> tempList = new ArrayList<>();
            for(int i=0;i<size;i++){
                Node temp = queue.poll();
                tempList.add(temp.data);
                if(temp.left != null) queue.offer(temp.left);
                if(temp.right != null) queue.offer(temp.right);
            }
            result.add(tempList);
        }
        findRightView(result);
        System.out.println("");
        findLeftView(result);

        findZigZagView(result);
        return result;
    }

    private void findZigZagView(List<List<Integer>> result) {
        System.out.println("ZIG ZAG  VIEW");
        boolean leftToRight = true;
        for(List<Integer> each : result) {
            if(leftToRight){
                System.out.print(each.get(0));
            } else {
                System.out.print(each.get(each.size()-1) + " ");
            }
            leftToRight= !leftToRight;
        }
    }

    private void findRightView(List<List<Integer>> result) {
        System.out.println("LEFT SIDE VIEW");
        for(List<Integer> each : result) {
            System.out.print(each.get(each.size()-1) + " ");
        }
    }
    private void findLeftView(List<List<Integer>> result) {
        System.out.println("RIGHT SIDE VIEW");
        for(List<Integer> each : result) {
            System.out.print(each.get(0));
        }
    }
}


public class BFS {

    public  static void  main(String args[]) {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("BFS"+tree.bfs(tree.root));

        System.out.println("BFS by level"+tree.bfsByLevel(tree.root));
        /*
        [1]
        [2,3]
        [4,5]
         */

    }
}
