package Recursao;
import java.util.Arrays; 
public class Main {
    public static void main(String[] args) {
        Recursao recursao = new Recursao();

        int resultado = recursao.fatorial(5);
        System.out.println("Fatorial de 5 é: " + resultado);

        System.out.println();
        System.out.println("Contagem regressiva");
        recursao.countLess(5);

        System.out.println();
        int[] array = { 4, 2, 4 };
        System.out.println("A soma do array " + Arrays.toString(array) + " é " + recursao.somaArray(array));

    }
}
