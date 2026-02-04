package Lists.SimpleList;

public class LinkedList<T> {

    Node<T> head;
    Node<T> tail;
    int lenght = 0;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

    public void prepend(Node<T> node) {

        if (isEmpty()) {
            this.head = node;
            this.tail = node;
            lenght++;
            return;
        }

        node.next = this.head;
        this.head = node;
        lenght++;
        return;
    }

    public void append(Node<T> node) {
        if (isEmpty()) {
            this.head = node;
            this.tail = node;
            lenght++;
            return;
        }

        this.tail.next = node;
        node.next = null;
        this.tail = node;
        lenght++;
        return;
    }

    public void insert(Node<T> node, int index) {

        if (index < 1 || index > lenght + 1 || node == null) {
            if (node == null) {
                throw new IllegalArgumentException("Node cannot be null");
            } else {
                throw new IndexOutOfBoundsException("This index is not valid");
            }
        }

        if (index == 1) {
            prepend(node);
            return;
        }

        Node<T> curr;
        curr = this.head;
        int lenghtList = 1;

        while (curr != null) {
            if (index == lenghtList + 1) {
                if (curr.next == null) {
                    append(node);
                    return;
                } else {
                    node.next = curr.next;
                    curr.next = node;
                    lenght++;
                    return;
                }
            } else {
                curr = curr.next;
                lenghtList++;
            }
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }

        if (lenght == 1) {

            this.head = null;
            this.tail = null;
            lenght--;
            return;
        }
        this.head = this.head.next;
        lenght--;
        return;

    }

    public void removeLast() {

        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }

        if (lenght == 1) {
            removeFirst();
            return;
        }
        Node<T> curr;
        curr = this.head;

        while (curr.next != null) {
            if (curr.next.next == null) {
                curr.next = null;
                tail = curr;
                lenght--;
                return;
            }
            curr = curr.next;
        }

    }

    public void removeAt(int index) {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        if (index < 1 || index > lenght) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
        }

        if (index == 1) {
            removeFirst();
            return;
        }

        Node<T> curr;
        curr = this.head;
        int lenghtList = 1;
        while (curr.next != null) {
            if (index == lenghtList + 1) {
                if (curr.next.next == null) {
                    removeLast();
                    return;
                } else {
                    curr.next = curr.next.next;
                    lenght--;
                    return;
                }
            } else {
                lenghtList++;
                curr = curr.next;
            }

        }
    }

    public void remove(Node<T> node) {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }

        if (head.data.equals(node.data)) {
            removeFirst();
            return;
        }
        if (tail.data.equals(node.data)) {
            removeLast();
            return;
        }

        Node<T> curr;
        curr = this.head;

        while (curr.next != null) {
            if (curr.next.data.equals(node.data)) {
                curr.next = curr.next.next;
                lenght--;
                return;
            }
            curr = curr.next;

        }
    }

    public void printList() {
        Node<T> curr;
        curr = this.head;

        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        while (curr != null) {
            System.out.print(curr.data);

            if (curr.next == null) {
                System.out.print("-> END");
            } else {
                System.out.print("->");
            }

            curr = curr.next;
        }

    }
}
