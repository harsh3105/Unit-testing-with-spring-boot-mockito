package com.unittesting.learn.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unittesting.learn.model.Item;

public interface ItemRepository extends JpaRepository<Item,Integer> {
	
	

}
