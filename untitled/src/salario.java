import java.util.Scanner;
public class salario {
    public static  void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;
    System.out.println("ingrese comision");
    numero=sc.nextInt();
    sc.close();
    double sb,dedu,comi,salrioneto;
    sb=1423500;
    dedu=56940;
    comi=numero;
    salrioneto=(sb-dedu)+comi;
    System.out.println("El salario neto es igual a:" + salrioneto);
}
}
