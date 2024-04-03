
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

    public static int findElement(int n) {
        if (n <= 1) {
            return n;
        }
        // 2 = elemento na posicao 1 + elemento na posicao 0
        // 2 = findElement(1) + findElement(0)
        // 3 = elemento na posicao 2 + elemento na posicao 1
        // 3 = findElement(2) + findElement(1)
        return findElement(n - 1) + findElement(n - 2);
    }

    public static void main(String[] args) throws Exception {
        int n = 30;
        System.err.println("Elemento " + n + " : " + findElement(n));
    }
}