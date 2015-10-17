package br.edu.fasam.figurasgeometricas;

/**
 * Classe que representa um quadrado
 * @author Otávio
 */
public class Quadrado {
    private Integer area;
    private Integer perimetro;
    
    private Integer lado;

    public Quadrado(Integer lado) {
        this.lado = lado;
    }   

    /**
     * Retorna a area do quadrado
     * @return Valor da area do quadrado
     */
    public Integer getArea() {
        return area;
    }
    /**
     * Preenche o valor da area do quadrado
     * @param area  Valor da area do quadrado
     */
    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Integer perimetro) {
        this.perimetro = perimetro;
    }

    public Integer getLado() {
        return lado;
    }

    public Integer calcularArea() {
        if(area == null || area == 0) {
            area = lado*lado;
        }
        return area;
    }
    
    public Integer calcularPerimetro() {
        return 4*lado;
    }
           
}
