package com.liskov.substitution.principle.model.frete;

import com.liskov.substitution.principle.model.pedido.Pedido;

public class FreteGratis implements Frete {

    @Override
    public void aplicar(Pedido pedido) {
        pedido.setValorFinal(
                pedido.getValorBruto()
        );
    }

}
