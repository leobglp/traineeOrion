package com.orion.ecommerce.model;

import jakarta.persistence.*;

@Entity
@Table(name="produtos")
public class produtoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CODPROD")
    private Integer idCodProd;

    @Column(name = "NOMEPROD", length = 50)
    private String nomeProd;

    @Column(name = "VALOR")
    private Double valor;

    @Column(name = "QTDEPROD")
    private Integer qtdeProd;

    @ManyToOne
    @JoinColumn(name = "ID_PEDIDO", foreignKey = @ForeignKey(name = "ID_PEDIDO_FOREIGN_KEY"))
    private pedidoModel pedido;

    public Integer getIdCodProd() {
        return idCodProd;
    }

    public void setIdCodProd(Integer idCodProd) {
        this.idCodProd = idCodProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQtdeProd() {
        return qtdeProd;
    }

    public void setQtdeProd(Integer qtdeProd) {
        this.qtdeProd = qtdeProd;
    }

    public pedidoModel getPedido() {
        return pedido;
    }

    public void setPedido(pedidoModel pedido) {
        this.pedido = pedido;
    }
}

