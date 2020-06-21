package com.geekreboot.localdeal.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geekreboot.localdeal.entity.StoreProducts;
import com.geekreboot.localdeal.entity.Stores;

@Repository
public interface StoresProductsRepo extends JpaRepository<StoreProducts, Long> {
	List<StoreProducts> findStoreProductsByProductId(Integer productId);

}
