package libreriaIN_OUT;

import javax.swing.*;

public class InVentana implements InterfaceMetodosComunes{

        public void visualizar(String mensaje) {
        }
        public void introducirDatos() {
            String entrada= JOptionPane.showInputDialog(null,"Por favor, introduzca los datos de entrada");
        }
}
