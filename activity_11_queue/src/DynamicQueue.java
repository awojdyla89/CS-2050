public class DynamicQueue {

    private Node front, rear;

    public DynamicQueue() {
        front = rear = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = rear = newNode;
        }
        else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    public int pop() {
        if (isEmpty())
            return 0;
        int data = front.getData();
        Node temp = front;
        front = front.getNext();
        temp.setNext(null);
        if (front == null)
            rear = null;
        return data;
    }

    public int peek() {
        if (isEmpty())
            return 0;
        return front.getData();
    }

    public int size() {
        int count = 0;
        Node current = front;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    public boolean isEmpty() {
        return front == null;
    }

    // top to bottom (left to right)
    @Override
    public String toString() {
        String out = "(front)";
        Node current = front;
        while (current != null) {
            out += " " + current.toString();
            current = current.getNext();
        }
        out += " (rear)";
        return out;
    }
}