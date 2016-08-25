package com.pvt.hibernateApp.pojos;

import java.io.Serializable;

/**
 * Realization
 *
 * @author Nicolas Asinovich.
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String surname;
    private Integer age;
    private String cellphone;
    private String email;

    public Person () {
    }

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public void setAge (Integer age) {
        this.age = age;
    }

    public Integer getAge () {
        return age;
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

    public String getCellphone () {
        return cellphone;
    }

    public void setCellphone (String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (id != null ? !id.equals(person.id) : person.id != null) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (surname != null ? !surname.equals(person.surname) : person.surname != null) return false;
        if (age != null ? !age.equals(person.age) : person.age != null) return false;
        if (cellphone != null ? !cellphone.equals(person.cellphone) : person.cellphone != null) return false;
        return email != null ? email.equals(person.email) : person.email == null;

    }

    @Override
    public int hashCode () {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (cellphone != null ? cellphone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
