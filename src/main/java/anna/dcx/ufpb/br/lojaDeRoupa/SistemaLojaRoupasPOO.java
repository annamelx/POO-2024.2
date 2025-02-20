package anna.dcx.ufpb.br.lojaDeRoupa;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SistemaLojaRoupasPOO implements SistemaLojaRoupas{
    private Map<String,Roupa> roupasMap;

    public SistemaLojaRoupasPOO(Map<String, Roupa> roupasMap) {
        this.roupasMap = new HashMap<>();
    }

    @Override
    public List<Roupa> pesquisaRoupasPorTamanho(Tamanho tamanhoRoupa) {
        List<Roupa> listaTamanhoRoupa = new LinkedList<>();
        //TODO

        return List.of();
    }

    @Override
    public List<Roupa> pesquisaRoupasComDescricaoComecandoCom(String prefixoDescricao) {
        //TODO
        return List.of();
    }

    @Override
    public Tamanho consultaTamanhoDeRoupa(String codigoRoupa) throws RoupaInexistenteException {
        //TODO
        return null;
    }

    @Override
    public void cadastraRoupa (String codigoRoupa, String descricao, Tamanho tamanho, int quantidade) throws RoupaJaExisteException {
      if(this.roupasMap.containsKey(codigoRoupa)){
          throw new RoupaJaExisteException("Roupa ja cadastrada:" +codigoRoupa);
      }else{
          Roupa roupa = new Roupa(codigoRoupa,descricao, quantidade, tamanho);
          this.roupasMap.put(codigoRoupa,roupa);
      }
    }

    @Override
    public void alteraQuantidadeRoupaNoEstoque(String codigoRoupa, int novaQuantidade) throws RoupaInexistenteException {
        //TODO
    }

    @Override
    public int pesquisarQuantidadeDeRoupaNoEstoque(String codigoRoupa) throws RoupaInexistenteException {
        return 0;
        //TODO
    }

    @Override
    public Roupa pesquisaRoupa(String codigoRoupa) throws RoupaInexistenteException {
        if(this.roupasMap.containsKey(codigoRoupa)){
            return this.roupasMap.get(codigoRoupa);
        }else{
            throw new RoupaInexistenteException("Não existe roupa com esse código!");
        }

    }
}
