
//Recursividade

import java.util.HashMap;
import java.util.Map;

public class App {
    // Mapa para armazenar os números Fibonacci já calculados
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) throws Exception {
        System.out.println(findElement(30));
        memo.forEach((chave, valor) -> System.out.println("Chave: " + chave + ", Valor: " + valor));
    }

    public static int findElement(int numeroElemento) {
        if (numeroElemento <= 1) {
            return numeroElemento;
        }

        // Verifica se o valor já foi calculado e armazenado no memo
        if (memo.containsKey(numeroElemento)) {
            return memo.get(numeroElemento);
        }

        // Chamadas recursivas com memoização
        int resultado = findElement(numeroElemento - 1) + findElement(numeroElemento - 2);
        memo.put(numeroElemento, resultado); // Armazena o resultado no memo
        return resultado;
    }
}