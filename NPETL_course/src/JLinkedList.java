public class JLinkedList<T> {
    Node head;
    class Node {
        T data;
        Node next;
        Node() {
            data = null;
            next = null;
        }
        Node(T d) {
            data = d;
            next = null;
        }
    }
    JLinkedList() {
        head = new Node(); // dummy head node
    }

    public void insertFront(T data) {
        Node newnode = new Node(data);
        newnode.next = head.next;
        head.next = newnode;
    }

    public void insertEnd(T data) {
        Node newnode = new Node(data);
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newnode;
    }

    public void insertAt(T data, T key) {
        Node newnode = new Node(data);
        Node temp = head.next;

        while (temp != null) {
            if (temp.data.equals(key)) {
                newnode.next = temp.next;
                temp.next = newnode;
                return;
            }

            temp = temp.next;
        }
    }

    public void deleteFront() throws NullPointerException{
        Node ptr = this.head.next;
        this.head = head.next;
        System.out.println(ptr.data+" deleted");
        ptr = null;
    }

    public void printlist() {
        Node currNode = head.next;

        System.out.println("Linked List:");

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }

        System.out.println();
    }

    public void merge(JLinkedList<T> l2) {
        Node l1Node = head;

        while (l1Node.next != null) {
            l1Node = l1Node.next;
        }

        // Connect the last node of this list
        // to the first actual node of l2
        l1Node.next = l2.head.next;
    }


}


class menu {
    public static void main(String[] args) {

        JLinkedList<Integer> jlist = new JLinkedList<>();

        jlist.insertFront(12);
        jlist.insertFront(32);
        jlist.insertEnd(56);
        jlist.insertEnd(76);

        jlist.printlist();

        jlist.insertAt(157, 12);
        jlist.insertAt(345, 56);

        jlist.printlist();
    }
}