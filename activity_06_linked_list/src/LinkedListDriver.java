

public class LinkedListDriver {
    private Node head;

    public static void main(String[] args) {
        LinkedListP ll = new LinkedListP();

        ll.append(3);
        ll.append(5);
        ll.append(8);
        ll.append(2);
        System.out.println(ll);
        ll.remove(0);
        ll.remove(0);
        ll.remove(0);
        ll.remove(0);
        System.out.println(ll);

        System.out.println("Is the list empty? " + ll.isEmpty());

        ll.add(3);
        ll.add(5);
        ll.add(8);
        ll.add(2);
        System.out.println(ll);

        System.out.println(ll.get(0));

    }


}
