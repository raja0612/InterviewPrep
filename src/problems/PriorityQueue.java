package problems;

import java.util.*;

class PriorityQueueDemo {

    // Main Method
    public static void main(String args[])
    {
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());

        // Adding items to the pQueue using add()
        int[] nums = {3,2,1,5,6,4};
       for(int i : nums){
           pQueue.add(i);
       }

        // Printing the top element of PriorityQueue

        for(int i =0; i< pQueue.size(); i++) {
            System.out.println(pQueue.poll());
        }


    }
}