package Turismo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaAtrativosMap implements SistemaAtrativos {
    private Map<String,AtrativoTuristico> atrativos;

    public SistemaAtrativosMap() {
        this.atrativos = new HashMap<String,AtrativoTuristico>();
    }
    @Override
    public void cadastraAtrativo(AtrativoTuristico atrativo) throws AtrativoJaExisteException {
        if (this.atrativos.containsKey(atrativo.getNome())) {
            throw new AtrativoJaExisteException("Já existe atrativo com este nome");
        } else {
            this.atrativos.put(atrativo.getNome(), atrativo);
        }
    }

    @Override
    public AtrativoTuristico pesquisaAtrativo(String nome) throws AtrativoNaoExisteException {
        if (this.atrativos.containsKey(nome)) {
            return this.atrativos.get(nome);
        }else {
            throw new AtrativoNaoExisteException("Nao existe atrativo com este nome.");
        }
    }

    @Override
    public List<AtrativoTuristico> pesquisaAtrativosDoTipo(TipoAtrativo tipo) {
        List<AtrativoTuristico> listaAtrativos = new ArrayList<AtrativoTuristico>();
        for(AtrativoTuristico at: this.atrativos.values()) {
            if(at.getTipo().equals(tipo)){
                listaAtrativos.add(at);
            }
        }
        return listaAtrativos;
    }

    @Override
    public List<String> pesquisaSitesComMaisInformacoesSobreAtrativo(String nomeAtrativo) throws AtrativoNaoExisteException {
        if(this.atrativos.containsKey(nomeAtrativo)){
            return this.atrativos.get(nomeAtrativo).getSitesParaMaisInfo();
        }else {
            throw new AtrativoNaoExisteException("Não existe atrativo: " + nomeAtrativo);

        }
    }

    @Override
    public int contaAtrativosDoTipo(TipoAtrativo tipo) {
        int quantTipoAtrativos = 0;
        for(AtrativoTuristico at: this.atrativos.values()) {
            if(at.getTipo().equals(tipo){
                quantTipoAtrativos++;
            }
        }
        return quantTipoAtrativos;
    }

    @Override
    public boolean existeAtrativo(String nome) {
        return this.atrativos.containsKey(nome);
    }

}


