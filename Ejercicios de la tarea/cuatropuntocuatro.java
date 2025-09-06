import java.util.Scanner;
public class cuatropuntocuatro {
    public static void main(String[] args) {
        double numero;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el numero");
        numero = leer.nextInt();
        leer.close();
        double raiz = Math.sqrt(numero);
        if (numero>0) {
            System.out.println("La raiz cuadrada del numero" + numero + "es:" + raiz );
        } else {
            System.out.println("No tiene solucion real");}
    }
}