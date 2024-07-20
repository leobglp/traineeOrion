package com.orion.ecommerce.repository;

import com.orion.ecommerce.model.userModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<userModel, Integer> {

}
