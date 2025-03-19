package anna.dcx.ufpb.br.lojaDeRoupa;

import java.util.List;

public interface SistemaLojaRoupas {
    public List<Roupa> pesquisaRoupasPorTamanho(Tamanho tamanhoRoupa);
    public List<Roupa> pesquisaRoupasComDescricaoComecandoCom(String prefixoDescricao);
    public Tamanho consultaTamanhoDeRoupa(String codigoRoupa)throws RoupaInexistenteException;
    public void cadastraRoupa(String codigoRoupa,String descricao,Tamanho tamanho,int quantidade)throws RoupaJaExisteException;
    public void alteraQuantidadeRoupaNoEstoque(String codigoRoupa,int novaQuantidade)throws RoupaInexistenteException;
    public int pesquisarQuantidadeDeRoupaNoEstoque(String codigoRoupa) throws RoupaInexistenteException;


}
