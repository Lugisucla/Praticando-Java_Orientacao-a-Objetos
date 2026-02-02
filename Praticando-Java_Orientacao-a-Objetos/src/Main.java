
import Classes.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String menu = "Digite o número da funcionalidade que deseja testar:\n" +
                "1 - Relatório do produto\n" +
                "2 - Imprimindo o resumo do livro\n" +
                "3 - Zerando o saldo\n" +
                "4 - Controle de temperatura\n" +
                "5 - Calculando as notas\n" +
                "6 - Corrigindo o cadastro\n" +
                "7 - Controle de tarefas\n" +
                "8 - Controle de estoque\n" +
                "9 - Multa por atraso\n" +
                "10 - Carrinho de compras\n" +
                "0 - Sair";

        System.out.println(menu);

        int escolha = -1;

        while (escolha != 0) {

            System.out.println(menu);
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    Produto produto1 = new Produto();
                    System.out.println("Digite o nome do produto: ");
                    scanner.nextLine();
                    produto1.setNome(scanner.nextLine());

                    System.out.println("Digite o valor do produto: ");
                    produto1.setPreco(scanner.nextDouble());

                    System.out.println("Digite a quantidade do produto: ");
                    produto1.setQuantidade(scanner.nextInt());

                    produto1.exibirInfoProduto();
                    break;
                case 2:
                    System.out.println("Essa funcionalidade não existe no momento");
                    break;
                case 3:
                    System.out.println("Essa funcionalidade não existe no momento");
                    break;
                case 4:
                    System.out.println("Essa funcionalidade não existe no momento");
                    break;
                case 5:
                    System.out.println("Essa funcionalidade não existe no momento");
                    break;
                case 6:
                    System.out.println("Essa funcionalidade não existe no momento");
                    break;
                case 7:
                    System.out.println("Essa funcionalidade não existe no momento");
                    break;
                case 8:
                    System.out.println("Essa funcionalidade não existe no momento");
                    break;
                case 9:
                    System.out.println("Essa funcionalidade não existe no momento");
                    break;
                case 10:
                    System.out.println("Essa funcionalidade não existe no momento");
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Não existe nenhuma funcionalidade com esse número!");
            }
        }

        scanner.close();
    }
}