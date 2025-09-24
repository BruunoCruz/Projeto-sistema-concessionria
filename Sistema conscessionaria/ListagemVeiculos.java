import java.util.List;

public class ListagemVeiculos {
    public static void listarVeiculos() {
        List<Veiculo> lista = Veiculo.getTodosVeiculos();
        if (lista.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
            return;
        }
        System.out.println("=== Lista de Veículos ===");
        for (Veiculo v : lista) {
            v.exibirInformacoes();
            System.out.println("------------------------");
        }
    }
}
