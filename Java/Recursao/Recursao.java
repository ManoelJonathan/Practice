package Recursao;

public class Recursao {

    public int fatorial(int numero) {
        if (numero == 0)
            return 1;
        return numero * fatorial(numero - 1);
    }

    public void countLess(int numero) {
        if (numero < 0) {
            return;
        }

        System.out.println(numero);
        countLess(numero - 1);
    }

    public int somaArrayComIndice(int[] array, int index) {
        if (index == array.length) {
            return 0;
        }
        return array[index] + somaArrayComIndice(array, index + 1);
    }

    public int somaArray(int[] array) {
        return somaArrayComIndice(array, 0);
    }

}
