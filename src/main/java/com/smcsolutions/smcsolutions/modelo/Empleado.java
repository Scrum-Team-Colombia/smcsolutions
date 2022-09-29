package com.smcsolutions.smcsolutions.modelo;

import javax.persistence.*;

@Entity
@Table(name = "Empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Long id;
    private String nombre;
    private String correo;
    private String empresa; 
    private String rol; 

    public Empleado(String nombre, String correo, String empresa, String rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
    }

    public Empleado (){    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getRol() {
        return rol;
    }
    
    public void setRol(String rol) {
        this.rol = rol;
    }
    public Long getId() {
        return null;
    }
}