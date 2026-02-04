package Lists.DoubleLinkedList;

public class DoubleLinkedList<T> {

    Node<T> head;
    Node<T> tail;
    int lenght = 0;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        if (head == null) {
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
        head.prev = node;

        node.prev = null;
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

        node.prev = this.tail;
        tail.next = node;

        node.next = null;
        this.tail = node;
        lenght++;
        return;

    }

    public void insertAt(Node<T> node, int index) {

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

        if (index == lenght + 1) {
            append(node);
            return;
        }

        Node<T> curr;
        curr = this.head;
        int lenghtList = 1;

        while (curr.next != null) {
            if (index == lenghtList + 1) {
                curr.next.prev = node;
                node.prev = curr;
                node.next = curr.next;
                curr.next = node;
                lenght++;
                return;
            }
            curr = curr.next;
            lenghtList++;
        }
    }

    public void removeFirst() {

        if (isEmpty()) {
            throw new IllegalStateException("This list is empty");
        }

        if (lenght == 1) {
            this.head = null;
            this.tail = null;
            lenght--;
            return;
        }

        this.head = head.next;
        head.prev = null;
        lenght--;
        return;

    }

    public void removeLast() {

        if (isEmpty()) {
            throw new IllegalStateException("This list is empty");
        }

        if (lenght == 1) {
            this.head = null;
            this.tail = null;
            lenght--;
            return;
        }

        this.tail = tail.prev;
        tail.next = null;
        lenght--;
        return;
    }

    public void removeAt(int index) {

        if (isEmpty()) {
            throw new IllegalStateException("This list is empty");
        }
        if (index > lenght || index < 1) {
            throw new IndexOutOfBoundsException("This index is not valid");
        }

        if (index == 1) {
            removeFirst();
            return;
        }

        if (index == lenght) {
            removeLast();
            return;
        }

        Node<T> curr;
        curr = this.head;
        int lenghtList = 1;

        while (curr.next != null) {
            if (index == lenghtList + 1) {
                curr.next = curr.next.next;
                curr.next.prev = curr;
                lenght--;
                return;
            }
            curr = curr.next;
            lenghtList++;
        }
    }

    public void remove(Node<T> node) {

        if (isEmpty()) {
            throw new IllegalStateException("This list is empty");
        }

        if (node == this.head) {
            removeFirst();
            return;
        }

        if (node == this.tail) {
            removeLast();
            return;
        }

        node.prev.next = node.next;
        node.next.prev = node.prev;
        lenght--;
        return;

    }

    public void printList() {
        Node<T> curr;
        curr = this.head;

        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Going: ");
        while (curr != null) {
            System.err.print(curr.data);
            if (curr.next == null) {
                System.out.print(" <-> END");
            } else {
                System.out.print(" <-> ");
            }
            curr = curr.next;
        }

        System.out.println("");
        Node<T> last = this.tail;

        System.out.print("Returning: ");
        while (last != null) {
            System.err.print(last.data);
            if (last.prev == null) {
                System.out.print(" <-> END");
            } else {
                System.out.print(" <-> ");
            }
            last = last.prev;
        }
        System.out.println("");
        System.out.println("Tamanho : " + lenght);

    }

}
