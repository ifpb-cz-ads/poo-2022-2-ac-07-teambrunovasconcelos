import java.util.Scanner;

public class AbrirConta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 1 para abrir uma Conta Padrão");
        System.out.println("Digite 2 para abrir uma Conta Especial");
        System.out.println("Digite 3 para abrir uma Conta Poupança");

        int input = scan.nextInt();

        switch (input) {
            case 1:
                Conta C = new Conta(123456, "Bruno", 500);
                System.out.println("Conta criada com sucesso em nome de " + C.getNomeTitular());
                break;
            case 2:
                ContaEspecial ce = new ContaEspecial(45621, "Bruno", 300);
                System.out.println("Conta Especial criada com sucesso em nome de " + ce.getNomeTitular());
                break;
            case 3:
                ContaPoupanca cp = new ContaPoupanca(789654, "Bruno");
                System.out.println("Conta Poupança criada com sucesso em nome de " + cp.getNomeTitular());
                break;
        }

        scan.close();

    }
}
