public class LinkedListP {
    private Node head;


    public LinkedListP() {
        head = null;

    }

    // add in front
    // create new node, point new node to head, update head as new node.
    public void add(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;

    }

    // add tail
    // create new node, if list is empty make head as new node,
    // if the list is not empty, create node current as head, while the next node is not empty
    // traverse until the next node is empty and set the current node to point to new node at the
    // tail end of the list.
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }

    }

    @Override
    public String toString() {
        String out = "[";
        Node current = head;
        while (current != null) {
            out += current.toString() + " ";
            current = current.getNext();
        }
        out += "]";
        return out;

    }

    // boolean expression that returns in the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // create a variable to count size and variable Node to hold the place of the beginning of
    // the list
    // if the list is empty return 0;
    //else traverse the entire list updating size and return size
    public int size() {
        int size = 0;
        Node current = head;

        while (current != null) {
            size++;
            current = current.getNext();
        }

        return size;
    }

    //return the integer value give the index of the node
    //if the index is outside the value return 0
    // create node pointing to head, and variable i to track index
    // while i is less than the index being searched, increment i and traverse the list.
    // once i is not less than the index then return the data of that node.
    public int get(int index) {
        if (index < 0 || index >= size()) {
            return 0;
        }
        int i = 0;
        Node current = head;
        while (i < index) {
            i++;
            current = current.getNext();
        }
        return current.getData();

    }

    // check to see if the index is out of bounds
    // create a variable i to track index
    // traverse through the list until the index is found, then set that nodes data to desired data
    public void set(int index, int data) {
        if (index < 0 || index >= size()) {
            return;
        }
        int i = 0;
        Node current = head;
        while (i < index) {
            i++;
            current = current.getNext();
        }
        current.setData(data);
    }

    // if the index is out of bounds return
    // if the index is at 0 add the given data at index 0
    // else create a variable i to track the index, create a new node, and Node variable to track
    // list
    // traverse the list to find index, then set the new node to the current indexed node
    // then set the current index node to the new node
    void insert(int index, int data) {
        if (index < 0 || index >= size()) {
            return;
        }
        if (index == 0) {
            add(data);
        } else {
            int i = 0;
            Node newNode = new Node(data);
            Node current = head;
            while (i < index) {
                i++;
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }

    }

    // check to see if index is out of bounds
    // if the index to be removed is 0 then create a temp variable for head
    // update head to the next node, then delete the temp variable from original head.
    //else create variable i to track index and create variable for Node
    // traverse through the list until index is found
    // create temp Node variable to hold the current node to delete
    // set the variable node to point to the next node
    // then delete the temp node variable.
    void remove(int index) {
        if (index < 0 || index >= size()) {
            return;
        }
        if (index == 0) {
            Node temp = head;
            head = head.getNext();
            temp.setNext(null);
        } else {
            int i = 0;
            Node current = head;
            while (i < index) {
                i++;
                current = current.getNext();
            }
            Node temp = current.getNext();
            current.setNext(current.getNext().getNext());
            temp.setNext(null);
        }

    }

}
