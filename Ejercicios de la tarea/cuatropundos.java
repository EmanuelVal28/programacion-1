import java.util.Scanner;
public class cuatropundos {
    public static void main(String[] args) {
        double numerouno, numerodos;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        numerouno= leer.nextInt();
        System.out.println("Introduce el segundo numero");
        numerodos= leer.nextInt();
        if (numerouno>numerodos) {
            System.out.println("El primer número es el mayor");
        }
        if (numerouno<numerodos) {
            System.out.println("El primer número es el mas pequeño");
        }
        leer.close(); }
    }
