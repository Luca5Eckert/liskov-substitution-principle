package com.liskov.substitution.principle.service;

import com.liskov.substitution.principle.model.pedido.Pedido;
import com.liskov.substitution.principle.model.frete.Frete;

public class ProcessadorDePagamento {

    public void processar(Pedido pedido) {
        Frete frete = pedido.getTipoPedido().getFrete();
        frete.aplicar(pedido);
    }

}
