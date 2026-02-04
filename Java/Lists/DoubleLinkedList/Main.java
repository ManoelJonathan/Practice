package Lists.DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<String> list = new DoubleLinkedList<>();

        Node<String> node1 = new Node<>("A");
        Node<String> node2 = new Node<>("B");
        Node<String> node3 = new Node<>("C");
        Node<String> node4 = new Node<>("D");
        Node<String> node5 = new Node<>("E");
        Node<String> node6 = new Node<>("F");

        list.append(node1);
        list.append(node2);
        list.append(node3);
        list.append(node4);
        list.append(node5);
        list.append(node6);

        list.printList();

        list.remove(node5);
        System.out.println();
        list.printList();

        System.out.println();
        list.removeAt(4);
        list.printList();

        System.out.println();
        list.prepend(node5);
        list.printList();

        System.out.println();
        list.insertAt(node4, 4);
        list.printList();

    }
}
