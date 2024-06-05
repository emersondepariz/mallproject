import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            int opcao = entradaUser.nextInt();
            entradaUser.nextLine(); // Consumir a nova linha

            if (opcao == 1) {
                // Coletar dados da loja
                // ...
                // Criar objeto Loja e imprimir informações
            } else if (opcao == 2) {
                // Coletar dados do produto
                // ...
                // Criar objeto Produto e verificar validade
            } else if (opcao == 3) {
                break;
            } else {
                System.out.println("Opção inválida");
            }
        }
        entradaUser.close();
    }
}
