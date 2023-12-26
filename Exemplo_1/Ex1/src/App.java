public class App {
    public static void main(String args[]) {
        System.out.println("Hello, World!");

        // Declaração de variavel--> (Tipo) (nome variavel) = new (alguma coisa)
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco(" Rua 1 ");

        cliente.setCodigo(200);
        System.out.println(cliente.getCodigo());
        System.out.println(cliente.getEndereço());
        


    }
}


// set - adicionar valor 
// get - pegar valor