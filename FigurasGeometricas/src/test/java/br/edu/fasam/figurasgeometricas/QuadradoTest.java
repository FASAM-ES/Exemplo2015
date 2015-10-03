package br.edu.fasam.figurasgeometricas;

import junit.framework.TestCase;

/**
 *
 * @author Otávio
 */
public class QuadradoTest extends TestCase {
    
    public QuadradoTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testCalcularArea() {
        Quadrado quadrado = new Quadrado(4);
        assertEquals(16, (int) quadrado.calcularArea());
        quadrado = new Quadrado(5);
        assertEquals(25, (int) quadrado.calcularArea());
    }
    
    public void testCalcularPeimetro() {
        Quadrado quadrado = new Quadrado(4);
        assertEquals(16, (int) quadrado.calcularPerimetro());
        quadrado = new Quadrado(5);
        assertEquals(20, (int) quadrado.calcularPerimetro());
    }
}
