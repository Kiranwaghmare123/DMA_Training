public class Linkedlist {

    Node head;// starting point of the list

    static class Node {
        int data;// data in node
        Node next;// address link of next node

        // CONSTRUCTOR TO SET DEFAULT VALUES
        Node(int d) {
            data = d;
            next = null;
        }

    }

    void display() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "--->");
            n = n.next;
        }
    }

    public void insert(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;

    }

    public void insertAfter(Node prev_node, int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    public void append(int new_data) {
        Node new_node = new Node(new_data);
        // Linked list is empty
        if (head == null) {
            head = new Node(new_data);
            return;
        }
        Node last = head;
        // Traversing to the last node of list
        while (last.next != null)
            last = last.next;
        last.next = new_node;
        return;

    }

    public static void main(String args[]) {
        Linkedlist l1 = new Linkedlist();// Object creation

        l1.head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);

        l1.head.next = first;
        first.next = second;

        l1.display();
        System.out.println("");
        l1.insert(5);
        l1.display();

        System.out.println("");
        l1.insert(4);
        l1.insert(2);
        l1.insert(1);
        l1.display();

        System.out.println("");
        l1.insertAfter(l1.head, 9);
        l1.display();

        System.out.println("");
        l1.insertAfter(l1.head.next.next, 9);
        l1.display();

        System.out.println("");
        l1.append(100);
        l1.display();

    }

}
