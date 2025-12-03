package com.liskov.substitution.principle.model.pedido;

import com.liskov.substitution.principle.model.frete.Frete;

public class Pedido {

    protected double valorBruto;
    protected double valorFinal;
    protected TipoPedido tipoPedido;

    public Pedido(double valorBruto) {
        this.valorBruto = valorBruto;
        this.valorFinal = valorBruto;
    }

    public void aplicarFrete(){
        Frete frete = getTipoPedido().getFrete();
        this.valorFinal = frete.aplicar(this.valorBruto);
    }


    public double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        if (valorFinal < 0) {
            throw new IllegalArgumentException("Valor final não pode ser negativo");
        }
        this.valorFinal = valorFinal;
    }

    public TipoPedido getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(TipoPedido tipoPedido) {
        this.tipoPedido = tipoPedido;
    }
}
