package com.luazevedo.emprestimos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_emprestimo")
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal valor;
    private BigDecimal taxaJuros;
    private Integer prazo;
    private Instant dataSolicitacao;
    private Instant dataAprovacao;
    private String status;

    @ManyToOne
    @JoinColumn (name = "cliente_id")
    private Cliente cliente;
}
