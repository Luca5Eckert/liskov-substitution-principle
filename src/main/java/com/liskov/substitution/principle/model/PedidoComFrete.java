package com.liskov.substitution.principle.model;

public class PedidoComFrete extends Pedido implements Fretavel{
    protected double valorBruto;
    protected double valorFinal;
    protected double valorFrete = 0.0;

    public PedidoComFrete(double valorBruto) {
        super(valorBruto);
    }

    @Override
    public void aplicarFrete(double valorFrete) {
        if (valorFrete < 0) {
            throw new IllegalArgumentException("Frete não pode ser negativo.");
        }
        this.valorFrete = valorFrete;
        this.valorFinal = this.valorBruto + this.valorFrete;
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
        this.valorFinal = valorFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

}
