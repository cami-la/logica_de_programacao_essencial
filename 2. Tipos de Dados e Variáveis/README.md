# Tipos de Dados e Variáveis Java

Nesta aula abordaremos os fundamentos cruciais da linguagem Java, começando pelos tipos primitivos de dados para armazenar informações.
Exploraremos variáveis e constantes para manipulação flexível de dados, entenderemos palavras reservadas essenciais para criar estruturas lógicas e focaremos no método main() como ponto de partida para a execução. Além disso, aprenderemos a exibir mensagens e resultados usando System.out.println(), e finalmente, descobriremos como interagir dinamicamente com os usuários ao receber entradas do teclado através da classe Scanner, proporcionando uma base sólida para construir programas Java com confiança.


## Tipos Primitivos de Dados Padrões do Java

- Diferentes tipos de dados são utilizados para armazenar informações em um programa. 
- Cada tipo de dado possui um tamanho específico em termos de bytes, que determina a quantidade de espaço que ele ocupa na memória.
-  Esses tamanhos são importantes para otimizar o uso da memória e garantir que os valores sejam armazenados de forma adequada. 
  
Abaixo estão os tipos de dados primitivos em Java e seus respectivos tamanhos em bytes:

<p align="center"> <img src="https://2.bp.blogspot.com/-dHvGtjOn-Po/V-047MUt9JI/AAAAAAAABH8/YfOXOaH3Ol0Wsn3XYycKPqlgDiRWxWOcwCLcB/s1600/primitivos.png"  
width="600" height="400" alt="Tipos de Dados Primitivos Java"/></p>
<p align="center"><a href="http://b-one-informatica.blogspot.com/2016/10/tipos-de-datos-primitivos-java.html">Figura 1: Tipos de Dados Primitivos Java</a></p>


## Variável e Constante

- Uma variável é uma estrutura que permite armazenar dados na memória durante a execução do programa, para processamento de informações. Como o nome sugere, pode ser modificada.

```java
//Formas de declarar uma variável em Java

String nome = "Cami";

var nome = "Cami"; //A partir do Java 10
```

- O Java não possui formalmente o conceito de constantes, assim como acontece em outras linguagens. Isso tem relação com a maneira como o Java lida com a referência com as variáveis, as definindo entre value-types e reference-types.
- A maneira mais comum para “simular” constantes no Java é através da combinação das palavras-chave `static e final`.

```java
//Forma de declarar uma "constante" em java
static final String NOME = "Camila";
```

## Palavras Reservadas 

- Palavras reservadas do java, ou keywords (palavras-chave), são palavras que possuem significado específico no código.
- Os programadores devem se atentar a essas palavras para que não as usem para qualquer outra coisa além daquilo que elas se propõem a fazer.
  
<p align="center"> <img src="https://www.di.fc.ul.pt/~in/PCOlivro/PCOonline/Figuras/Reservadas.jpeg" alt="Simbolos de um fluxograma de processos"/></p>
<p align="center"><a href="http://www.linhadecodigo.com.br/artigo/83/as-52-palavras-reservadas-do-java.aspx">Figura 2: Palavras Reservadas do Java</a></p>

- A convenção de nomenclatura em Java é uma regra a seguir quando se decide nomear seus identificadores, como classes, pacotes, variáveis, constantes, métodos, etc.
- Convenção não é regra. Essas convenções são sugeridas por várias comunidades Java, como Oracle e Eclipse.

## Método `main()`

- O método `main()` ele atua como o ponto de entrada para a execução do programa. 
- Quando você executa um programa Java, o sistema procura pelo método `main()` e começa a executar o código a partir desse ponto.

```java
public class MeuPrograma {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}

// Saída no console
Olá, mundo!
```

## Saída de Dados no Java 

- É uma ferramenta essencial para depuração e comunicação com o usuário em programas Java. 
- Ele é frequentemente usado para exibir mensagens, valores de variáveis ​​e resultados de cálculos durante a execução do programa.

```java
System.out.println()
```

## Entrada de Dados no Java

- O `Scanner` permite que você leia diversos tipos de dados da entrada padrão (geralmente o teclado). 
- Aqui está um exemplo de como usar a classe `Scanner` para ler diferentes tipos de dados:

```java
import java.util.Scanner;

public class EntradaDadosComScanner {
    public static void main(String[] args) {
        // Criar uma instância de Scanner para ler da entrada padrão (teclado)
        Scanner scanner = new Scanner(System.in);

        // Ler um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();
        System.out.println("Você digitou o número inteiro: " + numeroInteiro);

        // Ler um número de ponto flutuante
        System.out.print("Digite um número de ponto flutuante: ");
        double numeroDouble = scanner.nextDouble();
        System.out.println("Você digitou o número de ponto flutuante: " + numeroDouble);

        // Ler uma linha de texto
        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.print("Digite uma linha de texto: ");
        String linhaTexto = scanner.nextLine();
        System.out.println("Você digitou a linha de texto: " + linhaTexto);

        // Fechar o Scanner para liberar recursos
        scanner.close();
    }
}
```
---

# Bora Praticar!

1. Faça um Programa que mostre a mensagem "Alo mundo". 
2. Faça um Programa que peça um o nome do usuário e então mostre a mensagem "Seja bem-vindo(a) [nome do usuário]".  
3. Faça um Programa que peça dois números inteiros e imprima a soma. 
4. Faça um Programa peça: _Nome de um produto, Valor unitário deste produto e Quantidade do produto._<br>
Ao final, imprima a frase: "O Produto [nome do produto] com o valor unitário R$ [valor unitário] com a quantidade [quantidade do produto] custará o total de R$ [valor total do produto]."
5. Crie um programa que converta centímetros para metros. O usuário deve informar a medida em centímetros, e o programa deve exibir a correspondente medida em metros. _(Lembre-se de que 1 metro é igual a 100 centímetros.)_

> **Continue praticando:** https://wiki.python.org.br/EstruturaSequencial

## Referências

[1] "Os Tipos Primitivos da Linguagem Java." Gran Cursos Online. Disponível em: https://blog.grancursosonline.com.br/os-tipos-primitivos-da-linguagem-java/.

[2] "Tipos Primitivos." Mapas de Concursos de TI. Disponível em: http://mapaseconcursosdeti.blogspot.com/2012/12/tipos-primitivos.html.

[3] "As 52 Palavras Reservadas do Java." Linha de Código. Disponível em: http://www.linhadecodigo.com.br/artigo/83/as-52-palavras-reservadas-do-java.aspx.

[4] "Estrutura Sequencial." Python Brasil. Disponível em: https://wiki.python.org.br/EstruturaSequencial.


## Autor

<a href="https://www.linkedin.com/in/cami-la/">
 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/64323124?v=4" width="100px;" alt=""/></a>
<br>

Feito com ❤️ por <a href="https://www.instagram.com/camimi_la/" title="Instagram">Cami-la </a> 👋🏽 