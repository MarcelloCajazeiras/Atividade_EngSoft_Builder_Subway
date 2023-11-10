package org.example;

import java.util.List;

public class PaoBuilder implements Builder<PaoBuilder, Pao> {

    private final String tipoDePao;
    private String recheio;
    private List<String> molho;
    private String detalheAdicional;

    // obrigatório
    public PaoBuilder(String tipo) {
        this.tipoDePao = tipo;
    }

    @Override
    public PaoBuilder recheio(String r) {
        this.recheio = r;
        return this;
    }

    @Override
    public PaoBuilder molho(List<String> m) {
        this.molho = m;
        return this;
    }

    @Override
    public PaoBuilder detalheAdicional(String d) {
        this.detalheAdicional = d;
        return this;
    }

    @Override
    public Pao criarPao() {
        Pao pao = new Pao();
        pao.setTipoDePao(this.tipoDePao);
        pao.setRecheio(this.recheio);

        pao.setMolho(this.molho);

        pao.setDetalheAdicional(this.detalheAdicional);
        return pao;
    }

    @Override
    public PaoBuilder filling(String r) {
        return null;
    }

    @Override
    public PaoBuilder sauce(List<String> m) {
        return null;
    }

    @Override
    public PaoBuilder more(String m) {
        return null;
    }

    @Override
    public Pao createdBread() {
        return null;
    }
}

