package Lists.SimpleList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        Node<Integer> node = new Node<>(10);
        Node<Integer> node1 = new Node<>(9);
        Node<Integer> node2 = new Node<>(1);
        Node<Integer> node3 = new Node<>(8);
        Node<Integer> node4 = new Node<>(20);
        Node<Integer> node5 = new Node<>(93);

        list.prepend(node);
        list.prepend(node1);
        list.prepend(node2);
        list.prepend(node3);
        list.prepend(node4);

        list.printList();

        list.remove(node1);
        System.out.println("");
        list.printList();
        System.out.println("");
        list.append(node5);
        list.printList();

        System.out.println("");
        list.removeAt(3);
        list.printList();

    }
}
