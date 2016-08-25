package com.pvt.hibernateApp.pojos;

import java.io.Serializable;

/**
 * Realization
 *
 * @author Nicolas Asinovich.
 */
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;

    private String city;
    private String state;
    private String country;

    public Address () {
    }

    public String getCity () {
        return city;
    }

    public void setCity (String city) {
        this.city = city;
    }

    public String getCountry () {
        return country;
    }

    public void setCountry (String country) {
        this.country = country;
    }

    public String getState () {
        return state;
    }

    public void setState (String state) {
        this.state = state;
    }
}
