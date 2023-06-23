package com.system.products.productbackend.Models;

import jakarta.persistence.*;

@Entity
public class UserRol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserRol;
    @ManyToOne(fetch = FetchType.EAGER)
    private Users user;
    @ManyToOne
    private Rols rols;

    public UserRol() {
    }

    public int getUserRol() {
        return UserRol;
    }

    public void setUserRol(int userRol) {
        UserRol = userRol;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Rols getRols() {
        return rols;
    }

    public void setRols(Rols rols) {
        this.rols = rols;
    }
}
