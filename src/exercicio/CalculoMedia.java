package exercicio;

import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nota1 = 10;
        int nota2 = 20;
        int nota3 = 30;
        int nota4 = 40;

        int soma = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println(soma);
        System.out.println("_____________________");

        System.out.println("Entre com os dados para soma final: ");
        System.out.print("Nota1: ");
        int not1 = sc.nextInt();

        System.out.print("Nota1: ");
        int not2 = sc.nextInt();

        System.out.print("Nota1: ");
        int not3 = sc.nextInt();

        System.out.print("Nota1: ");
        int not4 = sc.nextInt();

        int soma2 = (not1 + not2 + not3 + not4) / 4;
        System.out.print(soma2);


    }
}
