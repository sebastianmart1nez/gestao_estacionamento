import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SistemaLogin {

    public boolean autenticar(String utilizador, String senha){
        if (utilizador==null || senha==null){
            return false;
        }
        return utilizador.equals("admin") && senha.equals("1234");
    }

    public static class SistemaLoginTeste {

        //Baby step

        @Test
        public void deveAutenticarUtilizadorValido(){
            SistemaLogin login = new SistemaLogin();

            boolean resultado = login.autenticar("admin","Admin@2026");
            assertTrue(resultado);
        }
        @Test
        public void deveRejeitarUtilizadorInvalido(){
            SistemaLogin login = new SistemaLogin();

            boolean resultado = login.autenticar("user", "0000");
            assertFalse(resultado);
        }


    }
}
