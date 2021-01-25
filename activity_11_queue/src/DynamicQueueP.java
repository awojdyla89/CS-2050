public class DynamicQueueP {
    private Node front, rear;

    public DynamicQueueP() {
        front = rear = null;
    }

    public void push(int data) {
      Node newNode = new Node(data);
      if(front == null){
          front = rear = newNode;
      }else{
          rear.setNext(newNode);
          rear = newNode;
      }

    }

    public int pop() {
        if(isEmpty()){
            return 0;
        }
        int data = front.getData();
        Node temp = front;
        front = front.getNext();
        temp.setNext(null);
        if(front == null){
            rear = null;
        }

        return data;
    }

    public int peek() {
        if(isEmpty()){
            return 0;
        }
        return front.getData();

    }

    public int size() {
        int size = 0;
        Node current = front;
        while(current != null){
            size++;
            current = current.getNext();
        }
     return size;
    }

    public boolean isEmpty() {
        return front == null;
    }

    // top to bottom (left to right)
    @Override
    public String toString() {
        String out = "Left [";
        Node current = front;
        while(current != null){
            out += current.toString() + " ";
            current = current.getNext();
        }
        out += "] Right";
        return out;
    }
}
