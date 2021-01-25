public class DynamicStackP {
    private Node top;

    public DynamicStackP() {
        top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.setNext(top);
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            return 0;
        }
        int data = top.getData();
        Node temp = top;
        top = top.getNext();
        temp.setNext(null);

        return data;
    }

    public int peek() {
        if (isEmpty()) {
            return 0;
        }
        return top.getData();

    }

    public int size() {
        int size = 0;
        Node current = top;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    public boolean isEmpty() {
        return top == null;
    }

    // top to bottom (left to right)
    @Override
    public String toString() {
        String out = "Top [";
        Node current = top;
        while (current != null) {
            out += current.toString() + " ";
            current = current.getNext();
        }
        out += "] Bottom";
        return out;
    }
}
