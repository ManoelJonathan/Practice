package Recursao.DesafioPintarParede;

public class BaldeDeTinta {

    public static void main(String[] args) {

        int[][] tela = {
                { 1, 1, 1, 1, 1, 1 },
                { 1, 0, 0, 0, 1, 1 },
                { 1, 0, 1, 0, 0, 1 },
                { 1, 0, 0, 0, 0, 1 },
                { 1, 1, 1, 1, 1, 1 }
        };

        System.out.println("--- ANTES DA PINTURA ---");
        imprimirTela(tela);

        preencherTinta(tela, 1, 1, 0, 8);

        System.out.println("\n--- DEPOIS DA PINTURA ---");
        imprimirTela(tela);
    }

    public static void preencherTinta(int[][] tela, int linha, int coluna, int corOriginal, int novaCor) {

        if (linha < 0 || linha >= tela.length || coluna < 0 || coluna >= tela[0].length
                || tela[linha][coluna] != corOriginal) {
            return;
        }

        tela[linha][coluna] = novaCor;

        preencherTinta(tela, linha - 1, coluna, corOriginal, novaCor);
        preencherTinta(tela, linha + 1, coluna, corOriginal, novaCor);
        preencherTinta(tela, linha, coluna + 1, corOriginal, novaCor);
        preencherTinta(tela, linha, coluna - 1, corOriginal, novaCor);

    }

    public static void imprimirTela(int[][] tela) {
        for (int i = 0; i < tela.length; i++) {
            for (int j = 0; j < tela[i].length; j++) {
                System.out.print(tela[i][j] + "  ");
            }
            System.out.println();
        }
    }
}