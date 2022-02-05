// node
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    void printLevelOrder() {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printGivenLevel(root, i);
    }

    int height(Node root) {
        if (root == null)
            return 0;
        else {
            int lheight = height(root.left);
            int rheight = height(root.right);

            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }

    void printGivenLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(9);
        tree.root.right = new Node(7);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(8);

        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrder();
    }
}


//Node 1

class Node {
    int data;
    Node left = null, right = null;

    Node(int data) {
        this.data = data;
    }
}

class Main {
    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }

        return root;
    }

    public static boolean isBST(Node node, int minKey, int maxKey) {
        // base case
        if (node == null) {
            return true;
        }

        if (node.data < minKey || node.data > maxKey) {
            return false;
        }

        return isBST(node.left, minKey, node.data) &&
                isBST(node.right, node.data, maxKey);
    }

    public static void isBST(Node root) {
        if (isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            System.out.println("The tree is a BST.");
        } else {
            System.out.println("The tree is not a BST!");
        }
    }

    private static void swap(Node root) {
        Node left = root.left;
        root.left = root.right;
        root.right = left;
    }

    public static void main(String[] args) {
        int[] keys = { 6, 10, 23, 12, 32, 1, 25 };

        Node root = null;
        for (int key : keys) {
            root = insert(root, key);
        }

        swap(root);
        isBST(root);
    }
}


// QNode

class QNode {
    int key;
    QNode next;

    public QNode(int key) {
        this.key = key;
        this.next = null;
    }
}

class Queue {
    QNode front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    void enqueue(int key) {

        QNode temp = new QNode(key);

        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        this.rear.next = temp;
        this.rear = temp;
    }

    void dequeue() {
        if (this.front == null)
            return;

        QNode temp = this.front;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;
    }
}

public class Test {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println("Queue Front : " + q.front.key);
        System.out.println("Queue Rear : " + q.rear.key);
    }
}


// stack using linkedlist

import static java.lang.System.exit;

class StackUsingLinkedlist {

    private class Node {

        int data;
        Node link;
    }

    Node top;

    StackUsingLinkedlist() {
        this.top = null;
    }

    public void push(int x) {
        Node temp = new Node();

        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }

        temp.data = x;

        temp.link = top;

        top = temp;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {

        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void pop() {
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }

        top = (top).link;
    }

    public void display() {
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        } else {
            Node temp = top;
            while (temp != null) {

                System.out.printf("%d->", temp.data);

                temp = temp.link;
            }
        }
    }
}

public class GFG {
    public static void main(String[] args) {

        StackUsingLinkedlist obj = new StackUsingLinkedlist();

        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);

        obj.display();

        System.out.printf("\nTop element is %d\n", obj.peek());

        obj.pop();
        obj.pop();

        obj.display();

        System.out.printf("\nTop element is %d\n", obj.peek());
    }
}

// maximum level sum

import java.util.LinkedList;
import java.util.Queue;

class maximumlevelsum {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    };

    static int maxLevelSum(Node root) {

        if (root == null)
            return 0;

        int result = root.data;

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (!q.isEmpty()) {

            int count = q.size();

            int sum = 0;
            while (count-- > 0) {

                Node temp = q.poll();

                sum = sum + temp.data;

                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }

            result = Math.max(sum, result);
        }
        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(4);
        root.left.right = new Node(9);
        root.right.right = new Node(8);
        root.right.right.left = new Node(6);
        root.right.right.right = new Node(10);

       
        System.out.println("Maximum level sum is " +
                maxLevelSum(root));
    }
}

