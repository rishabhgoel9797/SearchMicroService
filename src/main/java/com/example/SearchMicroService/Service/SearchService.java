package com.example.SearchMicroService.Service;

import com.example.SearchMicroService.Entity.ProductSearch;

import java.util.List;

public interface SearchService {

    ProductSearch addProduct(ProductSearch productSearch);
    Iterable<ProductSearch> searchAllProducts();
    ProductSearch getName(String name);
}
