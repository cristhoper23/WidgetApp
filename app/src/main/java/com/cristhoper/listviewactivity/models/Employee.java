package com.cristhoper.listviewactivity.models;

/**
 * Created by Cris on 3/12/2017.
 */

public class Employee {
    private int id;
    private String nombre;
    private String cargo;
    private int imagen;

    public Employee(int i, String nombre, String cargo, int imagen) {
        this.id = i;
        this.nombre = nombre;
        this.cargo = cargo;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", imagen=" + imagen +
                '}';
    }
}
