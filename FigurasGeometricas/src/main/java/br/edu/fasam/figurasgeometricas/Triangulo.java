package br.edu.fasam.figurasgeometricas;

/**
 *
 * @author Otávio
 */
public class Triangulo {
    private Integer lado1;
    private Integer lado2;
    private Integer lado3;
    
    public Integer calcularPerimetro() {
        return lado1+lado2+lado3;        
    }
    public Double calcularArea() {
        Float p = (float) this.calcularPerimetro() / 2;
        return Math.sqrt(p*(p-lado1)*(p-lado2)*(p-lado3));
        
    }
}
