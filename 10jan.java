// Delete Linkedlist

package DSA_10_Jan_22;

public class DeleteLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void deleteNode(int position) {
        if (head == null)
            return;
        Node temp = head;
        if (position == 0) {
            head = temp.next;
            return;
        }
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;
        if (temp == null || temp.next == null)
            return;
        Node next = temp.next.next;

        temp.next = next;
    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        DeleteLinkedList llist = new DeleteLinkedList();

        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
        llist.push(8);

        System.out.println("\nCreated Linked list is: ");
        llist.printList();

        llist.deleteNode(4);

        System.out.println("\nLinked List after Deletion at position 4: ");
        llist.printList();
    }
}

// print linked list
package DSA_10_Jan_22;

public class InsertAtGivenIndex {
    static class Node {
        public int data;
        public Node nextNode;

        public Node(int data) {
            this.data = data;
        }
    }

    static Node GetNode(int data) {
        return new Node(data);
    }

    static Node InsertPos(Node headNode, int position, int data) {
        Node head = headNode;
        if (position < 1)
            System.out.print("Invalid position");
        if (position == 1) {
            Node newNode = new Node(data);
            newNode.nextNode = headNode;
            head = newNode;
        } else {
            while (position-- != 0) {
                if (position == 1) {
                    Node newNode = GetNode(data);
                    newNode.nextNode = headNode.nextNode;
                    headNode.nextNode = newNode;
                    break;
                }
                headNode = headNode.nextNode;
            }
            if (position != 1)
                System.out.print("Position out of range");
        }
        return head;
    }

    static void PrintList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.nextNode;
            if (node != null)
                System.out.print(",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = GetNode(3);
        head.nextNode = GetNode(5);
        head.nextNode.nextNode = GetNode(8);
        head.nextNode.nextNode.nextNode = GetNode(10);

        System.out.print("Linked list before insertion: ");
        PrintList(head);

        int data = 12, pos = 3;
        head = InsertPos(head, pos, data);
        System.out.print("Linked list after" + " insertion of 12 at position 3: ");
        PrintList(head);
        data = 1;
        pos = 1;
        head = InsertPos(head, pos, data);
        System.out.print("Linked list after" + "insertion of 1 at position 1: ");
        PrintList(head);
        data = 15;
        pos = 7;
        head = InsertPos(head, pos, data);
        System.out.print("Linked list after" + " insertion of 15 at position 7: ");
        PrintList(head);
    }
}
