# Estruturas de Repetição e Array

## Estrutura de Repetição

- Uma estrutura de repetição permite que uma sequência de comandos seja executada repetidamente, caso determinadas condições sejam satisfeitas. ​
- Essas condições são representadas por expressões lógica.​

As estruturas de repetição podem ser classificadas em:

> **Repetição com teste no início (while)​**
  
<p align="center">
<img src="https://mermaid.ink/img/pako:eNptkLFqw0AMhl_l0GRD8gI2pEOTQJYu7tReB3EnNyK9O3M-hxbjp-nQqU_hF6ts7EAhmn5J_ych9WCCJSjgPWJzVs_7Unsl0SaMKctOfvw1HPJcbbc7daXINRuM_WPwlsef8TsoTCTa4sOwoDeXMKpiN6P0SaaTma-HRSic8bcFWvv_99yb-DQtnVw1uyw7ssvzEjbgKDpkK5f0E6QhncmRhkKkxXjRoP0gPuxSqL68gSLFjjbQNVYu2DPKAxwUNX60Um3Qv4Sw5sMfOyJkhQ?type=png)](https://mermaid.live/edit#pako:eNptkLFqw0AMhl_l0GRD8gI2pEOTQJYu7tReB3EnNyK9O3M-hxbjp-nQqU_hF6ts7EAhmn5J_ych9WCCJSjgPWJzVs_7Unsl0SaMKctOfvw1HPJcbbc7daXINRuM_WPwlsef8TsoTCTa4sOwoDeXMKpiN6P0SaaTma-HRSic8bcFWvv_99yb-DQtnVw1uyw7ssvzEjbgKDpkK5f0E6QhncmRhkKkxXjRoP0gPuxSqL68gSLFjjbQNVYu2DPKAxwUNX60Um3Qv4Sw5sMfOyJkhQ" /><br>
Fluxograma para demonstrar o uso da instrução while.</p>

```java
public class ExemploWhile {
    public static void main(String[] args) {
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }
}
```
  
> **Repetição com teste no final (do-while)​**
  
<p align="center">
<img src="https://mermaid.ink/img/pako:eNptj02KwkAQha_S1CoBvUACuvAH3MzG2dkuiu6KFtrd0nZECTmNC1eeIhezIlEYmFo9eN8HrxowwRIUsIt42qvfeam9kjsnjCnLVr57Gg55rsbjiaIrmVqKzWIICrtHdw_bQfr0b_hCkSs2GJtZ8JbfoMJEki1O20H5UuKonx7p3Ypdli3Z5fl_2JrdnzkljMBRdMhWHml6Q0PakyMNhUSL8aBB-1Y4rFNY37yBIsWaRlCfrGyaM8r_DooKj2dqX9RdXpI?type=png)](https://mermaid.live/edit#pako:eNptj02KwkAQha_S1CoBvUACuvAH3MzG2dkuiu6KFtrd0nZECTmNC1eeIhezIlEYmFo9eN8HrxowwRIUsIt42qvfeam9kjsnjCnLVr57Gg55rsbjiaIrmVqKzWIICrtHdw_bQfr0b_hCkSs2GJtZ8JbfoMJEki1O20H5UuKonx7p3Ypdli3Z5fl_2JrdnzkljMBRdMhWHml6Q0PakyMNhUSL8aBB-1Y4rFNY37yBIsWaRlCfrGyaM8r_DooKj2dqX9RdXpI)" /><br>
Fluxograma para demonstrar o uso da instrução do-while.</p>

```java
public class ExemploDoWhile {
    public static void main(String[] args) {
        int contador = 1;
        do {
            System.out.println("Contador: " + contador);
            contador++; //contador = contador + 1;
        } while (contador <= 5);
    }
}
```

> **Repetição contada (for)​**

<p align="center">
<img src="https://mermaid.ink/img/pako:eNptkM9qwzAMxl_F6JRA-wIprId2g8LYpTut3kHYzipWW8F1xkrI0-zQ054iLzY5JPsD88H-LP0-S1YHhq2DCl4iNkf1uF3poGSdE8ZUFLswfBrislTL5Y06MTeHe9meJyoHxsybi1STwdhtOFgarsMHK0xOtMV1P-HflHjUnvxode_OtFLtcDsJhaN9rjHnR5iCic67kPndj1aG5bAcZ9Mv7m9__3XykJvNVE2-KO7Il-UKFuBd9EhWZtNlk4Z0lCc1VCItxlcNOvTCYZt4fwkGqhRbt4C2sfLzLaGM1ENV4-ks0QbDE_N8778AIHSA3w?type=png)](https://mermaid.live/edit#pako:eNptkM9qwzAMxl_F6JRA-wIprId2g8LYpTut3kHYzipWW8F1xkrI0-zQ054iLzY5JPsD88H-LP0-S1YHhq2DCl4iNkf1uF3poGSdE8ZUFLswfBrislTL5Y06MTeHe9meJyoHxsybi1STwdhtOFgarsMHK0xOtMV1P-HflHjUnvxode_OtFLtcDsJhaN9rjHnR5iCic67kPndj1aG5bAcZ9Mv7m9__3XykJvNVE2-KO7Il-UKFuBd9EhWZtNlk4Z0lCc1VCItxlcNOvTCYZt4fwkGqhRbt4C2sfLzLaGM1ENV4-ks0QbDE_N8778AIHSA3w" /><br>
Fluxograma para demonstrar o uso da instrução for.</p>

```java
public class ExemploFor {
    public static void main(String[] args) {
        for (int contador = 1; contador <= 5; contador++) {
            System.out.println("Contador: " + contador);
        }
    }
}
```

- comando `break` é utilizado para terminar de forma abrupta uma repetição.
```java
public class ExemploBreak {
    public static void main(String[] args) {
        int contador = 1;
        while (contador <= 10) {
            System.out.println("Contagem: " + contador);
            if (contador == 5) {
                System.out.println("O loop foi interrompido.");
                break; // Interrompe o loop quando contador atinge 5
            }
            contador++;
        }
        System.out.println("Fim do programa.");
    }
}
```
- Quando comando `continue` é executado, os comandos restantes da repetição são ignorados e programa volta a testar novamente a condição.
```java
public class ExemploContinue {
    public static void main(String[] args) {
        for (int contador = 1; contador <= 10; contador++) {
            if (contador == 5) {
                System.out.println("Pulando o número 5.");
                continue; // Pula a iteração atual e continua com a próxima
            }
            System.out.println("Contagem: " + contador);
        }
        System.out.println("Fim do programa.");
    }
}
```

## Array

- Um array é uma estrutura de dados que armazena um conjunto de valores do mesmo tipo.
- Deve ser declarado com um tipo de dado e tamanho específico.
- Pode ser unidimensional (vetor) ou multidimensional (matriz).
- O primeiro elemento está no índice 0, o segundo no índice 1 e assim por diante.
- Arrays são frequentemente percorridos usando loops, como for ou foreach, para processar ou manipular elementos.

```java
// Declarando um array de inteiros com tamanho 5
int[] numeros = new int[5];

// Inicializando o array com valores
int[] numeros = {1, 2, 3, 4, 5};

// Inicializando o array com valores
String[] nomes = {"Alice", "Bob", "Carol"};

// Inicializando o array com valores
double[] precos = {10.99, 20.49, 5.0, 7.75};

// Declarando um array bidimensional (matriz) de inteiros
int[][] matriz = new int[3][3];

// Inicializando o array bidimensional
int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

```

> for-each

<p align="center">
<img src="https://mermaid.ink/img/pako:eNplkU1qwzAQha8iZmVDsmiWLrQUTMEQSiBd1e5isJVGpJLMWIYG49N03VWP4It1JFvgUK1m9L43Tz8D1LaRkMEHYXsWr_l9ZQSvziG5JCnM9FMrm6Ziu30QyqhaIe2tbctiroVv3hfTSg98I0-8RXvF08p8bsQTEV5ZEoWTpovWNTpnOUlId8OBpt8vpa3H9eMYk2aVSXFUOhhasrXsOiQPlofYBV9MuWFWMbv_Y1-mbxuIk9L-QknyzEG-StMberc-7qIsnugP3mCDDWhJGlXDTz54uAJ3llpWkHHZIF0qqMzIHPbOHq-mhsxRLzfQtw06mSvkn9KQnfCz490WzZu1sR__AAWJmU4?type=png)](https://mermaid.live/edit#pako:eNplkU1qwzAQha8iZmVDsmiWLrQUTMEQSiBd1e5isJVGpJLMWIYG49N03VWP4It1JFvgUK1m9L43Tz8D1LaRkMEHYXsWr_l9ZQSvziG5JCnM9FMrm6Ziu30QyqhaIe2tbctiroVv3hfTSg98I0-8RXvF08p8bsQTEV5ZEoWTpovWNTpnOUlId8OBpt8vpa3H9eMYk2aVSXFUOhhasrXsOiQPlofYBV9MuWFWMbv_Y1-mbxuIk9L-QknyzEG-StMberc-7qIsnugP3mCDDWhJGlXDTz54uAJ3llpWkHHZIF0qqMzIHPbOHq-mhsxRLzfQtw06mSvkn9KQnfCz490WzZu1sR__AAWJmU4" /><br>
Fluxograma para demonstrar o uso da instrução for-each.</p>

```java
public class ExemploForEachArrayLivros {
    public static void main(String[] args) {
        String[] livros = {
            "Matéria Escura",
            "Como ser um programador Melhor",
            "Desenvolvimento Real de Software",
            "Kotlin em Ação",
            "Como Mentir com Estatísticas"
        };

        for (String livro : livros) {
            System.out.println("Livro: " + livro);
        }
    }
}
```

----

# Bora Praticar!

1. **Maior Número**: Faça um programa que leia 5 números e informe o maior número. 
2. **Números Ímpares**: Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50. 
3. **Validação de Nota**: Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido. 
4. **Gerador de Tabuada**: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada.
5. **Vetor de Pares e Ímpares**: Faça um Programa que leia 10 números inteiros e armazene-os num vetor. Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores. 
6. **Soma, Multiplicação e Números de um Vetor**: Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os números.

> **Continue praticando:** https://wiki.python.org.br/EstruturaDeRepeticao<br>
> **Continue praticanto:** https://wiki.python.org.br/ExerciciosListas

## Referências

[1] DIO - Digital Innovation One. "Estruturas de Repetição e Arrays em Java". Disponível em: https://academiapme-my.sharepoint.com/:p:/g/personal/camila_cavalcante_dio_me/EQfCi7g0PoRfDHPKbPzwJZgBVhPHiH7oLh5JEypewoOCrA?e=onQS0n.

[2] GitHub. "Loops e Arrays." Disponível em: https://github.com/cami-la/loops-e-arrays.

## Autor

<a href="https://www.linkedin.com/in/cami-la/">
 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/64323124?v=4" width="100px;" alt=""/></a>
<br>

Feito com ❤️ por <a href="https://www.instagram.com/camimi_la/" title="Instagram">Cami-la </a> 👋🏽 
