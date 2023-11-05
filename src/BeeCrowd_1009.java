import java.util.Scanner;

public class BeeCrowd_1009 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        String name= sc.nextLine();
        double salary=sc.nextDouble();
        double sales=sc.nextDouble();
        salary+=sales*0.15;
        System.out.printf("TOTAL = R$ %.2f%n",salary);


    }
}
