package Fila;

public class Main {
    public static void main(String[] args) {

        Queue<String> fila = new Queue<>();

   
        System.out.println("Fila vazia? " + fila.isEmpty());

       
        System.out.println("\n--- Adicionando Pessoas ---");
        fila.enqueue("João");
        fila.enqueue("Maria");
        fila.enqueue("José");

        System.out.println("Fila vazia? " + fila.isEmpty());
        System.out.println("Tamanho: " + fila.length);
        System.out.println("Primeiro da fila (Peek): " + fila.peek());

        
        System.out.println("\n--- Atendendo Pessoas ---");
        while (!fila.isEmpty()) {
            System.out.println("Atendendo: " + fila.dequeue());
        }

        System.out.println("\n--- Tentando remover de fila vazia ---");
        System.out.println("Atendendo: " + fila.dequeue()); 

    }
}
