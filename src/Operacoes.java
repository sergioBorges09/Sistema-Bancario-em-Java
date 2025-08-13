public class Operacoes {

    public void consultarSaldo(Cliente cliente){
        System.out.println("Saldo atual: " + cliente.getSaldo());
    }

    public void receberValor(Cliente cliente, double valor){
        cliente.setSaldo(cliente.getSaldo() + valor);
        System.out.println("Valor recebido com sucesso");
        consultarSaldo(cliente);
    }

    public void transferirValor(Cliente cliente, double valor) {
        if (valor > cliente.getSaldo()) {
            System.out.println("Valor da transferência maior que o saldo da conta!");
        } else {
            cliente.setSaldo(cliente.getSaldo() - valor);
            System.out.println("Transferência realizada com sucesso!");
            consultarSaldo(cliente);
        }
    }
}

