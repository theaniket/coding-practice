package dataStructures;

public class LinkedList {
    private LinkedListNode head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public void incrementSize() {
        this.size++;
    }

    public void decrementSize() {
        this.size--;
    }

    public boolean find(int data) {
        boolean present = false;
        if (head != null) {
            LinkedListNode nodes = head;
            while (nodes != null) {
                if (nodes.data == data) {
                    present = true;
                    break;
                }
                nodes = nodes.next;
            }
        } else {
            System.out.println("Empty Linked List");
        }
        return present;
    }

    public void push(int data) {
        LinkedListNode node = new LinkedListNode(data);
        node.next = head;
        head = node;
        incrementSize();
    }

    public int[] asArray() {
        int[] array = null;
        if (head != null) {
            array = new int[size()];
            LinkedListNode temp = head;
            int index = 0;
            while (temp != null) {
                array[index] = temp.data;
                temp = temp.next;
                index++;
            }
        } else {
            System.out.println("Empty Linked List");
        }
        return array;
    }

    public void insert(int position, int data) {
        if (this.head != null) {
            LinkedListNode nodes = this.head;
            for (int i = 0; i < position - 1; i++) {
                nodes = nodes.next;
            }
            LinkedListNode newNode = new LinkedListNode(data);
            newNode.next = nodes.next;
            nodes.next = newNode;
            incrementSize();
        } else {
            System.out.println("Empty Linked List");
        }
    }

    public void pop() {
        if (head != null) {
            LinkedListNode nodes = this.head;
            this.head = nodes.next;
            decrementSize();
        } else {
            System.out.println("Empty Linked List");
        }
    }

    public int peek() {
        return this.head.data;
    }

    public int poll() {
        int value = -1;
        if (this.head != null) {
            LinkedListNode nodes = this.head;
            value = nodes.data;
            this.head = nodes.next;
            decrementSize();
        } else {
            System.out.println("Empty Linked List");
        }
        return value;
    }
}
