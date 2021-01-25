public class StaticQueue {

    private int capacity;
    private int size;
    private int data[];
    private int front;
    private static final int MIN_CAPACITY = 2;

    public StaticQueue(int capacity) {
        if (capacity < MIN_CAPACITY)
            this.capacity = MIN_CAPACITY;
        else
            this.capacity = capacity;
        size = 0;
        data = new int[this.capacity];
        front = 0;
    }

    public StaticQueue() {
        this(MIN_CAPACITY);
    }

    public void push(int data) {
        if (!isFull()) {
            int rear = (front + size) % capacity;
            this.data[rear] = data;
            size++;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int data = this.data[front];
            front = (front + 1) % capacity;
            size--;
            return data;
        }
        return 0;
    }

    public int peek() {
        if (!isEmpty()) {
            int data = this.data[front];
            return data;
        }
        return 0;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    // front to rear (left to right)
    @Override
    public String toString() {
        String out = "(front)";
        int current = front;
        for (int i = 0; i < size; i++) {
            out += " " + data[current];
            current = (current + 1) % capacity;
        }
        out += " (Rear)";
        return out;
    }
}
