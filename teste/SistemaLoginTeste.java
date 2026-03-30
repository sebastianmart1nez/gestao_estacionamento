import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SistemaLoginTeste {

    //Baby step

    @Test
    public void deveAutenticarUtilizadorValido(){
        SistemaLogin login = new SistemaLogin();

        boolean resultado = login.autenticar("admin","1234");
        assertTrue(resultado);
    }
    @Test
    public void deveRejeitarUtilizadorInvalido(){
        SistemaLogin login = new SistemaLogin();

        boolean resultado = login.autenticar("user", "0000"); 
        assertFalse(resultado);
    }


}
