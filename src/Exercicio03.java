/* a solução apresentada é a melhor para esse problema. Talvez não seja a solução que você tenha pensado, 
 * mas é importante comparar as soluções para verificar qual tem o melhor desempenho.
 * No final do arquivo tem algumas observações
 */

public class Exercicio03 {
    public static void main(String[] args) {
        long numero = 600851475143L;
        long maiorPrimo = 2;

        // observação 1 --> no final do arquivo
        while (numero % 2 == 0) {
            numero /= 2;
        }

        // lembrando que aqui vamos testar apenas os ímpares até a raiz quadrada do número limite
        for (long i = 3; i * i <= numero; i += 2) {
            while (numero % i == 0) {
                maiorPrimo = i;
                numero /= i;
            }
        }

        // a sobra é maior que 2? Se for ele é o maior primo
        if (numero > 2) {
            maiorPrimo = numero;
        }

        System.out.println("O maior divisor primo de 600851475143 é: " + maiorPrimo);
    }
}

/* observação 1
 * Removendo todos os fatores de 2 primeiro, é garantido que o número restante seja ímpar, 
 * o que nos permite pular todos os números pares no loop principal e verificar apenas divisores 
 * ímpares (como 3, 5, 7, ...). Isso melhora o desempenho do algoritmo, pois reduz pela metade os 
 * números que precisam ser testados como divisores.
 * Isso é útil especialmente para números grandes como 600851475143, pois evita verificações 
 * desnecessárias e acelera a busca pelo maior fator primo. 
 */
