package com.system.products.productbackend.Repository;

import com.system.products.productbackend.Models.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {
    public Users findByUsername(String username);
}
