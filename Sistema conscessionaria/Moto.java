import java.time.LocalDate;

public class Moto extends Veiculo {
    protected String temBau;

    public Moto(String modelo, String fabricante, int anoFabricacao, String tipo, String status,  Cliente comprador, LocalDate dataVenda, String temBaum) {
        super(modelo, fabricante, anoFabricacao, tipo, status, comprador, dataVenda);
        this.temBau = temBau;
    }
    public String getTemBau() {
        return temBau;
    }

    public void setTemBau(String temBau) {
        this.temBau = temBau;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("\nModelo: " + modelo);
        System.out.println("\nFabricante: " + fabricante);
        System.out.println("\nAno de Fabricação: " + anoFabricacao);
        System.out.println("\nTipo: " + tipo);
        System.out.println("\nStatus: " + status);
        System.out.println("\nTem Baú: " + temBau);
        if (comprador != null) {
            System.out.println("\nComprador: " + comprador.getNome());
            System.out.println("\nData da Venda: " + dataVenda);
        }
    }
}