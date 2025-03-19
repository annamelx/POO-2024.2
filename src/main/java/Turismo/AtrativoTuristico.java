package Turismo;

import java.util.ArrayList;
import java.util.List;

public class AtrativoTuristico {
    private String nome;
    private String descricao;
    private TipoAtrativo tipo;
    private List<String> sitesParaMaisInfo;

    public AtrativoTuristico(String descricao, String nome, List<String> sitesParaMaisInfo, TipoAtrativo tipo) {
        this.descricao = descricao;
        this.nome = nome;
        this.sitesParaMaisInfo = sitesParaMaisInfo;
        this.tipo = tipo;
    }
    public AtrativoTuristico() {
        this(",",null,new ArrayList<>());
    }

    public <E> AtrativoTuristico(String nome, String descricao, ArrayList<E> sitesParaMaisInfo) {
    }
    public boolean ehDoTipo(TipoAtrativo tipo) {
        return this.tipo == tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getSitesParaMaisInfo() {
        return sitesParaMaisInfo;
    }

    public void setSitesParaMaisInfo(List<String> sitesParaMaisInfo) {
        this.sitesParaMaisInfo = sitesParaMaisInfo;
    }

    public TipoAtrativo getTipo() {
        return tipo;
    }

    public void setTipo(TipoAtrativo tipo) {
        this.tipo = tipo;
    }
//TODO
}

