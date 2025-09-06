import java.util.Scanner;
public class Main {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("ingrese pesos");
        numero=sc.nextInt();
        sc.close();
        double pesos,resultadod,resultadoe;
        pesos=numero;
        resultadod=pesos*0.0002495;
        resultadoe=pesos*0.0002131;
        System.out.println("la conversion de pesos a dollares es:" + resultadod);
        System.out.println("la conversion de pesos a euros es:" + resultadoe);

    }
}
