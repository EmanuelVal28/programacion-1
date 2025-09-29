import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de estudiantes: ");
        int N = scanner.nextInt();

        int aprobados = 0;
        int reprobados = 0;
        int i = 1;

        while (i <= N) {
            System.out.print("Ingrese la calificación del estudiante " + i + " (0-10): ");
            double calificacion = scanner.nextDouble();

            if (calificacion >= 5) {
                System.out.println("El estudiante aprueba");
                aprobados++;
            } else if (calificacion < 5) {
                System.out.println("El estudiante reprobados");
                reprobados++;
            }
            i++;
        }

        System.out.println("Número total de reprobados: " + reprobados);
        System.out.println("Número total de aprobados: " + aprobados);

        scanner.close();
    }
}
