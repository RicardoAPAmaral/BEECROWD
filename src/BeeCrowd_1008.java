import java.util.Scanner;

public class BeeCrowd_1008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int idFuncionario= sc.nextInt();
        double horasTrabalhadas=sc.nextDouble();
        double valorHora =sc.nextDouble();
        double salario=(horasTrabalhadas*valorHora);
        System.out.println("NUMBER = "+idFuncionario);
        System.out.printf("SALARY = U$ %.2f%n",salario);
    }
}
