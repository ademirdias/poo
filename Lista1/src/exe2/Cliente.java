package exe2;

public class Cliente {
    private int numeroConta;
    private int numeroAgencia;
    private String nome;
    private float saldo;

    // Construtor sem parâmetros
    public Cliente() {
        this.numeroConta = 0;
        this.numeroAgencia = 0;
        this.nome = "Nome não definido";
        this.saldo = 0.0f;
    }

    // Construtor com parâmetros
    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    // Método para depósito
    public void realizarDeposito(float valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Método para saque
    public void realizarSaque(float valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque não permitido. Saldo insuficiente ou valor inválido.");
        }
    }

    // Método para exibir informações da conta
    public String dadosCliente() {
        return "Conta: " + this.numeroConta +
                " | Nome: " + this.nome +
                " | Saldo: R$ " + this.saldo;
    }
}
