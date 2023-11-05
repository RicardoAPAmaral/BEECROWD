import java.util.Scanner;

public class BeeCrowd_1013 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maior=a;
        for(int counter=0;counter<=1;counter++) {
            if (b>maior){
                maior=b;
            }
            if(c>maior){
                maior=c;
            }

        }
        System.out.printf("%d eh o maior%n",maior);

    }
}
