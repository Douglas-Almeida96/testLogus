package model;



public class Modelo {

    private String nomeModelo;
    private double capacidadeTanque;
    private ConbustivelHasModelo[] conbustivelHasModelo;

    public Modelo() {
    }

    public Modelo(String nomeModelo, double capacidadeTanque) {
        this.nomeModelo = nomeModelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

     public void adicionaCombustiveldomodelo(ConbustivelHasModelo conbustivel) {
        int tamanho = conbustivel.size();
        this.conbustivelHasModelo = new ConbustivelHasModelo[2];
        for(int i = 0; i < tamanho; i++){
            conbustivelHasModelo[i] = conbustivel;
        }
    }
    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "nomeModelo='" + nomeModelo + '\'' +
                ", capacidadeTanque=" + capacidadeTanque +
                '}';
    }
}
