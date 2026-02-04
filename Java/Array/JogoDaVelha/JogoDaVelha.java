package Array.JogoDaVelha;

import javax.swing.JOptionPane;

public class JogoDaVelha {

    protected static final int X = 1, O = -1;
    protected static final int vazio = 0;
    int[][] tabuleiro = new int[3][3];
    protected int jogador;

    public JogoDaVelha() {
        jogador = X;
    }

    public void clear() {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                tabuleiro[i][j] = vazio;
            }
        }
    }

    public void play() {
        if (peekVazio()) {
            String fileira = JOptionPane.showInputDialog(toString(), "Qual a fileira você vai jogar");
            int numeroF = Integer.parseInt(fileira);
            String coluna = JOptionPane.showInputDialog(toString(), "Qual coluna você vai jogar");
            int numeroC = Integer.parseInt(coluna);

            if (numeroF < 0 || numeroC < 0 || numeroF >= 3 || numeroC >= 3) {
                throw new IllegalArgumentException("Posição Inválida");
            }

            if (tabuleiro[numeroF][numeroC] != vazio) {
                throw new IllegalArgumentException("Posição Ocupada");
            }

            tabuleiro[numeroF][numeroC] = jogador;
            jogador = -jogador;
        }
        return;
    }

    public boolean peekVazio() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == vazio) {
                    return true;
                }
            }
        }
        return false;
    }

    public int eWinner() {

        for (int i = 0; i < 3; i++) {
            int somaL = 0;
            int somaC = 0;
            for (int j = 0; j < 3; j++) {
                somaL += tabuleiro[i][j];
                somaC += tabuleiro[j][i];
            }
            if (somaL == 3 || somaC == 3) {
                return X;
            }
            if (somaL == -3 || somaC == -3) {
                return O;
            }
        }

        int somaD = 0;
        for (int i = 0; i < 3; i++) {
            somaD += tabuleiro[i][i];
        }
        if (somaD == 3) {
            return X;
        }
        if (somaD == -3) {
            return O;
        }

        somaD = 0;
        somaD = tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0];
        if (somaD == 3) {
            return X;
        }
        if (somaD == -3) {
            return O;
        }

        return 0;
    }

    public void winner() {
        if (eWinner() == X) {
            JOptionPane.showMessageDialog(null, "O vencedor é o jogador X");
        } else if (eWinner() == O) {
            JOptionPane.showMessageDialog(null, "O vencedor é O");
        } else {
            boolean temEspaco = false;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tabuleiro[i][j] == vazio) {
                        temEspaco = true;
                        break;
                    }
                }
            }

            if (temEspaco == false) {
                JOptionPane.showMessageDialog(null, "O jogo deu Empate (Velha!)");
            }
        }
    }

    public String toString() {
        String jogo = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == 1) {
                    jogo += " X ";
                } else if (tabuleiro[i][j] == -1) {
                    jogo += " O ";
                } else {
                    jogo += "   ";
                }
                if (j < 2) {
                    jogo += "|";
                }
            }
            if (i < 2) {
                jogo += "\n-----------\n";
            }

        }
        return jogo;
    }
}