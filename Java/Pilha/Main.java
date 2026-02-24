package Pilha;

public class Main {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        pilha.push("Manoel");
        pilha.push("Marcus");
        pilha.push("Lewis Hamilton");
        pilha.push("Yuri Alberto");
        pilha.push("Senna");

        System.out.println("Primeiro valor é: "+ pilha.peek());
        System.out.println();

        pilha.pop();

        System.out.println("O Segundo valor é: "+ pilha.peek());
        
    }
}
