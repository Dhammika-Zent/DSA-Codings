public class LinkedListQueue implements QueueADT {
    QueueNode front, rear;
    int size;

    LinkedListQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(int number) {
        QueueNode newNodeObject = new QueueNode(number);  // Creating new node
        if (front == null) {
            front = newNodeObject;  // If the queue is empty, new node is both front and rear
            rear = newNodeObject;
        } else {
            rear.next = newNodeObject;  // Link the current rear node to the new node
            rear = newNodeObject;       // Update rear to be the new node
        }
        size++;  // Increment the size of the queue
    }

    public int dequeue() {
        if (front == null) {  // If the queue is empty
            System.out.println("Queue is empty, cannot dequeue.");
            return -1;  // Indicating an empty queue
        }
        int removedItem = front.data;  // Save the front data to return
        front = front.next;  // Move front to the next node
        if (front == null) {  // If the queue is now empty, set rear to null
            rear = null;
        }
        size--;  // Decrease the size of the queue
        return removedItem;  // Return the removed item
    }

    public int peak() {
        if (front == null) {
            System.out.println("Queue is empty, cannot peak.");
            return -1;  // Return -1 if queue is empty
        }
        return front.data;  // Return the front item's data
    }

    public int size() {
        return size;  // Return the current size of the queue
    }

    public boolean isEmpty() {
        return front == null;  // If front is null, the queue is empty
    }

    // You can implement a display method if you like to visualize the queue
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        QueueNode current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
