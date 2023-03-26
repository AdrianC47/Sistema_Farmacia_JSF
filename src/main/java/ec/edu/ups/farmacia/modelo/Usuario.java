/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.farmacia.modelo;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

/**
 *
 * @author Adrian
 */
@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String usuario;
    private String contrasenia;
    private String rol;
    @OneToOne(cascade = CascadeType.PERSIST) //usualmente va en relaciones de onetoOne
    @JoinColumn(name = "entidad_id", nullable = false, referencedColumnName = "id")
    private Entidad entidad;
    @Transient
    private boolean editable;

    public Usuario() {
    }

    public Usuario(int id, String usuario, String contrasenia, String rol, Entidad entidad) {
        this.id = id;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.rol = rol;
        this.entidad = entidad;
    }

    public Usuario(String usuario, String contrasenia, String rol, Entidad entidad, boolean editable) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.rol = rol;
        this.entidad = entidad;
        this.editable = editable;
    }

    public Usuario(String usuario, String contrasenia, String rol, Entidad entidad) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.rol = rol;
        this.entidad = entidad;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Entidad getEntidad() {
        return entidad;
    }

    public void setEntidad(Entidad entidad) {
        this.entidad = entidad;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", usuario=" + usuario + ", contrasenia=" + contrasenia + ", rol=" + rol + ", entidad=" + entidad + ", editable=" + editable + '}';
    }

}
