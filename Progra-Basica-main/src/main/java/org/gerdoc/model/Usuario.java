package org.gerdoc.model;

public class Usuario {
    private Integer id;
    private String nombre;
    private String pApellido;
    private String sApellido;
    private String pasword;

    public Usuario()
    {
    }

    public Usuario(Integer id, String nombre, String pApellido, String sApellido, String pasword) {
        this.id = id;
        this.nombre = nombre;
        this.pApellido = pApellido;
        this.sApellido = sApellido;
        this.pasword = pasword;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getpApellido() {
        return pApellido;
    }

    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
}
