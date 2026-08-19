import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o número base");


        int numBase = input.nextInt();

        System.out.println("Insira o número 1");

        int num1 = input.nextInt();

        System.out.println("Insira o número 2");

        int num2 = input.nextInt();

        obterNumeroPertoBase(numBase, num1, num2);
    }
    public static void obterNumeroPertoBase(int base, int num1, int num2){

        int distanciaBase1 = Math.abs(num1 - base);
        int distanciaBase2 = Math.abs(num2 - base);

        if (distanciaBase1<distanciaBase2){
            System.out.println("O número mais perto é "+ num1);
        }
        else if (distanciaBase2<distanciaBase1){
            System.out.println("O número mais perto é "+ num2);
        }
        else {
            System.out.println("As distâncias são iguais");
        }
       
    }
}
