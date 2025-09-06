import java.util.Scanner;
public class cuatropuntoocho {
    public static void main(String[] args) {
        int a,b;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        a= leer.nextInt();
        System.out.println("Introduce el segundo numero");
        b= leer.nextInt();
        if (a==0 || b==0) {
            System.out.println("No se puede comprobar divisibilidad con cero.");}
            else
                if (a%b==0) {
            System.out.println("El numero " + a + " es divisible por " + b);
            }
            else if (b%a==0) {
            System.out.println("El numero " + b + " es divisible por " + a);
            }
            else {
                    System.out.println("Ninguno es divisor del otro.");
                }
        leer.close(); }
}