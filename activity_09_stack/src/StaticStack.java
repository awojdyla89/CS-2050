public class StaticStack {

    private int capacity;
    private int size;
    private int data[];
    private static final int MIN_CAPACITY = 2;

    public StaticStack(int capacity) {
        if (capacity < MIN_CAPACITY)
            this.capacity = MIN_CAPACITY;
        else
            this.capacity = capacity;
        size = 0;
        data = new int[this.capacity];
    }

    public StaticStack() {
        this(MIN_CAPACITY);
    }

    public void push(int data) {
        if (!isFull()) {
            this.data[size] = data;
            size++;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int data = this.data[size - 1];
            size--;
            return data;
        }
        return 0;
    }

    public int peek() {
        if (!isEmpty()) {
            int data = this.data[size - 1];
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

    // top to bottom (left to right)
    @Override
    public String toString() {
        String out = "(top)";
        for (int i = size - 1; i >= 0; i--)
            out += " " + data[i];
        out += " (bottom)";
        return out;
    }
}
