import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome = "Henrique Xavier";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;

        System.out.println("************************");
        System.out.println(nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo inicial: R$: " + saldoInicial);
        System.out.println("*************************");

        while(true) {

            System.out.println("\nOperacoes");
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");

            System.out.println("Digite a opção desejada:");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("O seu saldo é R$: " + saldoInicial);

            } else if (opcao == 2) {
                System.out.println("Digite o valor a ser recebido: ");
                double valorRecebido = scanner.nextDouble();
                double saldoFinal = valorRecebido + saldoInicial;
                saldoInicial = saldoFinal;
                String saldoFinalFormatado = String.format("%.2f" , saldoFinal);

                System.out.println("Saldo atualizado R$ " + saldoFinalFormatado);

            } else if (opcao == 3) {
                System.out.println("Digite o valor a ser transferido: ");
                double valorTransferido = scanner.nextDouble();
                double saldoTransferido = saldoInicial - valorTransferido;
                saldoInicial = saldoTransferido;
                String saldoTransferidoFormatado = String.format("%.2f" , saldoTransferido);

                System.out.println("Saldo atualizado R$ " + saldoTransferidoFormatado);

            } else if (opcao == 4) {
                System.out.println("Sistema encerrado");
                break;
            }

        }

        }
    }