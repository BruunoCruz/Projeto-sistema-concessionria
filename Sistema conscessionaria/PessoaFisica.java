public class PessoaFisica extends Cliente {
    private String rg;  

    public PessoaFisica(String nome, String cpf, String contato, String rg) {
        super(nome, cpf, contato);
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("\nNome: " + getNome());
        System.out.println("\nCPF: " + getCpf());
        System.out.println("\nContato: " + getContato());
        System.out.println("\nRG: " + rg);
        System.out.println("\nTipo de cliente: Pessoa Física");
    }
}