import java.util.Scanner;

public class BeeCrowd_1011 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double pi=3.14159;
        double r=sc.nextDouble();
        double volumeC=(4.0/3.0)*pi*Math.pow(r,3);
        System.out.printf("VOLUME = %.3f%n",volumeC);

    }
}
