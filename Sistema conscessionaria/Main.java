import java.util.Scanner;

public class Main {

    public static void esperarEnter(Scanner scanner) {
        System.out.println("Pressione ENTER para continuar...");
        scanner.nextLine();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        Cliente c1 = new Cliente("João", "123.456.789-00", "(11) 99999-0000");
        Cliente c2 = new Cliente("Maria", "987.654.321-00", "(11) 98888-1111");
        Cliente.getTodosClientes().add(c1);
        Cliente.getTodosClientes().add(c2);

        Veiculo v1 = new Veiculo("Fusca", "Volkswagen", 1970, "Carro", "Disponível", null, null);
        Veiculo v2 = new Veiculo("CB500", "Honda", 2018, "Moto", "Disponível", null, null);
        Veiculo.getTodosVeiculos().add(v1);
        Veiculo.getTodosVeiculos().add(v2);
        while (opcao != 11) {
            System.out.println("\n-------------------------Menu-------------------------");

            System.out.println("1 - Cadastrar Veículo  \r\n" +
                    "2 - Cadastrar Cliente (Pessoa Física / Jurídica)  \r\n" +
                    "3 - Editar Veículo  \r\n" +
                    "4 - Editar Cliente  \r\n" +
                    "5 - Deletar Veículo  \r\n" +
                    "6 - Deletar Cliente  \r\n" +
                    "7 - Listar Veículos  \r\n" +
                    "8 - Listar Clientes  \r\n" +
                    "9 - Realizar Venda (opcional)  \r\n" +
                    "10 - Ver Histórico de Vendas (opcional)  \r\n" +
                    "11 - Sair  ");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar Veículo.");
                    break;
                case 2:
                    System.out.println("Cadastrar Cliente.");
                    break;
                case 3:
                    System.out.println("Editar Veículo");
                    break;
                case 4:
                    System.out.println("Editar Cliente");
                    break;
                case 5:
                    System.out.println("Deletar Veículo");
                    break;
                case 6:
                    System.out.println("Deletar Cliente");
                    break;
                case 7:
                    ListagemVeiculos.listarVeiculos();
                    esperarEnter(scanner);
                    break;
                case 8:
                    ListagemClientes.listarClientes();
                    esperarEnter(scanner);
                    break;
                case 9:
                    System.out.println("Realizar Venda (opcional)");
                    break;
                case 10:
                    System.out.println("Ver Histórico de Vendas (opcional)");
                    break;
                case 11:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
