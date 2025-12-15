package oi.github.venturim1.arquiteturaspring.montadora;

public class Motor {
    private String modelo;
    private Double cavlos;
    private Integer cilindro;
    private Double litragem;
    private TiposDeMotor tipo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getCavlos() {
        return cavlos;
    }

    public void setCavlos(Double cavlos) {
        this.cavlos = cavlos;
    }

    public Integer getCilindro() {
        return cilindro;
    }

    public void setCilindro(Integer cilindro) {
        this.cilindro = cilindro;
    }

    public Double getLitragem() {
        return litragem;
    }

    public void setLitragem(Double litragem) {
        this.litragem = litragem;
    }

    public TiposDeMotor getTipo() {
        return tipo;
    }

    public void setTipo(TiposDeMotor tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "modelo='" + modelo + '\'' +
                ", cavlos=" + cavlos +
                ", cilindro=" + cilindro +
                ", litragem=" + litragem +
                ", tipo=" + tipo +
                '}';
    }
}
