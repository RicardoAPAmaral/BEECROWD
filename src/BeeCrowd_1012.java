import java.util.Scanner;

public class BeeCrowd_1012 {
    public static void main(String[]args) {
        Scanner sc =new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double pi=3.14159;
        double triangle=(a*c)/2;
        double circle=(2*pi*Math.pow(c,2))/2;
        double trapz = ((a+b)*c)/2;
        double square = b*b;
        double rectangle= a*b;
        System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%n" +
                "TRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n",triangle,circle,trapz,square,rectangle);

    }
}
