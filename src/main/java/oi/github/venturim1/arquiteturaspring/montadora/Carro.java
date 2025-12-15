package oi.github.venturim1.arquiteturaspring.montadora;

import oi.github.venturim1.arquiteturaspring.montadora.configuration.CarStatus;

import java.awt.*;

public class Carro {
    private String modelo;
    private Color cor;
    private Motor motor;
    private Montadora montadora;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public CarStatus darIgnicao(Chave chave) {
        if(getMontadora() != chave.getMontadora()){
            return new CarStatus("Não é possível ligar com essa chave!");
        } else {
            return new CarStatus("Carro ligado com sucesso! Com o motor: " + motor.toString());
        }

    }
}
