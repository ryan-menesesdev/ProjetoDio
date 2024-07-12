import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Banco {
    private Set<Conta> listaContas;

    public Banco(){
        this.listaContas = new HashSet<>();
    }

    public void adicionarConta(Conta conta){
        listaContas.add(conta);
    }

    public void removerContaPorNome(String nome){
        Conta ContaParaRemover = null;
        for(Conta c : listaContas){
            if(c.getNomeCliente().equalsIgnoreCase(nome)){
                ContaParaRemover = c;
                break;
            }
        }
        listaContas.remove(ContaParaRemover);
    }

    public Set<Conta> exibirPorIdade(){
        Set<Conta> contasPorIdade = new TreeSet<>(new ComparatorPorIdade());
        contasPorIdade.addAll(listaContas);
        return contasPorIdade;
    }

    @Override
    public String toString() {
        return "Banco [listaContas=" + listaContas + "]";
    }

    

}
