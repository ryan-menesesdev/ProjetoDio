public class ContaCorrente extends Conta {
    public ContaCorrente(String nome, int idade, int agencia, int numero, double saldo){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = new Cliente(nome, idade);
    }
}
