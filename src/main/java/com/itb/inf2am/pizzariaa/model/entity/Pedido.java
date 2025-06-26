package com.itb.inf2am.pizzariaa.model.entity;

import java.time.LocalDateTime;

public class Pedido {

    private Long id;
    private double valorPedido;
    private LocalDateTime dataHoraPedido;
    private LocalDateTime dataHoraEntrega;
    private String status;
    private boolean codStatus;


    public Long getId() {
        return id;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public LocalDateTime getDataHoraPedido() {
        return dataHoraPedido;
    }

    public LocalDateTime getDataHoraEntrega() {
        return dataHoraEntrega;
    }

    public String getStatus() {
        return status;
    }

    public boolean isCodStatus() {
        return codStatus;
    }
}