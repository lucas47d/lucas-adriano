import java.util.Scanner;

public class estacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a estação do ano: ");

        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                impremirVerao();
                System.out.println("É verão");
                break;
            case 2:
                impremirInverno();
                System.out.println("É inverno ");
                break;
            case 3:
                impremirprimavera();
                System.out.println("É primavera ");
                break;
            case 4:
                impremirOutono();
                System.out.println("É outono ");

            default:
                System.out.println("Número inválido, tente outro");

        sc.close();

        }

    }

    public static void impremirVerao() {
        System.out.println(" - o tempo está quente ");
    }

    public static void impremirInverno() {
        System.out.println(" - o tempo está frio ");
    }

    public static void impremirprimavera() {
        System.out.println(" - o tempo está florido ");
    }

    public static void impremirOutono() {
        System.out.println(" - o tempo está florido ");

    }
}