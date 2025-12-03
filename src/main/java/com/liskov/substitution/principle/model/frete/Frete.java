package com.liskov.substitution.principle.model.frete;

import com.liskov.substitution.principle.model.pedido.Pedido;

public interface Frete {

    double aplicar(double valorBruto);

}
