package org.myProject.Entities;

public class Student extends Person{

    private static int id;
    private static int idGroup;
    private static String career;

    public Student(String name, String cedula, String email, int id, int idGroup) {
        super(name, cedula, email);
        this.id = id;
        this.idGroup = idGroup;
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public static String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
}

