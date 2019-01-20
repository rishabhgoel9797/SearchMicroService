package com.example.SearchMicroService.Repository;

import com.example.SearchMicroService.Entity.ProductSearch;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.data.solr.repository.SolrRepository;

public interface SearchRepository extends SolrCrudRepository<ProductSearch,String> {
    ProductSearch findByProductName(String name);
}
