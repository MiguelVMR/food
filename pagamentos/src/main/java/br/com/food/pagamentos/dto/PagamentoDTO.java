package br.com.food.pagamentos.dto;

import java.math.BigDecimal;

import br.com.food.pagamentos.model.Status;
import lombok.Data;

@Data
public class PagamentoDTO {
    private Long id;
    private BigDecimal valor;
    private String nome;
    private String numero;
    private String expiracao;
    private String codigo;
    private Status status;
    private Long formaDePagamentoId;
    private Long pedidoId;
}
