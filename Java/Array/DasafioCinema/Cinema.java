package Array.DasafioCinema;

import javax.swing.JOptionPane;

public class Cinema {

    int[][] sala = new int[5][5];
    int vip = 20;
    int normal = 10;

    public void clear() {
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala.length; j++) {
                sala[i][j] = 0;
            }
        }
    }

    public void buy() {
        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {
            String fileira = JOptionPane.showInputDialog(toString() + "\nDigite a fileira que deseja sentar");
            int numeroF = Integer.parseInt(fileira);
            String coluna = JOptionPane.showInputDialog(toString() + "\nQual acento da fileira você deseja");
            int numeroC = Integer.parseInt(coluna);

            if (numeroF >= 5 || numeroC >= 5 || numeroF < 0 || numeroC < 0) {
                JOptionPane.showMessageDialog(null, "O ascento informado não existe");
                continue;
            }

            if (sala[numeroF][numeroC] == 1) {
                JOptionPane.showMessageDialog(null, "A fileira informada já contem uma compra");
                continue;
            }

            sala[numeroF][numeroC] = 1;
            if (numeroF == 0) {
                JOptionPane.showMessageDialog(null, "O valor do acento a pagar é: " + vip);
            } else {
                JOptionPane.showMessageDialog(null, "O valor do acento a pagar é: " + normal);
            }

            continuar = JOptionPane.showInputDialog("Deseja continuar comprando digite S senão N");

        }

    }

    public String toString() {
        String mapa = "";
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala.length; j++) {
                if (sala[i][j] == 1) {
                    mapa += "[X] ";
                } else {
                    mapa += "[ ] ";
                }
            }
            mapa += "\n";
        }

        return mapa;
    }

}
