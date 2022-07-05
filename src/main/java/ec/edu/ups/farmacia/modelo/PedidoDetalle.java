/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.farmacia.modelo;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author pcuser
 */
@Entity
@Table(name = "pedido_detalle")
public class PedidoDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private ProductoSucursal productoSucursal;
    private int cantidad;
    private double precio;
    private double subtotal;
    @ManyToOne 
    @JoinColumn
    private Pedido pedido;

    public PedidoDetalle() {
    }

    public PedidoDetalle(int id, ProductoSucursal productoSucursal, int cantidad, double precio, double subtotal, Pedido pedido) {
        this.id = id;
        this.productoSucursal = productoSucursal;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
        this.pedido = pedido;
    }

    public ProductoSucursal getProductoSucursal() {
        return productoSucursal;
    }

    public void setProductoSucursal(ProductoSucursal productoSucursal) {
        this.productoSucursal = productoSucursal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidoDetalle)) {
            return false;
        }
        PedidoDetalle other = (PedidoDetalle) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.farmacia.modelo.PedidoDetalle[ id=" + id + " ]";
    }
    
}
