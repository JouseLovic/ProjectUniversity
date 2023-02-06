package org.myProject.Model;

public class Admin extends Person{

    private String rol;

    public Admin(String name, String cedula, String email, String rol) {
        super(name, cedula, email);
        this.rol = rol;
    }


    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}

