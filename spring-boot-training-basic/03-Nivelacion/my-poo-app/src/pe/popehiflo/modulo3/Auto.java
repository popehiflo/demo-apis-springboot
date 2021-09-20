package pe.popehiflo.modulo3;

import java.util.Objects;

public class Auto {

    private String marca;
    private String modelo;
    private int anio;
    private int km;
    private String dominio;

    public Auto() {
    }

    public Auto(String marca, String modelo, int anio, int km, String dominio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.km = km;
        this.dominio = dominio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return anio == auto.anio && km == auto.km && marca.equals(auto.marca) && modelo.equals(auto.modelo) && dominio.equals(auto.dominio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, anio, km, dominio);
    }
}
