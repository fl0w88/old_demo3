package com.example.project.server.model;

import java.math.BigDecimal;

public class CalculationRequest {

    private BigDecimal a;
    private BigDecimal b;
    private String o;

    public BigDecimal getA() {
        return a;
    }

    public void setA(BigDecimal a) {
        this.a = a;
    }

    public BigDecimal getB() {
        return b;
    }

    public void setB(BigDecimal b) {
        this.b = b;
    }

    public String getO() {
        return o;
    }

    public void setO(String o) {
        this.o = o;
    }
}
