import java.util.Scanner;

public class BeeCrowd_1014 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double distancia= sc.nextDouble();
        double litros=sc.nextDouble();
        double media=distancia/litros;
        System.out.printf("%.3f km/l%n",media);
    }
}
