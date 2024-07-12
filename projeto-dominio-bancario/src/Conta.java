
import java.util.Comparator;

public abstract class Conta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public void sacar(double valorSaque){
        if (saldo < valorSaque){
            System.out.println("Valor de saque negado. Saldo insuficiente.");
        }
        else{
            saldo -= valorSaque;
            System.out.println("Saque realizado.");
        }
    }

    public void depositar(double valorDeposito){
        saldo += valorDeposito;
    }

    public void transferencia(double valorTransferencia, Conta contaDestino){
        if(saldo >= valorTransferencia){
            contaDestino.saldo += valorTransferencia;
            saldo -= valorTransferencia;
        }
        else{
            System.out.println("Valor de transferência negado. Saldo insuficiente.");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeCliente() {
        return cliente.getNome();
    }

    public int getIdadeCliente() {
        return cliente.getIdade();
    }

    @Override
    public String toString() {
        return "\n Conta (Nome: " + getNomeCliente() + ", Idade: " + getIdadeCliente() +", Agência: " + agencia + ", Número: " + numero + ", Saldo: " + saldo +  ")\n";
    }
}

class ComparatorPorIdade implements Comparator<Conta>{

    @Override
    public int compare(Conta c1, Conta c2) {
        return Double.compare(c1.getIdadeCliente(), c2.getIdadeCliente());
    }

}
