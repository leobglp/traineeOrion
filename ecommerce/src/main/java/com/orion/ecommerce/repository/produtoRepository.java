package com.orion.ecommerce.repository;

import com.orion.ecommerce.model.produtoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface produtoRepository extends JpaRepository<produtoModel, Integer> {

}
