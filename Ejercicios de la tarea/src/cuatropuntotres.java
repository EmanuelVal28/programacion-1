import java.util.Scanner;
import java.util.Arrays;
public class cuatropuntotres {
    public static void main(String[] args) {
        int a,b,c;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        a= leer.nextInt();
        System.out.println("Introduce el segundo numero");
        b= leer.nextInt();
        System.out.println("Introduce el tercer numero");
        c= leer.nextInt();
        int[] numeros = {a, b, c};
        Arrays.sort(numeros);
        int mediana = numeros[1];
        System.out.println("La mediana (número central) es: " + mediana);
        leer.close(); }
}