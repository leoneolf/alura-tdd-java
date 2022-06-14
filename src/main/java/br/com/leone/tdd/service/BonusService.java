package br.com.leone.tdd.service;

import br.com.leone.tdd.modelo.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BonusService {

    public BigDecimal calcularBonus(Funcionario funcionario) {
        BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
        if (valor.compareTo(new BigDecimal("1000")) > 0) {
            throw new IllegalArgumentException("Funcionário com salário maior do que R$10.000,00 não pode recerber bônus!");
        }
        return valor.setScale(2, RoundingMode.HALF_UP);
    }

}
