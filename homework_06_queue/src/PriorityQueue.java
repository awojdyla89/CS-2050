/*
 * CS2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Homework 06 - PriorityQueue
 */

public class PriorityQueue {

    // priority queue does not benefit much by having a rear pointer, so let's not worried about it
    private Node front;

    public PriorityQueue() {
        front = null;
    }

    // TODO: finish the implementation of the method
    public void push(Customer customer) {

        // create a new node with customer

        // add the new node as the front node if queue is empty


        // if the queue is not empty


            // if customer has a higher priority than the front customer, add the new node as the front node


            // if that is not the case, use the previous/current strategy (see Polynomial's addTerm) to add the new node in the correct location of the queue


            // if you haven't returned at this point, add the new node at the rear of the queue

        }
    }

    public Customer pop() {
        if (isEmpty())
            return null;
        Customer customer = front.getCustomer();
        Node temp = front;
        front = front.getNext();
        temp.setNext(null);
        return customer;
    }

    public Customer peek() {
        if (isEmpty())
            return null;
        return front.getCustomer();
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