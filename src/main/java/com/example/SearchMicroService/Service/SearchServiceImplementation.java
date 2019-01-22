package com.example.SearchMicroService.Service;

import com.example.SearchMicroService.Entity.ProductSearch;
import com.example.SearchMicroService.Repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SearchServiceImplementation implements SearchService{

    @Autowired
    SearchRepository searchRepository;

    @Override
    public ProductSearch addProduct(ProductSearch productSearch) {
        return searchRepository.save(productSearch);
    }

    @Override
    public Iterable<ProductSearch> searchAllProducts() {
        return searchRepository.findAll();
    }

    @Override
    public ProductSearch getName(String name) {
        return searchRepository.findByProductName(name);
    }

    @Override
    public List<ProductSearch> findInSearch(String searchParameter) {
        return searchRepository.findInSearch(searchParameter);
    }

}
