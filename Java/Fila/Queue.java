package Fila;

public class Queue<T> {

    Node<T> head;
    Node<T> tail;
    int length;

    public Queue() {
        this.head = null;
        this.tail = null;
        length = 0;
    }

    public boolean isEmpty() {
        if (length == 0) {
            return true;
        }

        return false;
    }

    public void enqueue(T value) {
        Node<T> node = new Node<T>(value);

        if (isEmpty()) {
            this.head = node;
            this.tail = node;
            length++;
            return;
        }

        this.tail.next = node;
        node.next = null;
        this.tail = node;
        length++;
    }

    public T dequeue() {

        if (isEmpty()) {
            return null;
        }

        T data;
        data = this.head.data;

        if (length == 1) {
            this.tail = null;
        }

        this.head = this.head.next;
        length--;
        return data;

    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }

        T data;
        data = this.head.data;
        return data;
    }

}