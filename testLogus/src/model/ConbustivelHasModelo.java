package model;


import java.util.ArrayList;

public class ConbustivelHasModelo extends ArrayList<ConbustivelHasModelo> {

    private String nomeModelo;
    private TipoConbustivel tipoConbustiveis;
    private double consumo;

    public ConbustivelHasModelo(Modelo modelo, TipoConbustivel tipoConbustiveis, double consumo) {
        this.nomeModelo = modelo.getNomeModelo();
        this.tipoConbustiveis = tipoConbustiveis;
        this.consumo = consumo;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public TipoConbustivel getTipoConbustiveis() {
        return tipoConbustiveis;
    }

    public void setTipoConbustiveis(TipoConbustivel tipoConbustiveis) {
        this.tipoConbustiveis = tipoConbustiveis;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
}
