import java.util.Scanner;
public class cuatropuntounobtecla {
    public static void main(String[] args) {
        int temperatura;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce la temperatura");
        temperatura = leer.nextInt();
        leer.close();
        if (temperatura == 100) {
            System.out.println("La temperatura esta por encima del punto de ebullicion del agua");
        } else if (temperatura < 100) {
            System.out.println("La temperatura esta por debajo del punto de ebullicion del agua");}
    }
}
