package com.liskov.substitution.principle.model.frete;

import com.liskov.substitution.principle.model.pedido.Pedido;

public class FreteGrandePorte implements Frete {

    @Override
    public void aplicar(Pedido pedido) {
        pedido.setValorFinal(
                pedido.getValorBruto() + 200
        );
    }

}
