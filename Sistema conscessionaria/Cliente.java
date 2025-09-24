import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private String contato;

    private static List<Cliente> todosClientes = new ArrayList<>();

    public Cliente(String nome, String cpf, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;

        todosClientes.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public static List<Cliente> getTodosClientes() {
        return todosClientes;
    }

    public void exibirInformacoes() {
        System.out.println("\nNome: " + nome);
        System.out.println("\nCPF: " + cpf);
        System.out.println("\nContato: " + contato);
    }

}
