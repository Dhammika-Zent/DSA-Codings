public class BinarySearchTree {
    BSTreeNode root;

    BinarySearchTree() {
        root = null;
    }

    // Insertion method
    public void insertNode(int key) {

        // Create new node
        BSTreeNode newNodeObj = new BSTreeNode(key);
        BSTreeNode current = root;
        BSTreeNode parent;

        if (root == null) {
            root = newNodeObj;
            return;
        }

        while (true) {
            parent = current;
            if (current.data > key) {
                current = current.leftChild;
                if (current == null) {
                    parent.leftChild = newNodeObj;
                    return;
                }
            } else {
                current = current.rightChild;
                if (current == null) {
                    parent.rightChild = newNodeObj;
                    return;
                }
            }
        }
    }

    // In-order traversal method (to print nodes in sorted order)
    public void inOrder() {
        inOrderTraversal(root);
    }

    // Helper method for in-order traversal
    public void inOrderTraversal(BSTreeNode node) {
        if (node == null) {
            return;
        }
        // Left child, root, right child
        inOrderTraversal(node.leftChild);
        System.out.print(node.data + " ");
        inOrderTraversal(node.rightChild);
    }

    // Method to find a node with a given key
    public BSTreeNode findNode(int key) {
        BSTreeNode current = root;

        while (current != null) {
            if (current.data == key) {
                return current;  // Node found
            }
            if (key < current.data) {
                current = current.leftChild;  // Move left
            } else {
                current = current.rightChild;  // Move right
            }
        }
        return null;  // Node not found
    }

    // Method to delete a node with a given key
    public BSTreeNode deleteNODE (BSTreeNode node, int key) {
        if (node == null) {
            return null;
        }
        if (key < node.data) {
            node.leftChild = deleteNODE(node.leftChild, key);
        } else if (key > node.data) {
            node.rightChild = deleteNODE(node.rightChild, key);
        } else {
            if ((node.leftChild == null) && (node.rightChild == null)) {
                return null;
            }
            if (node.leftChild == null) {
                return node.rightChild;
            } else if (node.rightChild == null) {
                return node.leftChild;
            } else {
                // Successor will be handled here
            }
        }
        return node;
    }

    // **Method to find the successor of a given node**
    public BSTreeNode findSuccessor(BSTreeNode node) {
        // If the node has a right child, find the minimum value in the right subtree
        if (node.rightChild != null) {
            return findMin(node.rightChild);
        }

        // If the node does not have a right child, find the first ancestor whose left child is an ancestor of the node
        BSTreeNode successor = null;
        BSTreeNode ancestor = root;
        
        while (ancestor != node) {
            if (node.data < ancestor.data) {
                successor = ancestor;  // Potential successor
                ancestor = ancestor.leftChild;
            } else {
                ancestor = ancestor.rightChild;
            }
        }
        
        return successor;
    }

    // **Helper method to find the minimum value node in a subtree**
    private BSTreeNode findMin(BSTreeNode node) {
        while (node.leftChild != null) {
            node = node.leftChild;
        }
        return node;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insertNode(50);
        tree.insertNode(30);
        tree.insertNode(20);
        tree.insertNode(40);
        tree.insertNode(70);
        tree.insertNode(60);
        tree.insertNode(80);

        // Print the tree in order
        System.out.println("In-order traversal of the tree:");
        tree.inOrder();  // It should print 20 30 40 50 60 70 80

        // Find a node with key 40
        int keyToFind = 40;
        BSTreeNode foundNode = tree.findNode(keyToFind);
        if (foundNode != null) {
            System.out.println("\nNode with key " + keyToFind + " found: " + foundNode.data);
        } else {
            System.out.println("\nNode with key " + keyToFind + " not found.");
        }

        // Find successor of node with key 30
        BSTreeNode successorNode = tree.findSuccessor(tree.findNode(30));
        if (successorNode != null) {
            System.out.println("\nSuccessor of 30 is: " + successorNode.data);
        } else {
            System.out.println("\nNode with key 30 has no successor.");
        }
    }
}

// BSTreeNode class definition
class BSTreeNode {
    int data;
    BSTreeNode leftChild, rightChild;

    // Constructor
    BSTreeNode(int key) {
        data = key;
        leftChild = rightChild = null;
    }
}
