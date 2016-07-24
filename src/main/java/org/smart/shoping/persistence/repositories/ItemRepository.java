/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.smart.shoping.persistence.repositories;

import org.smart.shoping.core.domain.Business;
import org.smart.shoping.core.domain.Item;
import org.smart.shoping.core.domain.ItemCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rkarim
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{
    Page<Item> findByItemCategory(ItemCategory itemCategory, Pageable pageRequest);
    Page<Item> findByBusiness(Business business, Pageable pageRequest);
}
