package com.orion.ecommerce.model;

import jakarta.persistence.*;

@Entity
@Table(name="pedidos")
public class pedidoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PEDIDO")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO", foreignKey = @ForeignKey(name = "ID_USUARIO_FOREIGN_KEY"))
    private userModel user;

    @Column(name = "TOTPEDIDO")
    private Double totPedido;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public userModel getUser() {
        return user;
    }

    public void setUser(userModel user) {
        this.user = user;
    }

    public Double getTotPedido() {
        return totPedido;
    }

    public void setTotPedido(Double totPedido) {
        this.totPedido = totPedido;
    }
}
