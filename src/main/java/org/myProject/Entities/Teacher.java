package org.myProject.Entities;

public class Teacher extends Person{

    private int id;
    private String subject;

    public Teacher(String name, String cedula, String email, int id, String subject) {
        super(name, cedula, email);
        this.id = id;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }
}

