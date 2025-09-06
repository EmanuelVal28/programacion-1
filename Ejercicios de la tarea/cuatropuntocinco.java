import java.util.Scanner;
public class cuatropuntocinco {
    public static void main(String[] args) {
        double numero;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el numero");
        numero = leer.nextInt();
        leer.close();
        if (numero%2==0) {
            System.out.println(numero + " es par ");}
            else{
            System.out.println(numero + " es impar ");
            }
    }
}