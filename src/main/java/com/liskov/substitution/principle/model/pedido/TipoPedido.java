package com.liskov.substitution.principle.model.pedido;

import com.liskov.substitution.principle.model.frete.Frete;
import com.liskov.substitution.principle.model.frete.FreteGrandePorte;
import com.liskov.substitution.principle.model.frete.FreteGratis;
import com.liskov.substitution.principle.model.frete.FretePadrao;

public enum TipoPedido {
    LEVE(new FreteGratis()),
    MEDIO(new FretePadrao()),
    GRANDE(new FreteGrandePorte());

    private final Frete frete;

    TipoPedido(Frete frete){
        this.frete = frete;
    }

    public Frete getFrete() {
        return frete;
    }

}
