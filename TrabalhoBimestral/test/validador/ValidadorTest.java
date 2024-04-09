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
         assertEquals("A entrada deve conter algum valor", false,  Validador.somenteNumeros(null));
     }
    
    @Test 
    public void testSomenteNumerosVazio() {
         assertEquals("A entrada deve conter algum valor", false,  Validador.somenteNumeros(" "));
     }
    
    @Test 
    public void testSomenteNumeros() {
         assertEquals("Teste com numeros", true,  Validador.somenteNumeros("1234567890"));
     }
    
    @Test 
    public void testSomenteNumerosEspacoIni() {
         assertEquals("Teste com numeros e espaços no começo", false,  Validador.somenteNumeros(" 123"));
     }
    
    @Test 
    public void testSomenteNumerosEspacoMeio() {
         assertEquals("Não são aceitos espaços em branco na entrada de numero", false,  Validador.somenteNumeros("1 23"));
     }
    
    @Test 
    public void testSomenteNumerosEspacoFim() {
         assertEquals("Teste com numeros e espaços no fim", false,  Validador.somenteNumeros("123 "));
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
        assertEquals("", true,  Validador.cartaoValido("4532354150316859"));
    }
    
    @Test
    public void testCartaoValidoEspaco() {
        assertEquals("", false,  Validador.cartaoValido("5491 8446 0003 6491"));
    }
    
    @Test
    public void testCartaoValidoigual15() {
        assertEquals("", true,  Validador.cartaoValido("201486674868649"));
    }
    
    @Test
    public void testCartaoValidoMenor15() {
        assertEquals("", true,  Validador.cartaoValido("30388785563092"));
    }
    
    //---------------------------------------------------//

    /**
     * Test of cpfValido method, of class Validador.
     */
    @Test
    public void testCpfValidoSequencia() {
        assertEquals("Numeros sequenciais não são aceitos", false,  Validador.cpfValido("11111111111"));
    }
    
    @Test
    public void testCpfValido() {
        assertEquals("", true,  Validador.cpfValido("52817271092"));
    }
    
    @Test
    public void testCpfCaractere() {
        assertEquals("Não são aceitos caractéres especiais na entrada", false,  Validador.cpfValido("607.076.130-86"));
    }
    
    @Test
    public void testCpfEspaco() {
        assertEquals("Não são aceitos espaços em branco na entrada", false,  Validador.cpfValido(" 71241503028 "));
    }
    
    @Test
    public void testCpfinvalido() {
        assertEquals("Este não é um cpf valido", false,  Validador.cpfValido("71241503027"));
    }

    //---------------------------------------------------//
    
    /**
     * Test of cnpjValido method, of class Validador.
     */
    @Test
    public void testCnpjValido() {
        assertEquals("", true,  Validador.cnpjValido("20568853000131"));
    }
    
    @Test
    public void testCnpjValidoCaractere() {
        assertEquals("Não são aceitos caractéres especiais na entrada", false,  Validador.cnpjValido("47.110.478/0001-38"));
    }
    
    @Test
    public void testCnpjValidoEspaco() {
        assertEquals("Não são aceitos caractéres especiais na entrada", false,  Validador.cnpjValido(" 98831876000184 "));
    }
    
}
