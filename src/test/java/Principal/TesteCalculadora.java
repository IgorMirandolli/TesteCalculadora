package Principal;

import Calculadora.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TesteCalculadora {
    
  
    @Test
    void testGetSoma() {
        System.out.println("getSoma");
        Calculadora instance = new Calculadora(4.0,2.0);
        double expResult = 6.0;
        double result = instance.getSoma();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getDiferenca method, of class Calculadora.
     */
    @Test
    public void testGetDiferenca() {
        System.out.println("getDiferenca");
        Calculadora instance = new Calculadora(4.0,2.0);
        double expResult = 2.0;
        double result = instance.getDiferenca();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getProduto method, of class Calculadora.
     */
    @Test
    public void testGetProduto() {
        System.out.println("getProduto");
        Calculadora instance = new Calculadora(4.0,2.0);
        double expResult = 8.0;
        double result = instance.getProduto();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getQuociente method, of class Calculadora.
     */
    @Test
    public void testGetQuociente() {
        System.out.println("getQuociente");
        Calculadora instance = new Calculadora(4.0,2.0);
        double expResult = 2.0;
        double result = instance.getQuociente();
        assertEquals(expResult, result, 0);
    }
    
}
