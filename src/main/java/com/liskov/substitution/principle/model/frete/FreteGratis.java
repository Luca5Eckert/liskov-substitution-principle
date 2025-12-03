package com.liskov.substitution.principle.model.frete;

import com.liskov.substitution.principle.model.pedido.Pedido;

public class FreteGratis implements Frete {

    @Override
    public double aplicar(double valorBruto) {
        return valorBruto;
    }

}
