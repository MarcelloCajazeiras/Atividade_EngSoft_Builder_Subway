package org.example;

import java.util.List;

public class Pao {
    private String tipoDePao;
    private String recheio;
    private List<String> molho;
    private String detalheAdicional;

    public String getTipoDePao() {
        return tipoDePao;
    }

    public void setTipoDePao(String tipoDePao) {
        this.tipoDePao = tipoDePao;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public List<String> getMolho() {
        return molho;
    }

    public void setMolho(List<String> molho) {
        this.molho = molho;
    }

    public String getDetalheAdicional() {
        return detalheAdicional;
    }

    public void setDetalheAdicional(String detalheAdicional) {
        this.detalheAdicional = detalheAdicional;
    }

    @Override
    public String toString() {
        return "Pao{" +
                "tipoDePao='" + tipoDePao + '\'' +
                ", recheio='" + recheio + '\'' +
                ", molho=" + molho +
                ", detalheAdicional='" + detalheAdicional + '\'' +
                '}';
    }
}

