package io.notandrea.cucina.model;

public class TostapaneElettrico implements Forno {

    private String marca;
    private int temperaturaMax;
    private int wattaggio;

    public TostapaneElettrico(String marca, int temperaturaMax, int wattaggio) {
        this.marca = marca;
        this.temperaturaMax = temperaturaMax;
        this.wattaggio = wattaggio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTemperaturaMax() {
        return temperaturaMax;
    }

    public void setTemperaturaMax(int temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public int getWattaggio() {
        return wattaggio;
    }

    public void setWattaggio(int wattaggio) {
        this.wattaggio = wattaggio;
    }

    @Override
    public void scalda() {
        System.out.println("Cottura ultimata con il tostapane");
    }
}

