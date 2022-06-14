package br.com.leone.tdd.service;

import br.com.leone.tdd.modelo.Desempenho;
import br.com.leone.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        BigDecimal percentual = desempenho.percentualReajuste();
        BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
        funcionario.reajustarSalario(reajuste);
    }
}

/**
 * if (desempenho == Desempenho.A_DESEJAR) {
 *             BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
 *             funcionario.reajustarSalario(reajuste);
 *         } else if (desempenho == Desempenho.BOM) {
 *             BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.15"));
 *             funcionario.reajustarSalario(reajuste);
 *         } else {
 *             BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.20"));
 *             funcionario.reajustarSalario(reajuste);
 *         }
 */