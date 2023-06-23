package com.system.products.productbackend.Services.Impl;

import com.system.products.productbackend.Models.UserRol;
import com.system.products.productbackend.Models.Users;
import com.system.products.productbackend.Repository.RolRepository;
import com.system.products.productbackend.Repository.UserRepository;
import com.system.products.productbackend.Services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RolRepository rolRepository;

    @Override
    public Users saveUser(Users user, Set<UserRol> userRols) throws Exception {
        Users user1=userRepository.findByUsername(user.getUsername());
        if(user1 != null){
            System.out.println("El usuario ya existe");
            throw new Exception("El usuario ya esta registrado");
        }
        else {
            for (UserRol userRol:userRols){
                rolRepository.save(userRol.getRols());
            }
            user.getUserRols().addAll(userRols);
            user1 = userRepository.save(user);
        }
        return user1;
    }

    @Override
    public Users getUser(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
