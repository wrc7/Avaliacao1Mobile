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