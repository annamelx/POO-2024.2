package anna.dcx.ufpb.br.LojaDeRoupa;

import anna.dcx.ufpb.br.lojaDeRoupa.Roupa;
import anna.dcx.ufpb.br.lojaDeRoupa.RoupaJaExisteException;
import anna.dcx.ufpb.br.lojaDeRoupa.SistemaLojaRoupasPOO;
import anna.dcx.ufpb.br.lojaDeRoupa.Tamanho;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaLojaRoupasPOOTest {

    @Test
    public void testaCadastroDeRoupa() throws RoupaJaExisteException {
        SistemaLojaRoupasPOO sistema = new SistemaLojaRoupasPOO();
        sistema.cadastraRoupa("123","Calça Jeans escura", Tamanho.M, 30);
       Roupa roupa = sistema.pesquisaRoupa("123");
       assertEquals("123",roupa.getCodigo());
       assertEquals("Calça Jeans escura" , roupa.getDescricao());
       assertEquals(Tamanho.M,roupa.getTamanho());
       assertTrue(roupa.getQuantidade() == 30);
    }

}