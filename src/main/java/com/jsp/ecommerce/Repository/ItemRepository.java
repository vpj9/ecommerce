package com.jsp.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.ecommerce.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
