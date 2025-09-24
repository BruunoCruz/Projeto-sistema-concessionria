import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Veiculo {
    protected String modelo;
    protected String fabricante;
    protected int anoFabricacao;
    protected String tipo;
    protected String status;
    protected Cliente comprador;
    protected LocalDate dataVenda;
    private static List<Veiculo> todosVeiculos = new ArrayList<>();

    public Veiculo(String modelo, String fabricante, int anoFabricacao, String tipo, String status, Cliente comprador,
            LocalDate dataVenda) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.anoFabricacao = anoFabricacao;
        this.tipo = tipo;
        this.status = status;
        this.comprador = comprador;
        this.dataVenda = dataVenda;

        todosVeiculos.add(this);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public void venderPara(Cliente comprador) {
        if (this.status.equalsIgnoreCase("Disponível")) {
            this.comprador = comprador;
            this.dataVenda = LocalDate.now();
            this.status = "Vendido";
        } else {
            System.out.println("Veículo não está disponível para venda.");
        }
    }

    public static List<Veiculo> getTodosVeiculos() {
        return todosVeiculos;
    }

    public void exibirInformacoes() {
        System.out.println("\nModelo: " + modelo);
        System.out.println("\nFabricante: " + fabricante);
        System.out.println("\nAno de Fabricação: " + anoFabricacao);
        System.out.println("\nTipo: " + tipo);
        System.out.println("\nStatus: " + status);
        if (comprador != null) {
            System.out.println("\nComprador: " + comprador.getNome());
            System.out.println("\nData da Venda: " + dataVenda);
        }
    }
}