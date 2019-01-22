package com.example.SearchMicroService.Repository;

import com.example.SearchMicroService.Entity.ProductSearch;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.data.solr.repository.SolrRepository;

import java.util.List;

public interface SearchRepository extends SolrCrudRepository<ProductSearch,String> {
    ProductSearch findByProductName(String name);
    @Query("productName:*?0* or category:*?0* OR subCategories:*?0* OR brand:*?0*")
    List<ProductSearch> findInSearch(String searchParameter);
    @Query("subCategory.category.categoryName")
    List<String> getAllCategories();
//    List<ProductSearch> findBySubCategory(String subCategory);
//    List<ProductSearch> findByBrandName(String brand);
}
