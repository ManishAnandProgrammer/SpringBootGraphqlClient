package com.example;

public class Location {
    private String state;
    private String country;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Location{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
