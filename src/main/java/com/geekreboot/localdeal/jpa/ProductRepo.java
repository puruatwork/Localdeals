package com.geekreboot.localdeal.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geekreboot.localdeal.entity.Products;

@Repository
public interface ProductRepo extends JpaRepository<Products, Long> {

}
