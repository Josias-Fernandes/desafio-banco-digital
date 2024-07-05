// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cliente josias = new Cliente();
        josias.setNome("Josias");

        Conta cc =  new ContaCorrente(josias);
        cc.depositar(500);
        cc.sacar(150);

        Conta cp = new ContaPoupanca(josias);
        cc.transferir(300, cp);
        cp.depositar(1000);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}