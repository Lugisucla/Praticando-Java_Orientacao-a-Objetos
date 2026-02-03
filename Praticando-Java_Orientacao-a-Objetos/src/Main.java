
import Classes.*;

import java.util.ArrayList;
import java.util.List;
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
                    List<Livro> biblioteca = new ArrayList<>();
                    String confirma;
                    scanner.nextLine();

                    do {
                        System.out.println("Digite o nome do livro a ser adicionado: ");
                        String titulo = scanner.nextLine();

                        System.out.println("Digite o autor do livro: ");
                        String autor = scanner.nextLine();

                        System.out.println("Digite a quantidade de páginas do livro: ");
                        int quantidade = Integer.parseInt(scanner.nextLine());

                        Livro livro = new Livro(titulo, autor, quantidade);
                        biblioteca.add(livro);

                        for (Livro l : biblioteca) {
                            System.out.printf("%s de %s com %d páginas.%n", l.getTitulo(), l.getAutor(), l.getQuantidade());
                        }

                        System.out.println("Deseja adicionar um novo livro? (Sim/Não)");
                        confirma = scanner.nextLine();

                    } while (confirma.equalsIgnoreCase("Sim"));
                    System.out.println("Biblioteca fechada.");
                    break;
                case 3:
                    Conta conta = new Conta();

                    System.out.println("Digite o saldo atual: ");
                    conta.setSaldo(scanner.nextDouble());
                    conta.exibirSaldo();
                    conta.zerarSaldo();
                    conta.exibirSaldo();
                    break;
                case 4:
                    Temperatura temperatura = new Temperatura();
                    scanner.nextLine();

                    System.out.println("Digite o local do sensor: ");
                    temperatura.setLocal(scanner.nextLine());

                    System.out.println("Digite o temperatura atual: ");
                    double temperaturaAtual = scanner.nextDouble();

                    if (temperaturaAtual > 37.5) {
                        System.out.printf("Sensor do local: %s \nTemperatura: %.1f ºC \nAlerta: Temperatura acima do limite\n", temperatura.getLocal(), temperaturaAtual);
                    } else {
                        System.out.printf("Sensor do local: %s \nTemperatura: %.1f ºC \nAlerta: Temperatura abaixo do limite\n", temperatura.getLocal(), temperaturaAtual);
                    }
                    break;
                case 5:
                    String situacao;
                    Media media = new Media();
                    scanner.nextLine();

                    System.out.println("Digite o nome do aluno: ");
                    media.setNome(scanner.nextLine());
                    System.out.println("Digite a primeira nota do aluno: ");
                    media.setNota1(scanner.nextDouble());
                    System.out.println("Digite a segunda nota do aluno: ");
                    media.setNota2(scanner.nextDouble());

                    media.calculaMedia(media.getNota1(), media.getNota2());

                    if (media.getMediaNotas() >= 7) {
                        situacao = "Aprovado";
                    } else {
                        situacao = "Reprovado";
                    }

                    System.out.printf("Aluno: %s \nNota 1: %.1f \nNota 2: %.1f \nMédia: %.1f \nSituação: %s\n", media.getNome(), media.getNota1(), media.getNota2(), media.getMediaNotas(), situacao);
                    break;
                case 6:
                    Cadastro cadastro = new Cadastro();
                    scanner.nextLine();

                    System.out.println("Digite o nome do funcionário: ");
                    cadastro.setNome(scanner.nextLine());

                    System.out.println("Digite o cargo atual do funcionário: ");
                    cadastro.setCargoAtual(scanner.nextLine());

                    System.out.println("Digite o nível de acesso atual do funcionário: ");
                    cadastro.setNivelAcessoAtual(scanner.nextInt());

                    System.out.printf("Digite o novo cargo do funcionário: ");
                    cadastro.setCargoNovo(scanner.nextLine());

                    System.out.println("Digite o novo nivel de acesso do funcionário: ");
                    cadastro.setNivelAcessoNovo(scanner.nextInt());

                    cadastro.exibirAtualizacao();
                    break;
                case 7:
                    List<Tarefa> listaTarefa = new ArrayList<>();
                    scanner.nextLine();

                    do {
                        Tarefa tarefa = new Tarefa();
                        System.out.println("Digite a descrição da tarefa: ");
                        tarefa.setDescricao(scanner.nextLine());

                        System.out.println("A tarefa foi concluída? (true/false)");
                        tarefa.setConcluido(scanner.nextBoolean());

                        listaTarefa.add(tarefa);
                        scanner.nextLine();

                        System.out.println("Deseja adicionar uma nova tarefa? (Sim/Não)");
                        confirma =  scanner.nextLine();

                    }  while (confirma.equalsIgnoreCase("Sim"));


                    for (Tarefa l : listaTarefa) {
                        String status;
                        if (l.isConcluido()) {
                            status = "Concluída";
                        } else {
                            status = "Pendente";
                        }

                        System.out.printf("Tarefa: %s - Status: %s \n", l.getDescricao(), status);
                    }
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