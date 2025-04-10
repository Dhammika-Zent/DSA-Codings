public class LinkListADT {
    Node head;

    LinkListADT() {
        head = null;
    }

    // Method to insert a node at the beginning of the linked list
    public void addToBegin(int number) {
        Node newNodeObject = new Node(number);
        newNodeObject.next = head;
        head = newNodeObject;
    }

    // Display 
    public void travelsal() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
    }

    // Method to insert a node at the end of the linked list
    public void addToEnd(int number) {
        Node newNodeObject = new Node(number);
        if (head == null) {
            head = newNodeObject;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNodeObject;
        }
    }

    // Method to delete a node from the beginning of the linked list
    public void deleteFromBegin() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }

    // Method to delete a node from the end of the linked list
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.next != null) {
            current = current.next;
        }

        // Remove the last node
        current.next = null;
    }

    //size of the list
    public int size() {
        int count = 0;
        Node current = head;
        while (current!= null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean find (int key){
        Node current = head;
        while (current!= null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public static void main(String[] args) {
        LinkListADT list = new LinkListADT();

        // Corrected method calls
        list.addToBegin(1);  // Add number 1 to the beginning
        list.addToEnd(2);
        list.addToEnd(3);
        list.addToEnd(4);

        // Delete the first element
        list.deleteFromBegin();

        // Delete the last element
        list.deleteFromEnd();

        // Display the list
        list.travelsal();  

        // Print the size of the list
        System.out.println("Size of the list: " + list.size());  // Output: 3  (1, 2, 3) are remaining in the list after deletion.
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
