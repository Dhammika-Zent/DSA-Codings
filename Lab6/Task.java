import java.util.PriorityQueue;

public class Task {
    public static void main(String[] args) {
        PriorityQueue <Integer> taskQueue = new PriorityQueue<>();
        taskQueue.offer (2);
        taskQueue.offer (6);
        taskQueue.offer (1);
        taskQueue.offer (5);
        taskQueue.offer (4);
        System.out.print (taskQueue);
    }

    
}
