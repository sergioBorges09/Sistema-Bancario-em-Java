import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Banco Horizonte");

        System.out.println("\nDigite seus dados bancários");
        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o tipo de conta: ");
        String tipo = scanner.nextLine();

        System.out.println("Digite seu saldo: ");
        Double saldo = scanner.nextDouble();

        Cliente cliente = new Cliente(nome, tipo, saldo);
        Operacoes operacoes = new Operacoes();

        int escolha = 0;

        System.out.println("\nNome: " + nome);
        System.out.println("Tipo de conta: " + tipo);
        System.out.println("Saldo: " + saldo);

        while(escolha != 4){
            System.out.println("\nOperações");
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.println("Escolha a opção desejada: ");
            escolha = scanner.nextInt();

            switch(escolha){
                case 1: {
                    System.out.println("Saldo atual: ");
                    operacoes.consultarSaldo(cliente);
                    break;
                }
                case 2: {
                    System.out.println("Informe o valor a receber: ");
                    double valorReceber = scanner.nextDouble();
                    operacoes.receberValor(cliente, valorReceber);
                    break;
                }
                case 3: {
                    System.out.println("Informe o valor a transferir: ");
                    double valorTransferir = scanner.nextDouble();
                    operacoes.transferirValor(cliente, valorTransferir);
                    break;
                }
                case 4: {
                    System.out.println("Encerrando sistema");
                    break;
                }
                default: {
                    System.out.println("Opção invalida");
                    break;
                }
            }
        }
        scanner.close();
    }
}