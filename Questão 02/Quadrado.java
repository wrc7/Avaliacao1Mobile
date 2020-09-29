/* (a)
Implemente uma classe `Quadrado`, que possui um atributo 
`lado` de tipo `double`. Implemente um construtor que preenche 
o atributo `lado`. Faça com que essa classe __implemente__ a 
interface `Geometria`.
*/
public class Quadrado implements Geometria{
    private double lado;
 
    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double getPerimetro(){
        int perimetro = 0;
        perimetro = lado * 4;
        return perimetro;
    }

    @Override
    public double getArea(){
        int area = 0;
        area = lado * lado;
        return area;
    }
}
