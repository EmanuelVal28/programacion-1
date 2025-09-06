import java.util.Scanner;
public class cuatropuntounoe {
    public static void main(String[] args) {
        double distancia;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce la distancia");
        distancia = leer.nextInt();
        leer.close();
        if (distancia>20 && distancia<35) {
            System.out.println("leer un valor para tiempo");
        }
    }
}
