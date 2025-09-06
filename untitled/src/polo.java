import java.util.Scanner;
public class polo {
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("ingrese horas");
        numero=sc.nextInt();
        sc.close();
        double resultado,v,r;
        v=(numero*2000);
        r=(v*0.2);
        resultado = v-r;
        System.out.println("la cantidad de dinero en el parqueadero sin iva es:" + resultado);
    }
}
