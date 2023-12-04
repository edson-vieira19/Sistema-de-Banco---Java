
import javax.swing.JOptionPane;

/**
 *
 * @author edson vieira 743674
 */
public class ContaNaoEncontradaException extends Exception {

    ContaNaoEncontradaException() {

        super("A conta bancária não foi encontrada");

    }

    public void imprimirAviso() {

        JOptionPane.showMessageDialog(null,
                "A Conta não Foi encontrada",
                "Conta Não Encontrada",
                JOptionPane.PLAIN_MESSAGE);

    }

}
