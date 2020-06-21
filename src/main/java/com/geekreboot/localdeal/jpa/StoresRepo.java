package com.geekreboot.localdeal.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geekreboot.localdeal.entity.Stores;

public interface StoresRepo extends JpaRepository<Stores, Long> {

	Stores findById(Integer storeId);

}
