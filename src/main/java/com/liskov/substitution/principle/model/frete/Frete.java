package com.liskov.substitution.principle.model.frete;

import com.liskov.substitution.principle.model.pedido.Pedido;

public interface Frete {

    void aplicar(Pedido pedido);

}
