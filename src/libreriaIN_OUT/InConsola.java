package libreriaIN_OUT;
import java.util.Scanner;
public class InConsola implements InterfaceMetodosComunes {
    public void visualizar(String mensaje) {
    }
    public void introducirDatos() {
        System.out.println("Por favor, introduzca datos\n");
        Scanner sc = new Scanner(System.in);
        String entrada="";
        entrada=sc.nextLine();

    }
}
