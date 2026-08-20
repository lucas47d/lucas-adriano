import java.util.Scanner;

public class exercicio7 {
    public static String verao() {
        Scanner sc = new Scanner(System.in);
        return "\nÉ verão\nE o tempo está quente.";
    }

    public static String outono() {
        return "\nÉ outono\nE o tempo está ameno.";
    }

    public static String inverno() {
        return "\nÉ inverno\nE está frio.";
    }

    public static String primavera() {
        return "\nÉ primavera\nE o tempo está agradável.";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite um número de 1 a 4: ");
        int numero = sc.nextInt();

        switch (numero) {
            case 1:
                System.out.println(verao());
                break;

            case 2:
                System.out.println(outono());
                break;

            case 3:
                System.out.println(inverno());
                break;

            case 4:
                System.out.println(primavera());
                break;

            default:
                System.out.println("Número inválido.");
        }

        sc.close();
    }
}





