package com.system.products.productbackend.Services;

import com.system.products.productbackend.Models.UserRol;
import com.system.products.productbackend.Models.Users;
import org.apache.catalina.User;

import java.util.Set;

public interface UserService {
    public Users saveUser(Users user, Set<UserRol>userRols) throws Exception;
    public Users getUser(String username);
    public void deleteUser(int id);
}
