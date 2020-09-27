# Avaliação 1 - Desenvolvimento para Dispositivos Móveis
## Engenharia de Software - Católica SC - 28 de setembro de 2020
### Prof. Rodrigo Habib Gregori

Siga as instruções contidas no README, para a execução da sua prova.

## Instruções gerais

1. Faça um _fork_ deste repositório, para sua conta do github.
1. Faça um _clone_ do repositório para sua máquina.
1. Leia as questões com atenção. Para a maioria das respostas, basta você ler com calma e transformar o texto em código java.
1. Responda corretamente às questões. A maioria das questões é de programação. Você não precisa compilar ou executar o código. Apenas complete o código, conforme o solicitado. Os arquivos terão seus nomes indicados nas questões e, também estarão armazenados em pastas, com o número das questões.
1. As questões não estão difíceis **não copie do seu colega**. Repositórios serão comparados arquivo por arquivo. Provas iguais serão **desconsideradas**.
1. As questões estão especificadas abaixo, mas também estarão nos respectivos arquivos.

## Prova

### Questão 01

Arquivo: [Circulo](https://github.com/gregori/Avaliacao1Mobile/blob/master/Quest%C3%A3o%2001/Circulo.java)

Observe o código da classe `Circulo` abaixo:

```java
/**
 * Uma classe que mantém as informações sobre um círculo.
 */
public class Circulo
{
    // Os campos.
    private double raio = 1.0;
    private String cor = "vermelho";

    // Construtores
    public Circulo() { }
    public Circulo(double raio) {
        this.raio = raio;
    }
    
    // Métodos de acesso
    public double getRaio() {
        return raio;
    }
}
```

#### (a) - 1 ponto
Adicione à classe um _construtor_ que permita criar um `Circulo` com dois parâmetros: um `double` para o `raio` e um `String` para `cor`. Use a assinatura abaixo como base:
```java
public Circulo(double raio, String cor)
```

#### (b) - 2 pontos
Utilizando o conceito de _composição_, crie uma classe `Cilindro` que tenha um atributo `base` de tipo `Circulo`, e um atributo `altura` de tipo `double`. Crie um _construtor_ para essa classe, que não receba parâmetros. Este construtor deve configurar o valor de `altura` para `1.0` e deve inicializar a `base` (criar o objeto).

Para esta questão, use o arquivo: [Cilindro](https://github.com/gregori/Avaliacao1Mobile/blob/master/Quest%C3%A3o%2001/Cilindro.java).

### (c) - 1 ponto
Um aluno escreveu o seguinte código para a classe `Circulo`:
```java
@Override
public String toString() {
    return "Circulo [raio=" + raio + ", cor=" + cor + "]";
}
```

O que a palavra `@Override` indica? Por que ela foi colocada neste método da classe?

Esta questão pode ser respondida no mesmo arquivo [Circulo](https://github.com/gregori/Avaliacao1Mobile/blob/master/Quest%C3%A3o%2001/Circulo.java), como comentário

### Questão 02
Observe o código a seguir:
```java
public interface Geometria {
    double getPerimetro();
    double getArea();
}

public interface Redimensionavel {
    void redimensionar(int percentual);
}
```

#### (a) - 1,5 ponto
Arquivo: [Quadrado](https://github.com/gregori/Avaliacao1Mobile/blob/master/Quest%C3%A3o%2002/Quadrado.java)

Implemente uma classe `Quadrado`, que possui um atributo `lado` de tipo `double`. Implemente um construtor que preenche o atributo `lado`. Faça com que essa classe __implemente__ a interface `Geometria`.

#### (b) - 1,5 ponto
Arquivo: [QuadradoRedimensionavel](https://github.com/gregori/Avaliacao1Mobile/blob/master/Quest%C3%A3o%2002/QuadradoRedimensionavel.java)

Implemente uma classe `QuadradoRedimensionavel`, que é _subclasse_ de `Quadrado` e implementa a interface `Redimensionavel`. Essa classe deve _implementar_  um construtor que recebe o valor de `lado` e o transmite para o construtor da __superclasse__.


### Questão 03
Observe o diagrama abaixo, que modela classes para um jogo de truco.

![Classes de baralho](http://yuml.me/9289a384.jpg "Classes Carta e Baralho")

#### (a) - 1,5 ponto
Implemente uma classe `Jogador` que contenha os atributos: `mao`, do tipo `Carta[]` (um vetor de cartas) e `indiceMao` do tipo `int`. A `mao` deve ter tamanho `3`. O `indiceMao` servirá para indicar qual carta da mão foi selecionada. Essa classe deve ter um construtor padrão (sem receber nenhum parâmetro) que inicializa a `mao` (inicializa o vetor) e inicializa o valor do `indiceMao` com `0`. O jogador também deve ter um método `recebeCarta(Carta c)` que insere uma carta no vetor `mao`, na posição `indiceMao`. Você deve incrementar `indiceMao` após receber a carta. 

Arquivo [Jogador](https://github.com/gregori/Avaliacao1Mobile/blob/master/Quest%C3%A3o%2003/Jogador.java).

#### (b) - 1,5 ponto
Implemente uma classe `Truco` que contém como atributos dois `Jogador`es, um `Baralho`, uma `cartaVirada` do tipo `Carta`. Sua classe deve ter um construtor padrão que inicializa cada um desses atributos (basicamente faz `new` neles). Deve ter um método privado `embaralharCartas()` que chama o método `embaralha()` do `Baralho`, um método privado `distribuirMaos()`, que deve distribuir três cartas do baralho para cada jogador (lembre-se do método `receberCarta` de `Jogador`). Você também deve implementar um método `inicializaManilha()`, que põe uma carta na meso (distribui uma carta do baralho e atribui a `cartaVirada`). Esses métodos que você implementar, vão complementar a classe truco. Para sua referência, segue o método `jogar()`, que implementa a lógica básica do início do jogo:

Arquivo [Truco](https://github.com/gregori/Avaliacao1Mobile/blob/master/Quest%C3%A3o%2003/Truco.java).

```java
public void jogar() {
    embaralhaCartas();
    distribuiMaos();
    inicializaManilha();
    imprimeMesa();
}
```
