package validador;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 023145
 */
public class ValidadorTest {
    
    public ValidadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of somenteNumeros method, of class Validador.
     */
    @Test 
    public void testSomenteNumerosNull() {
         assertEquals("A entrada deve conter algum valor", false,  Validador.somenteNumeros(""));
     }
    
    @Test 
    public void testSomenteNumeros() {
         assertEquals("Teste com numeros", true,  Validador.somenteNumeros("1234567890"));
     }
    
    @Test 
    public void testSomenteNumerosEspacoIni() {
         assertEquals("Teste com numeros e espaços no começo", true,  Validador.somenteNumeros(" 123"));
     }
    
    @Test 
    public void testSomenteNumerosEspacoMeio() {
         assertEquals("Não são aceitos espaços em branco na entrada de numero", false,  Validador.somenteNumeros("1 23"));
     }
    
    @Test 
    public void testSomenteNumerosEspacoFim() {
         assertEquals("Teste com numeros e espaços no fim", true,  Validador.somenteNumeros(" 123 "));
     }
    
    @Test 
    public void testSomenteNumerosEspaco() {
         assertEquals("Não são aceitos espaços em branco na entrada de numero", false,  Validador.somenteNumeros(" 1 2 3 "));
     }
    
    @Test 
    public void testSomenteNumerosChar() {
         assertEquals("Não são aceitos caracteres especiais", false,  Validador.somenteNumeros("1.2-3"));
     }
    //---------------------------------------------------//

    /**
     * Test of cartaoValido method, of class Validador.
     */
    @Test
    public void testCartaoValido() {
        assertEquals("", true,  Validador.cartaoValido("5491844600036491"));
    }
    
    @Test
    public void testCartaoValidoEspaco() {
        assertEquals("", true,  Validador.cartaoValido("5491 8446 0003 6491"));
    }
    
    @Test
    public void testCartaoValidoigual15() {
        assertEquals("", true,  Validador.cartaoValido("201486674868649"));
    }
    
    @Test
    public void testCartaoValidoMenor15() {
        assertEquals("", true,  Validador.cartaoValido("30207856991398"));
    }

    /**
     * Test of cpfValido method, of class Validador.
     */
    @Test
    public void testCpfValido() {
        System.out.println("cpfValido");
        String cpf = "11111111111";
        boolean expResult = false;
        boolean result = Validador.cpfValido(cpf);
        assertEquals(expResult, result);
    }

    /**
     * Test of cnpjValido method, of class Validador.
     */
    @Test
    public void testCnpjValido() {
        System.out.println("cnpjValido");
        String cnpj = "";
        boolean expResult = false;
        boolean result = Validador.cnpjValido(cnpj);
        assertEquals(expResult, result);
    }
    
}
