package com.groupeisi.ELKSpringBoot.repository;

import com.groupeisi.ELKSpringBoot.entities.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepo extends ElasticsearchRepository<Product,Integer> {
}
