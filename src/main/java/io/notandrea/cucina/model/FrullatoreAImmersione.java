package io.notandrea.cucina.model;

public class FrullatoreAImmersione implements Frullatore {
    private String marca;
    private int wattaggio;

    public FrullatoreAImmersione(String marca, int wattaggio) {
        this.marca = marca;
        this.wattaggio = wattaggio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getWattaggio() {
        return wattaggio;
    }

    public void setWattaggio(int wattaggio) {
        this.wattaggio = wattaggio;
    }

    @Override
    public void tritura() {
        System.out.println("ho finito di triturare!");
    }
}
