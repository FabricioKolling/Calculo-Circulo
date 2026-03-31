package principal;

import javax.swing.JOptionPane;
import model.Circulo;

public class Principal {

    public static void main(String[] args) {
        Circulo trill = new Circulo();

        trill.setRaio(Double.parseDouble(JOptionPane.
                showInputDialog("Digite o raio do circulo: ")));

        JOptionPane.showMessageDialog(null, "A área do circulo é " + trill.getArea());
    }
}
