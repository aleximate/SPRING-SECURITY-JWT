package com.system.products.productbackend.Controllers;

import com.system.products.productbackend.Models.Rols;
import com.system.products.productbackend.Models.UserRol;
import com.system.products.productbackend.Models.Users;
import com.system.products.productbackend.Services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public Users saveUser(@RequestBody Users users) throws Exception{
        Set<UserRol> userRols= new HashSet<>();
        Rols rols= new Rols();
        rols.setRolid(2);
        rols.setName("NORMAL");

        UserRol userRol=new UserRol();
        userRol.setUser(users);
        userRol.setRols(rols);

        return userService.saveUser(users,userRols);
    }

    @GetMapping("/{username}")
    public Users getUser(@PathVariable("username")String username){
        return userService.getUser(username);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") int id){
        userService.deleteUser(id);
    }
}
