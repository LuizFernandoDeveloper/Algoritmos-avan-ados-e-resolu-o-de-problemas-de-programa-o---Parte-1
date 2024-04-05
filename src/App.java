
//Recursividade

/**
  * Crie um Metodo chamdo findElement que seja capaz de encontra o enesimo
  * elemento de uma sequancia de fibonacci.
  * 
  * input: n, um inteiro representando a posicao do elemento na sequancia.
  * output: O enesimo elemento da sequancia de fibonacci.
  * seuqncia: 0, 1, 1, 2, 3, 5
  */

import java.util.HashMap;
import java.util.Map;

public class App {
    // Mapa para armazenar os números Fibonacci já calculados
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int findFactorial(int numberFactorial) {
        if (numberFactorial == 1 || numberFactorial == 0) {
            return 1;
        }

        if (memo.containsKey(numberFactorial)) {
            System.out.println("ENTROU segundo if");
            return memo.get(numberFactorial);
        }
        int numberMemoryFactorial   = numberFactorial * findFactorial(numberFactorial - 1);
        memo.put(numberFactorial, numberMemoryFactorial);

        return numberMemoryFactorial;
    }

    // Função para imprimir o HashMap de memoização
    public static void imprimirMemo() {
        System.out.println("Memoização:");
        for (Map.Entry<Integer, Integer> entry : memo.entrySet()) {
            System.out.println("Número: " + entry.getKey() + ", Fatorial: " + entry.getValue());
        }
    }

    public static int f(int number) {
        return 0;
    }

    public static void main(String[] args) throws Exception {
        int numberFactorial = 7;
        findFactorial(numberFactorial);
        // System.err.println("Elemento " + numberFactorial + " : " +
        // findFactorial(numberFactorial));

        // Imprime o HashMap de memoização
        // imprimirMemo();
    }
}