# Bibliotecas

- As bibliotecas padrão são conjuntos de funcionalidades internas à linguagem que podem ser utilizadas para estender suas capacidades. 
- Além das bibliotecas padrão, existem bibliotecas de terceiros disponíveis que podem ser adicionadas ao seu projeto para expandir ainda mais as funcionalidades da linguagem.
- No entanto, essas bibliotecas não são carregadas automaticamente, é necessário importá-las explicitamente para utilizá-las.
- Ao utilizar bibliotecas, você pode aproveitar o trabalho de outros desenvolvedores e economizar tempo e esforço, pois não precisa escrever tudo do zero. 

<p align="center">
<img src="https://s1.o7planning.com/en/11911/images/20477133.png" /><br>
<a href="https://o7planning.org/11911/configuring-eclipse-to-use-the-jdk-instead-of-jre">Figura 1. Estrutura Simplificada JDK</a></p>


### Classes Utilitárias Java

- **String (java.lang.String)**: em Java é usada para representar sequências de caracteres. Ela oferece diversos métodos para manipulação, concatenação, busca, comparação e formatação de strings.

```java
String nome = "João";
String sobrenome = "Silva";
String nomeCompleto = nome + " " + sobrenome;
int tamanho = nomeCompleto.length();
boolean contem = nomeCompleto.contains("Silva");
```

- **Math (java.lang.Math)**: contém métodos estáticos para operações matemáticas, como funções trigonométricas, exponenciais, logarítmicas, arredondamento, entre outras.

```java
double raizQuadrada = Math.sqrt(25);
double seno = Math.sin(Math.PI / 4);
int arredondado = Math.round(7.8);
```

- **Random (java.util.Random)**: é usada para gerar números aleatórios. Ela permite criar instâncias para geração de sequências de números aleatórios com diferentes distribuições.

```java
Random random = new Random();
int numeroAleatorio = random.nextInt(100); // Gera número entre 0 e 99
double numeroDecimal = random.nextDouble(); // Gera número decimal entre 0.0 e 1.0
```

- **LocalDate (java.time.LocalDate)**: representa uma data (ano, mês e dia) sem informações de horário.

```java
LocalDate dataAtual = LocalDate.now();
int ano = dataAtual.getYear();
int mes = dataAtual.getMonthValue();
int dia = dataAtual.getDayOfMonth();
```

- **Scanner (java.util.Scanner)**: Uma classe usada para ler entrada a partir do teclado ou de outras fontes, como arquivos. Ela oferece métodos para analisar diferentes tipos de dados.

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Digite um número inteiro: ");
int numero = scanner.nextInt();

System.out.println("O dobro do número é: " + (numero * 2));
```

----

# Bora Praticar!

1. **Contagem de Caracteres**: Desenvolva um programa que conta quantos caracteres uma string fornecida pelo usuário possui.
2. **Cálculo de Média**: Crie um programa que solicite ao usuário três números e calcule a média aritmética entre eles usando a classe Math.
3. **Jogo de Adivinhação**: Crie um jogo em que o programa gera um número aleatório entre 1 e 100, e o jogador precisa adivinhar qual é o número. O programa deve dar dicas se o número é maior ou menor. 
4. **Verificação de Ano Bissexto**: Crie um programa que determine se um ano fornecido pelo usuário é bissexto ou não.
5. **Dia da Semana de uma Data**: Desenvolva um programa que determine o dia da semana em que cai uma data fornecida pelo usuário.

## Referências

[1] o7planning.org. "Configurando o Eclipse para usar o JDK em vez do JRE". Disponível em: https://o7planning.org/11911/configuring-eclipse-to-use-the-jdk-instead-of-jre.

[2] Documentação do Egua. "Bibliotecas". Disponível em: https://egua.dev/docs/egua/bibliotecas.html.


## Autor

<a href="https://www.linkedin.com/in/cami-la/">
 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/64323124?v=4" width="100px;" alt=""/></a>
<br>

Feito com ❤️ por <a href="https://www.instagram.com/camimi_la/" title="Instagram">Cami-la </a> 👋🏽 