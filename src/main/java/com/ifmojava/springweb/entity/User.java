package com.ifmojava.springweb.entity;

import javax.validation.constraints.*;

public class User {
//    @Min(3)
//    @Max(34)
    @Size(min = 3, max = 34, message = "От 3 до 34 символов")
    private String login;

    @Pattern(regexp = "", message = "Ошибка при вводе пароля")
    private String pwd;

    @Email(message = "Ошибка при вводе email")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
