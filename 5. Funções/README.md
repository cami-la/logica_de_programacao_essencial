# Funções/Métodos

Nesta aula examinamos os principais aspectos relacionados a funções (métodos) em Java. Compreender esses conceitos é fundamental para escrever código eficiente, modular e de fácil manutenção em aplicações Java.

<p align="center">
<img src="https://static.javatpoint.com/core/images/method-in-java.png" /><br>
<a href="https://www.javatpoint.com/pt/m%C3%A9todo-em-java">Figura 1. Declaração de um método Java</a></p>

Um método em Java é composto por vários elementos:

1. **Especificadores de Acesso**: Definem a visibilidade e a acessibilidade de um método em diferentes partes do código. Em Java, temos quatro tipos de especificadores de acesso:

   - _public_: Torna o método acessível a todas as classes, permitindo seu uso em todo o aplicativo.
   - _private_: Restringe o acesso do método somente à classe onde está definido, encapsulando sua funcionalidade.
   - _protected_: Permite o acesso ao método no mesmo pacote e em subclasses de pacotes diferentes.
   - _default_ (padrão): Quando nenhum especificador é fornecido, o método é acessível apenas no mesmo pacote.

<br>

1. **Tipo de Retorno**: Cada método em Java possui um tipo de retorno que define o tipo de dado que o método irá fornecer como saída. Isso pode variar de tipos primitivos a objetos complexos ou até mesmo ausência de retorno, indicado pelo uso da palavra-chave `void.

2. **Nome do Método**: Um identificador exclusivo que define o método e sua funcionalidade. O nome deve refletir claramente o propósito do método.

3. **Lista de Parâmetros**: Os parâmetros fornecem dados de entrada para o método. Eles são especificados por tipo e nome, permitindo que o método trabalhe com informações externas. Se o método não tiver parâmetro, deixe os parênteses em branco.

4. **Assinatura do método**: Engloba seu nome e a lista de parâmetros que ele espera receber. A combinação única de nome e tipos de parâmetros constitui a assinatura, permitindo a diferenciação entre métodos similares.

5. **Corpo do Método**: Contém a lógica do método, onde as ações desejadas são implementadas. 
   
    - É delimitado por um par de chaves e pode conter declarações, operações e fluxos de controle.
    - Instrução de Retorno: Se o método tiver um tipo de retorno diferente de void, ele deve conter uma instrução return que fornece o valor resultante.
    - Exceções Lançadas: Métodos podem lançar exceções para indicar situações excepcionais durante sua execução.

Observe a classe `Calculadora` que inicialmente contém um método chamado `realizarOperacao` que executa diferentes tipos de operações matemáticas. 

```java
public class Calculadora {

    // Método para realizar diferentes operações matemáticas
    public double realizarOperacao(String operacao, double num1, double num2) {
        double resultado = 0;

        switch (operacao) {
            case "soma" -> resultado = num1 + num2;
            case "subtracao" -> resultado = num1 - num2;
            case "multiplicacao" -> resultado = num1 * num2;
            case "divisao" -> resultado = num1 / num2;
            default -> System.out.println("Operação inválida!");
        }

        return resultado;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultadoSoma = calculadora.realizarOperacao("soma", 10, 5);
        double resultadoSubtracao = calculadora.realizarOperacao("subtracao", 15, 7);
        
        System.out.println("Resultado da Soma: " + resultadoSoma);
        System.out.println("Resultado da Subtração: " + resultadoSubtracao);
    }
}
```

Refatorando o método `realizarOperacao` para separar as funcionalidades em métodos específicos:

```java
public class Calculadora {

    // Método para realizar a soma
    public double somar(double num1, double num2) {
        return num1 + num2;
    }

    // Método para realizar a subtração
    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    // Método para realizar a multiplicação
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    // Método para realizar a divisão
    public double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Divisão por zero não é permitida!");
        }
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultadoSoma = calculadora.somar(10, 5);
        double resultadoSubtracao = calculadora.subtrair(15, 7);
        
        System.out.println("Resultado da Soma: " + resultadoSoma);
        System.out.println("Resultado da Subtração: " + resultadoSubtracao);
    }
}
```

----

# Bora Praticar!

1. **Verificação de Sinal de Número**: Faça um programa com uma função que necessite de um argumento. A função retorna o caractere 'P' se o argumento for positivo, e 'N' se o argumento for zero ou negativo.
2. **Calculadora de IMC**: Implemente uma função que calcule o Índice de Massa Corporal (IMC) com base no peso e altura fornecidos.
3. **Conversor de Temperatura**: Crie funções para converter temperaturas de Celsius para Fahrenheit e vice-versa.
4. **Conversor de Moedas**: Desenvolva funções para converter valores entre diferentes moedas, como Dólar para Real e Real para Dólar, por exemplo.
5. **Contagem de Vogais e Consoantes**: Crie uma função que receba uma string como entrada e conte o número de vogais e consoantes presentes nela.

> **Continue praticando:** https://wiki.python.org.br/ExerciciosFuncoes<br>

## Referências

[1] JavaTpoint. "Método em Java". Disponível em: https://www.javatpoint.com/pt/m%C3%A9todo-em-java.


## Autor

<a href="https://www.linkedin.com/in/cami-la/">
 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/64323124?v=4" width="100px;" alt=""/></a>
<br>

Feito com ❤️ por <a href="https://www.instagram.com/camimi_la/" title="Instagram">Cami-la </a> 👋🏽 