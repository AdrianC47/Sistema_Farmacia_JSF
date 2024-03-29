/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.edu.ups.farmacia.recursos;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.io.Serializable;

/**
 *
 * @author edwin
 */
@Named
@RequestScoped
public class PasswordView implements Serializable {

    private String password1;
    private String password2;
    private String password3;
    private String password4;
    private String password5;
    private String password6 = "OpenSesame";

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getPassword3() {
        return password3;
    }

    public void setPassword3(String password3) {
        this.password3 = password3;
    }

    public String getPassword4() {
        return password4;
    }

    public void setPassword4(String password4) {
        this.password4 = password4;
    }

    public String getPassword5() {
        return password5;
    }

    public void setPassword5(String password5) {
        this.password5 = password5;
    }

    public String getPassword6() {
        return password6;
    }

    public void setPassword6(String password6) {
        this.password6 = password6;
    }
}
