
public class Main extends Banco {
    public static void main(String[] args) throws Exception {
            Banco bancoLegal = new Banco();
            Conta contaCorrente = new ContaCorrente("Ryan", 19, 12345, 10, 150);
            Conta contaCorrente1 = new ContaCorrente("João", 14, 98765, 1, 234);
            Conta contaCorrente2 = new ContaCorrente("Camilo", 20, 12376, 2, 580);

            Conta contaPoupanca = new ContaPoupança("Kleber", 24, 92836, 42, 800);
            Conta contaPoupanca1 = new ContaPoupança("George", 22, 15336, 78, 350);
            Conta contaPoupanca2 = new ContaPoupança("Jennifer", 27, 73853, 234, 1200);

            bancoLegal.adicionarConta(contaCorrente);
            bancoLegal.adicionarConta(contaCorrente1);
            bancoLegal.adicionarConta(contaCorrente2);

            bancoLegal.adicionarConta(contaPoupanca);
            bancoLegal.adicionarConta(contaPoupanca1);
            bancoLegal.adicionarConta(contaPoupanca2);

            System.out.println(bancoLegal);

            bancoLegal.removerContaPorNome("Ryan");
            bancoLegal.removerContaPorNome("Kleber");

            System.out.println(bancoLegal);

            System.out.println(bancoLegal.exibirPorIdade());
        


        
    }
}
