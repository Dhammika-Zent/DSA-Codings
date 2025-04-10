

public class LinkedListStack implements StackADT{
    StackNode top;
    int size;

    LinkedListStack(){
        top = null;
        size = 0;
    }

    public void push (int data){
        StackNode newNode = new StackNode(data);
        newNode.prev = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if(isEmpty()){
            return  -1;
        }
        int poppedValue = top.data;
        top = top.prev;
        size--;
        return poppedValue;

    
    }
    
    public int peek() {
        if(isEmpty()){
           return  -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public int size() {
        return size;
    }

    public void display(){
        StackNode current = top;
        while(current!= null){
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    
}

}
