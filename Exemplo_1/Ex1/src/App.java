import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        System.out.println("Hello, World!");

        // Declaração de variavel--> (Tipo) (nome variavel) = new (alguma coisa)
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco(" Rua 1 ");

        cliente.setCodigo(200);
        System.out.println(cliente.getCodigo());
        System.out.println(cliente.getEndereço());
        
        // solicitar um valor
        Scanner s = new Scanner(System.in);
         System.out.println("informe valor");
         int valor=s.nextInt();

        // laços de repetição
        // If - Else (se for verdadeiro executa)
        int result = 0;

		if (result > 1) {
			// Cod
		} else {
			//cod
		}

        // For (para;condiçao,encremento)
        for(int i = 0; i < 10; i++) {
            //cod
        }

        // while (enquanto)
        int count = 0;
        while(count < 2) {
          // cod
          count++;
        }

        // do while
        do {
            //cod
            count++;
       } while (count < 2);

       //Switch, Case e Default
       //O switch verifica uma variável e age de acordo com os seus casos. Exemplo.
        SWITCH (variável) {
            CASE valor :
                   //cod Código a ser executado caso o valor de case seja o mesmo da variável de switch.
	            break;
            CASE valor:
	              //outro código;
	            break;
        }

        //LISTAS\\
        //ArrayList: É como um array cujo tamanho pode crescer. A busca de um elemento é rápida, mas inserções e exclusões não são.
        List<String> lista =new ArrayList<String>();
        lista.add("Nome");

        // para ordenar uma lista
        Collections.sort(lista);


    }
}   


// set - adicionar valor 
// get - pegar valor