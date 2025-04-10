public class ArrayQueue implements QueueADT {
    int queueArray [];
    int front;
    int rear;
    int capacity;

    ArrayQueue(int maxsize) {
        queueArray = new int[maxsize];
        front = 0;
        rear = -1;
        capacity = maxsize;
    }

    public void enqueue(int number) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full, cannot enqueue.");
            return;
        }
        rear = rear + 1;
        queueArray[rear] = number;
    }

    public int dequeue() {
        if (front == rear + 1) {
            System.out.println("Queue is empty, cannot dequeue.");
            return -1;  // Return a value indicating that the queue is empty
        }
        int removedItem = queueArray[front];  // Assigning the item to removedItem
        front = front + 1;  // Moving the front pointer
        return removedItem;  // Returning the removed item
    }

    public int peak() {
        return queueArray[front];
    }

    public int size() {
        return rear - front + 1;
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public void display() {
        if (front <= rear) {
            for (int i = front; i <= rear; i++) {
                System.out.print(queueArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.dequeue();
        queue.display();
        System.out.println("Size of the queue: " + queue.size());

}
}
