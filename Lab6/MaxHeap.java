import java.util.ArrayList;
import java.util.List;

public class MaxHeap {
    List <Integer> heap; //declare a list

    MaxHeap(){
        heap = new ArrayList<>();
    }

    public void insert (int value) {
        heap.add (value);
        heapifyUp(heap.size()-1);
    }

    public int delete(){
        int root = heap.get (0);
        heap.set (0, heap.get(heap.size()  -1)); // 
        heap.remove (heap.size() -1);
        heapifyDown(0);
        return root;
    }

    public void heapifyDown (int index) {
        int left_index = 2 *index + 1;
        int right_index = 2 *index +2;
        int largest_index = index;

        if ((left_index > 0 ) && (heap.get(left_index)> heap.get (largest_index))){
            largest_index =left_index;
        }

        if ((right_index >0) && (heap.get(right_index)> heap.get (largest_index))){
            largest_index =right_index;
        }

        if (index != largest_index) {
            swap (index, largest_index);
            heapifyDown(index);
        }
    }



    public void heapifyUp (int index) {
        int parent_index = (index - 1)/2;

        //if the index >0 means the current node not the root
        //if the parent's value < current node's value

        if ((index > 0 ) && (heap.get (parent_index) < heap.get (index))){
            swap (parent_index, index);
            heapifyUp(parent_index);
        }
    }

    public boolean isEmpty(){
        return heap.isEmpty();
    }

    public int peak(){
        return heap.get (0);
    }

    public void swap (int i, int j){
        int temp = heap.get (i);
        heap.set (i, heap.get (j));
        heap.set (j, temp);
    }

    public static void main (String [] args){
        MaxHeap maxheapObject = new MaxHeap();
        maxheapObject.insert (10);
        maxheapObject.insert (12);
        maxheapObject.insert (14);
        maxheapObject.insert (16);
        maxheapObject.insert (18);
        maxheapObject.insert (20);


        System.out.print(maxheapObject.heap);
        maxheapObject.delete();
        System.out.print(maxheapObject.heap);
    }

}