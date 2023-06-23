package com.system.products.productbackend.Repository;

import com.system.products.productbackend.Models.Rols;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rols,Integer> {
}
