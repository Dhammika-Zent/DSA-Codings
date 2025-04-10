public class ArrayStack implements StackADT {
    int stackArray[];
    int top;
    int capacity;

    // Constructor to initialize stack
    ArrayStack(int max_size) {
        stackArray = new int[max_size];
        top = -1;
        capacity = max_size;
    }

    // Push method
    public void push(int number) {
        if (top == capacity - 1) { // Stack overflow check
            System.out.println("Stack is full, cannot push.");
            return;
        }
        top = top + 1;
        stackArray[top] = number;
    }

    // Pop method
    public int pop() {
        int removedItem;
        if (top == -1) {
            return -1;  // Stack underflow, return -1
        }
        removedItem = stackArray[top];
        top = top - 1;
        return removedItem;
    }

    // Peak method (returns the top element without removing it)
    public int peak() {
        if (top == -1) {
            return -1;  // Return -1 if stack is empty
        }
        return stackArray[top];
    }

    // Size method (returns the number of elements in the stack)
    public int size() {
        return top + 1;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Display method (print elements from top to bottom)
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();  // Move to the next line after printing stack elements
    }

    // Main method to test the stack functionality
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5); // Create a stack with capacity 5

        // Push elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Display stack elements
        System.out.println("Stack elements:");
        stack.display();

        // Test peak
        System.out.println("Top element (peak): " + stack.peak());

        // Pop an element
        System.out.println("Popped element: " + stack.pop());

        // Display stack after pop
        System.out.println("Stack after popping an element:");
        stack.display();

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // Display stack size
        System.out.println("Stack size: " + stack.size());

        // Try pushing an element to a full stack
        stack.push(60);  // This will succeed since there is space in the stack

        // Display stack after pushing another element
        System.out.println("Stack after pushing an element:");
        stack.display();
    }
}
