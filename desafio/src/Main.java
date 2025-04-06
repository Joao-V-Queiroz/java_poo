import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        // PASSO 1 - CRIAR UM CLIENTE
        Cliente cliente1 = new Cliente("João Victor Queiroz Silva", "Conta Corrente", 1000.00);

        // PASSO 2 - MONTAR MENU DE OPERAÇÕES
        int opcao;

        do {
            System.out.println(
            """
            ******** MENU DE OPERAÇÕES ********
            1 - Consultar Saldo
            2 - Receber Valor
            3 - Transferir Valor
            4 - Sair
            ***********************************
            """);
            System.out.print("Escolha uma opção: ");
            opcao = leitura.nextInt();
            leitura.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1 -> System.out.println(cliente1.extratoConta());
                case 2 -> {
                    System.out.print("Digite o valor a receber: ");
                    double valor = leitura.nextDouble();
                    leitura.nextLine(); // Limpar o buffer
                    cliente1.setSaldoInicial(cliente1.getSaldoInicial() + valor);
                    System.out.println("Valor recebido com sucesso!");
                }
                case 3 -> {
                    System.out.print("Digite o valor a transferir: ");
                    double valor = leitura.nextDouble();
                    leitura.nextLine(); // Limpar o buffer
                    if (valor > cliente1.getSaldoInicial()) {
                        System.out.println("Saldo insuficiente para transferência.");
                    } else {
                        cliente1.setSaldoInicial(cliente1.getSaldoInicial() - valor);
                        System.out.println("Transferência realizada com sucesso!");
                    }
                }
                case 4 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);
    }
}