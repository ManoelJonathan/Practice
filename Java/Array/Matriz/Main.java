package Array.Matriz;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        int contador = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = contador;
                contador++;
            }
        }

        System.out.println("--MATRIZ--");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        int soma = 0;
        for (int i = 0; i < 3; i++) { 
                soma += matriz[i][i];
        }

        System.out.println("a soma das diagonais é:" + soma);

    }

}
