import java.util.Scanner;
public class cuatropuntounoc {
    public static void main(String[] args) {
        double numero;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el numero");
        numero = leer.nextInt();
        leer.close();
        if (numero>0) {
            System.out.println("Sumar al toral de positivos");
        } else if (numero<0) {
            System.out.println("Sumar al toral de negativos");}
    }
}
