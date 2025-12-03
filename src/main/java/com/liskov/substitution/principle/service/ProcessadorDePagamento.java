package com.liskov.substitution.principle.service;

import com.liskov.substitution.principle.model.Fretavel;
import com.liskov.substitution.principle.model.Pedido;

public class ProcessadorDePagamento {

    public void processar(Fretavel fretavel, double freteBase) {
        fretavel.aplicarFrete(freteBase);

        if (fretavel.getValorFinal() < fretavel.getValorBruto()) {
            throw new IllegalStateException("Erro de contrato: O valor final não pode ser menor que o valor bruto após a aplicação do frete.");
        }

    }
}
