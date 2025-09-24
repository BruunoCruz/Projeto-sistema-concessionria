import java.util.List;

public class ListagemClientes {

    public static void listarClientes() {
        List<Cliente> lista = Cliente.getTodosClientes();

        if (lista.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        System.out.println("=== Lista de Clientes ===");
        for (Cliente c : lista) {
            c.exibirInformacoes();
            System.out.println("------------------------");
        }
    }
}
