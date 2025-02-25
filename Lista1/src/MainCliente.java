import exe2.Cliente;

public class MainCliente {
    public static void main(String[] args) {
        // Criando o cliente Fulano
        Cliente fulano = new Cliente(12345, 6789, "Fulano", 1000.0f);
        System.out.println(fulano.dadosCliente());

        // Realizando operações em Fulano
        fulano.realizarDeposito(500);
        fulano.realizarSaque(300);
        System.out.println(fulano.dadosCliente());

        System.out.println("--------------------------");

        // Criando o cliente Beltrano
        Cliente beltrano = new Cliente(54321, 9876, "Beltrano", 2000.0f);
        System.out.println(beltrano.dadosCliente());

        // Realizando operações em Beltrano
        beltrano.realizarDeposito(1000);
        beltrano.realizarSaque(2500);
        System.out.println(beltrano.dadosCliente());
    }
}
