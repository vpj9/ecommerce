package com.jsp.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.ecommerce.entity.Merchant;



public interface MerchantRepository extends JpaRepository<Merchant, Long> {

}
