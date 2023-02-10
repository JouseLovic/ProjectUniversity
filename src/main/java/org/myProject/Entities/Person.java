package org.myProject.Entities;

public abstract class Person {

    protected String name;
    protected String cedula;
    protected String email;

    public Person(String name, String cedula, String email) {
        this.name = name;
        this.cedula = cedula;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;

        if (!cedula.equals(person.cedula)) return false;
        return email.equals(person.email);
    }

    @Override
    public int hashCode() {
        int result = cedula.hashCode();
        result = 31 * result + email.hashCode();
        return result;
    }
}

