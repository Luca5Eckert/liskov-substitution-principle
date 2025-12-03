package com.liskov.substitution.principle.model;

public interface Fretavel {

    void aplicarFrete(double valorFrete);

    double getValorFinal();

    double getValorBruto();

}
