package br.edu.ifal.gestormotel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Quarto{

    @Id
    private int numero;
    private double valor;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    

}