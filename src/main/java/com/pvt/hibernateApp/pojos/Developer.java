package com.pvt.hibernateApp.pojos;

import java.io.Serializable;

/**
 * Realization
 *
 * @author Nicolas Asinovich.
 */
public class Developer implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String surname;
    private int age;

    public Developer () {
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getSurname () {
        return surname;
    }

    public void setSurname (String surname) {
        this.surname = surname;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Developer developer = (Developer) o;

        if (id != developer.id) return false;
        if (age != developer.age) return false;
        if (name != null ? !name.equals(developer.name) : developer.name != null) return false;
        return surname != null ? surname.equals(developer.surname) : developer.surname == null;
    }

    @Override
    public int hashCode () {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }
}
