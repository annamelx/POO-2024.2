package Turismo;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class SistemaAtrativosMapTest {

    @Test
    public void CadastroAtrativoTest()throws AtrativoJaExisteException,AtrativoNaoExisteException{
       AtrativoTuristico  sistemaAtrativo = new AtrativoTuristico();

        int ContaPraias = sistemaAtrativo.contaAtrativosDoTipo(TipoAtrativo.PRAIA);
        assertEquals(1,ContaPraias);

        int ContaMuseu = sistemaAtrativo.contaAtrativosDoTipo(TipoAtrativo.MUSEU);
        assertTrue(ContaMuseu == 0);
        //ou
        assertEquals(0,ContaMuseu);


    }


}