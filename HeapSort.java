import java.util.*;


public class HeapSort {
    
    public static int[] heapSort(int[] arr){

        // Implementing Heap Sort using a Priority Queue:

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int num : arr){ // O(n log n)

            queue.add(num);

        }

        int[] output = new int[arr.length];

        int i = 0;

        while(!queue.isEmpty()){ // O(n log n)

            output[i] = queue.poll();
            i++;

        }

        return output;

    }
 
    // Main class for testing.
    public static void main(String args[])
    {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        
        int[] sorted = heapSort(arr);

        System.out.println(Arrays.toString(sorted));

    }
}