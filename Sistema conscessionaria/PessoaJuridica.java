public class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(String nome, String cpf, String contato, String cnpj) {
        super(nome, cpf, contato);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("\nNome: " + getNome());
        System.out.println("\nCPF: " + getCpf());
        System.out.println("\nContato: " + getContato());
        System.out.println("\nCNPJ: " + cnpj);
        System.out.println("\nTipo de cliente: Pessoa Juridica");
    }
}