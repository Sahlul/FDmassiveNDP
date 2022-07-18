package com.example.fdmassivendp;


import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {
    private String name;
    private String email;
    private String notelp;

    public User() {

    }

    public User(String name, String email, String notelp) {
        this.name = name;
        this.email = email;
        this.notelp = notelp;
    }


    public String getname() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getNotelp() {
        return notelp;
    }


}
