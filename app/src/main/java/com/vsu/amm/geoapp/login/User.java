package com.vsu.amm.geoapp.login;

/**
 * Created by antiz_000 on 12/23/2017.
 */

public class User {

    private String email;
    private String password;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassWord(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public User(User user) {
        this.email = user.getEmail();
        this.password = user.getPassword();
    }

    public User() {

    }


}