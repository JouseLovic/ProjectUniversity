package org.myProject.Model;

public class Student extends Person{

    private int id;
    private int idGroup;
    private String career;

    public Student(String name, String cedula, String email, int id, int idGroup) {
        super(name, cedula, email);
        this.id = id;
        this.idGroup = idGroup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
}

