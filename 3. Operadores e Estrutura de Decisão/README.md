# Operadores e Estrutura de Decisão

> **Operadores Java**

Operadores são símbolos que representam atribuições, cálculos e ordem dos dados. 

<p align="center"> <img src="https://3.bp.blogspot.com/_fHw7UbiXVVc/TJfy4KJVPTI/AAAAAAAAAB0/axLRvliRZUw/s1600/operadores2.png" alt="Operadores Java"/></p>
<p align="center"><a href="http://www.deinf.ufma.br/~mario/grad/poo/aulas/TiposOperadores.pdf">Figura 1: Operadores Java </a></p>

- Operadores Aritméticos:

```java
int a = 10;
int b = 3;
int sum = a + b;      // 13
int difference = a - b;  // 7
int product = a * b;  // 30
int quotient = a / b;  // 3
int remainder = a % b; // 1
```
- Operadores de Atribuição:

```java
int x = 5;
```

- Operadores de Comparação:

```java
int num1 = 10;
int num2 = 5;
boolean isEqual = num1 == num2;    // false
boolean isNotEqual = num1 != num2; // true
boolean isGreater = num1 > num2;   // true
boolean isLess = num1 < num2;      // false
```

- Operadores Lógicos:

```java
boolean condition1 = true;
boolean condition2 = false;
boolean result1 = condition1 && condition2; // false
boolean result2 = condition1 || condition2; // true
boolean result3 = !condition1; // false
```

> **Precedência de Operadores**

As operações seguem uma ordem de prioridades, ou seja, alguns cálculos (ou outros) são processados antes de outros. 

<p align="center"> <img src="https://tsimpoo.files.wordpress.com/2013/03/tabela-11-precedc3aancia-de-operadores.png" alt="Precedência de Operadores"/></p>
<p align="center"><a href="https://tsimpoo.wordpress.com/2014/08/12/">Figura 2: Tabela de Precedência de Operadores </a></p>

> **Tabela verdade**

Uma tabela verdade é uma representação tabular de todas as combinações possíveis de valores de entrada (geralmente valores booleanos, ou seja, verdadeiro ou falso) para uma expressão lógica.

<p align="center"> <img src="https://slideplayer.com.br/slide/2703036/10/images/35/Operadores+L%C3%B3gicos+Tabela-verdade+para+os+operadores+%26%26+e+%7C%7C+A+B.jpg" width="600" alt="4 Pilares do Pensamento Computacional"/></p>

<p align="center"><a href="https://slideplayer.com.br/slide/2703036/">Figura 3: Tabela Verdade Java </a></p>

## Estrutura de Decisão

As estruturas condicionais geralmente analisam expressões booleanas e, caso estas expressões sejam verdadeiras, um trecho do código é executado. No caso contrário, outro trecho do código é executado.

> if

<p align="center">
<img src="https://mermaid.ink/img/pako:eNpNjzGKw0AMRa8iVNngFOmCIU4TFlwn1e6kEJ7JZtiMZCYzRTA-QA6zp_DFVrYJrCrp_6ePNGAn1mGN35H6G5yPhkHrkSimomh5-u28lCVsNg147nNqWr5KDA4IvCXrLuvC4i1UJ2yHdrag2cN2dxhXYtYVgJMPCxfIS_yaXmsDiv_PW8WZk5w0uig-fChLw1hhcFFtq0cPM2ww3VxwBmttLcUfg4ZH5SgnOT25wzrF7CrMvaXkjp7014D1le4PVXviT5H3PP4B1ahZBQ?type=png)](https://mermaid.live/edit#pako:eNpNjzGKw0AMRa8iVNngFOmCIU4TFlwn1e6kEJ7JZtiMZCYzRTA-QA6zp_DFVrYJrCrp_6ePNGAn1mGN35H6G5yPhkHrkSimomh5-u28lCVsNg147nNqWr5KDA4IvCXrLuvC4i1UJ2yHdrag2cN2dxhXYtYVgJMPCxfIS_yaXmsDiv_PW8WZk5w0uig-fChLw1hhcFFtq0cPM2ww3VxwBmttLcUfg4ZH5SgnOT25wzrF7CrMvaXkjp7014D1le4PVXviT5H3PP4B1ahZBQ" /><br>
Fluxograma para demonstrar o uso da instrução if.</p>

```java
// Programa Java para demonstrar o uso da instrução if.
public class ExemploIf {
    public static void main(String[] args) {
        // definindo uma variável 'idade'
        int idade = 20;
        // verificando a idade
        if (idade > 18) {
            System.out.print("Idade é maior que 18");
        }
    }
}
```
> if/else

<p align="center">
<img src="https://mermaid.ink/img/pako:eNptkMFKAzEQQH9lGBB2oQXxuND1UoReeqknjYdhN2uDTiakiSDLfoDf4bk_4DU_Zpq1KmJOmZk3b4YZsZNeY4OPntwebtfKQn6HQD5U1camY2ekrmG5bMFYF0O7sYN41iBg0wdrLw9zS6kW7kV7M5iO_LidCbiAK1it4PJ6mtlvIvOwM1zaHPn79Ha2nsIvsytcCxJDHlFVN4br-h_RNr3LvCj_caUj_-hK9ZdQWVxgxphMnw8xniiFYa9ZK2zytyf_pFDZKXMUg-xebYdN8FEvMLqegl4byvdjbAZ6PuSsI3snco6nT29cecw?type=png)](https://mermaid.live/edit#pako:eNptkMFKAzEQQH9lGBB2oQXxuND1UoReeqknjYdhN2uDTiakiSDLfoDf4bk_4DU_Zpq1KmJOmZk3b4YZsZNeY4OPntwebtfKQn6HQD5U1camY2ekrmG5bMFYF0O7sYN41iBg0wdrLw9zS6kW7kV7M5iO_LidCbiAK1it4PJ6mtlvIvOwM1zaHPn79Ha2nsIvsytcCxJDHlFVN4br-h_RNr3LvCj_caUj_-hK9ZdQWVxgxphMnw8xniiFYa9ZK2zytyf_pFDZKXMUg-xebYdN8FEvMLqegl4byvdjbAZ6PuSsI3snco6nT29cecw" /><br>
Fluxograma para demonstrar o uso da instrução if-else.</p>

```java
// Um programa Java para demonstrar o uso da instrução if-else.
// É um programa de número par e ímpar.
public class ExemploIfElse {
    public static void main(String[] args) {
        // definindo uma variável
        int numero = 13;
        // Verificar se o número é divisível por 2 ou não
        if (numero % 2 == 0) {
            System.out.println("número par");
        } else {
            System.out.println("número ímpar");
        }
    }
}
```

> Operador ternário

<p align="center">
<img src="https://mermaid.ink/img/pako:eNptkMFKAzEQQH9lGBB2oQXxuND1UoReeqknjYdhN2uDTiakiSDLfoDf4bk_4DU_Zpq1KmJOmZk3b4YZsZNeY4OPntwebtfKQn6HQD5U1camY2ekrmG5bMFYF0O7sYN41iBg0wdrLw9zS6kW7kV7M5iO_LidCbiAK1it4PJ6mtlvIvOwM1zaHPn79Ha2nsIvsytcCxJDHlFVN4br-h_RNr3LvCj_caUj_-hK9ZdQWVxgxphMnw8xniiFYa9ZK2zytyf_pFDZKXMUg-xebYdN8FEvMLqegl4byvdjbAZ6PuSsI3snco6nT29cecw?type=png)](https://mermaid.live/edit#pako:eNptkMFKAzEQQH9lGBB2oQXxuND1UoReeqknjYdhN2uDTiakiSDLfoDf4bk_4DU_Zpq1KmJOmZk3b4YZsZNeY4OPntwebtfKQn6HQD5U1camY2ekrmG5bMFYF0O7sYN41iBg0wdrLw9zS6kW7kV7M5iO_LidCbiAK1it4PJ6mtlvIvOwM1zaHPn79Ha2nsIvsytcCxJDHlFVN4br-h_RNr3LvCj_caUj_-hK9ZdQWVxgxphMnw8xniiFYa9ZK2zytyf_pFDZKXMUg-xebYdN8FEvMLqegl4byvdjbAZ6PuSsI3snco6nT29cecw" /><br>
Fluxograma para demonstrar o uso da instrução if-else ternário.</p>

```java
// Um programa Java para demonstrar o uso da instrução if-else ternário.
// É um programa de número par e ímpar.
public class ExemploIfElseTernario {
    public static void main(String[] args) {
        int numero = 13;
        // Usando o operador ternário
        String resultado = (numero % 2 == 0) ? "número par" : "número ímpar";
        System.out.println(resultado);
    }
}
```

> if-else-if

<p align="center">
<img src="https://mermaid.ink/img/pako:eNp11NtugjAYB_BXaXphINPEE6hkuqhkiTe7cVcTLhopsxltSTkki_Fhll3vKXyxlYOItnJD-b5_86PJB0e45wGGDvwUKD6Ad9djQF5JikRqGBt2_tsTbpqg11uAAIeEEbFzqztgPEVgDmzLrzbV_TKbY0FCskdicCxjz8Dqv5yq3LUno2BLaLlD4FjwHAV816x8Xf7t_MtviWFFLObSAJ0OqEFbBYdtsIi5uzLs-rqgKo0ayW5LE1Ua3UvrSlr7uqAqjRtp0pamqjS-l1aVtPJ1QVWyGmnalmaqZN1Ly0pa-rqgKtmNNGtLg75K2QoVR1lSc0--Lt14hOUoInKONiw__xSrOt_MVRWjsSBUjvOmXsh-kkXpde7KAbnJXuvrB_XVg_ryUb04l6Z3OYSudXnfohUSahivhJom7EKKBUUkkF_zsYh6MD1gij3oyGWAxJcHPXaSOZSlfPvN9tBJRYa7MIsDlGKXIPkToNAJUZTIaozYB-eX59M_wI5T-g?type=png)](https://mermaid.live/edit#pako:eNp11NtugjAYB_BXaXphINPEE6hkuqhkiTe7cVcTLhopsxltSTkki_Fhll3vKXyxlYOItnJD-b5_86PJB0e45wGGDvwUKD6Ad9djQF5JikRqGBt2_tsTbpqg11uAAIeEEbFzqztgPEVgDmzLrzbV_TKbY0FCskdicCxjz8Dqv5yq3LUno2BLaLlD4FjwHAV816x8Xf7t_MtviWFFLObSAJ0OqEFbBYdtsIi5uzLs-rqgKo0ayW5LE1Ua3UvrSlr7uqAqjRtp0pamqjS-l1aVtPJ1QVWyGmnalmaqZN1Ly0pa-rqgKtmNNGtLg75K2QoVR1lSc0--Lt14hOUoInKONiw__xSrOt_MVRWjsSBUjvOmXsh-kkXpde7KAbnJXuvrB_XVg_ryUb04l6Z3OYSudXnfohUSahivhJom7EKKBUUkkFzsYh6MD1gij3oyGWAxJcHPXaSOZSlfPvN9tBJRYa7MIsDlGKXIPkToNAJUZTIaozYB-eX59M_wI5T-g" width="500"/><br>
Fluxograma para demonstrar o uso da instrução if-else-if.</p>

```java
// Um programa Java para demonstrar o uso da instrução if-elseif-else encadeado.
// É um programa de sistema de notas para reprovado, nota D, nota C, nota B, nota A e nota A+.
public class ExemploIfElseIf {
    public static void main(String[] args) {
        int nota = 65;
        if (nota < 50) {
            System.out.println("reprovado");
        } else if (nota >= 50 && nota < 60) {
            System.out.println("nota D");
        } else if (nota >= 60 && nota < 70) {
            System.out.println("nota C");
        } else if (nota >= 70 && nota < 80) {
            System.out.println("nota B");
        } else if (nota >= 80 && nota < 90) {
            System.out.println("nota A");
        } else if (nota >= 90 && nota < 100) {
            System.out.println("nota A+");
        } else {
            System.out.println("Inválido!");
        }
    }
}
```

> swich case

<p align="center">
<img src="https://mermaid.ink/img/pako:eNp9lNFq2zAUhl_lTFcJtLBka5IFOtgIgQzSXbRXlXeh2CeJNksKsuTRlD7MrgqFPkVerMeScjGQ6xv_-v35IP3n2I-sNBWyOdtZcdjD3aLQQFfjhHWDwUqfXktphkO4vPwKFW6llpYv4h0UNnAN01_xlfQ0kM1f6co9_16b0qRFouKCIChFgzAK-G-hOSn4ITRKa_LoOKBbbDkpWGKLth_-FGAlLCcFa2FPzz3k50CKjeWk4NvGyjoPXqWSkl-FkrKn4CQeyWs-6Y7k9b4HnCaw5tMA1n3gLG5xZ_is2-LONK6H_BLTR8dJwS06VJu-iEYfA2y8452En975fjg2SpuWdxJuTPte6XGalyPvJCzwmKdpZoSvXaClbvn69NLASrenf7WszIfE03hEQh2sVDSAqyRoPwrX2CSOZuM_Lro0BBmXGp5lZcalXmbdOld3ZzIudSTjUvQZlzLOuJRlxqXMcu45nvDBSDUYLKUaDtkFU2jpiBV97o8dWjC3R4UFm5OshP1TsEI_ESe8M7cPumRzZz1eMH-ohMOFFPSXUGy-FXVD7kHoe2PO66c3ildUEw?type=png)](https://mermaid.live/edit#pako:eNp9lNFq2zAUhl_lTFcJtLBka5IFOtgIgQzSXbRXlXeh2CeJNksKsuTRlD7MrgqFPkVerMeScjGQ6xv_-v35IP3n2I-sNBWyOdtZcdjD3aLQQFfjhHWDwUqfXktphkO4vPwKFW6llpYv4h0UNnAN01_xlfQ0kM1f6co9_16b0qRFouKCIChFgzAK-G-hOSn4ITRKa_LoOKBbbDkpWGKLth_-FGAlLCcFa2FPzz3k50CKjeWk4NvGyjoPXqWSkl-FkrKn4CQeyWs-6Y7k9b4HnCaw5tMA1n3gLG5xZ_is2-LONK6H_BLTR8dJwS06VJu-iEYfA2y8452En975fjg2SpuWdxJuTPte6XGalyPvJCzwmKdpZoSvXaClbvn69NLASrenf7WszIfE03hEQh2sVDSAqyRoPwrX2CSOZuM_Lro0BBmXGp5lZcalXmbdOld3ZzIudSTjUvQZlzLOuJRlxqXMcu45nvDBSDUYLKUaDtkFU2jpiBV97o8dWjC3R4UFm5OshP1TsEI_ESe8M7cPumRzZz1eMH-ohMOFFPSXUGy-FXVD7kHoe2PO66c3ildUEw" /><br>
Fluxograma para demonstrar o uso da instrução switch-case.</p>

```java
// Um programa Java para demonstrar o uso da instrução switch case.
// É um programa que imprime o nome do mês de acordo com o número do mês.
public class ExemploSwitchMes {
    public static void main(String[] args) {
        // Especificando o número do mês
        int mes = 7;
        String nomeMes = switch (mes) {
            // casos dentro do bloco switch
            case 1 -> "1 - Janeiro";
            case 2 -> "2 - Fevereiro";
            case 3 -> "3 - Março";
            case 4 -> "4 - Abril";
            case 5 -> "5 - Maio";
            case 6 -> "6 - Junho";
            case 7 -> "7 - Julho";
            case 8 -> "8 - Agosto";
            case 9 -> "9 - Setembro";
            case 10 -> "10 - Outubro";
            case 11 -> "11 - Novembro";
            case 12 -> "12 - Dezembro";
            default -> {
                System.out.println("Mês Inválido!");
                yield "";
            }
        };
        // Imprimindo o mês do número dado
        System.out.println(nomeMes);
    }
}
```

> if-else encadeado



```java
// Um programa Java para demonstrar o uso da instrução if-else aninhada.
// É um programa para verificar se um número é maior que 10 e, se for, verificar se é par ou ímpar.
public class ExemploIfDentroDeIf {
    public static void main(String[] args) {
        int numero = 15;

        if (numero > 10) {
            System.out.println("O número é maior que 10.");

            if (numero % 2 == 0) {
                System.out.println("Além disso, o número é par.");
            } else {
                System.out.println("Além disso, o número é ímpar.");
            }
        } else {
            System.out.println("O número não é maior que 10.");
        }
    }
}
```

---

# Bora Praticar!

1. Verifique se um número é positivo.
2. Verifique se uma pessoa é maior de idade.
3. Verifique se uma pessoa é maior de idade. (Utilize o Operador Ternário)
4. Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!"
5. Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.  
6. Determine o maior de três números. Se algum dos números for negativo, exiba: "Valor não permitido."

> **Continue praticando:** https://wiki.python.org.br/EstruturaDeDecisao

## Referências

[1] UFMA - Universidade Federal do Maranhão. "Tipos e Operadores." Disponível em: http://www.deinf.ufma.br/~mario/grad/poo/aulas/TiposOperadores.pdf.

[2] TSimpoo. "Java - Conceitos Básicos." Disponível em: https://tsimpoo.wordpress.com/2014/08/12/.

[3] SlidePlayer. "Estruturas de Decisão em Java." Disponível em: https://slideplayer.com.br/slide/355761/.

[4] WikiBooks. "Java/Operadores." Disponível em: https://pt.wikibooks.org/wiki/Java/Operadores.

[5] TreinaWeb. "Estruturas Condicionais e Estruturas de Repetição em Java." Disponível em: https://www.treinaweb.com.br/blog/estruturas-condicionais-e-estruturas-de-repeticao-em-java.

## Autor

<a href="https://www.linkedin.com/in/cami-la/">
 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/64323124?v=4" width="100px;" alt=""/></a>
<br>

Feito com ❤️ por <a href="https://www.instagram.com/camimi_la/" title="Instagram">Cami-la </a> 👋🏽 