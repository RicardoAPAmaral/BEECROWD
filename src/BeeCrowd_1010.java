import java.util.Scanner;

public class BeeCrowd_1010 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int codA =sc.nextInt();
        int quantA =sc.nextInt();
        double valueA= sc.nextDouble();
        int codB=sc.nextInt();
        int quantB = sc.nextInt();
        double valueB= sc.nextDouble();
        double totalValue=(quantA*valueA)+(quantB*valueB);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",totalValue);

    }
}
