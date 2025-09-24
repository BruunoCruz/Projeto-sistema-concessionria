import java.time.LocalDate;

public class Carro extends Veiculo {
    protected int numPorta;

    public Carro(String modelo, String fabricante, int anoFabricacao, String tipo, String status, int numPorta, Cliente comprador, LocalDate dataVenda) {
        super(modelo, fabricante, anoFabricacao, tipo, status, comprador, dataVenda);
        this.numPorta = numPorta;
    }
    public int getNumPorta() {
        return numPorta;
    }       
    public void setNumPorta(int numPorta) {
        this.numPorta = numPorta;
    }
    @Override
    public void exibirInformacoes() {
        System.out.println("\nModelo: " + modelo);
        System.out.println("\nFabricante: " + fabricante);
        System.out.println("\nAno de Fabricação: " + anoFabricacao);
        System.out.println("\nTipo: " + tipo);
        System.out.println("\nStatus: " + status);
        System.out.println("\nNumero de Portas: " + numPorta);
        if (comprador != null) {
            System.out.println("\nComprador: " + comprador.getNome());
            System.out.println("\nData da Venda: " + dataVenda);
        }
    }
}