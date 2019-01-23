package com.example.SearchMicroService.Controller;

import com.example.SearchMicroService.Entity.ProductSearch;
import com.example.SearchMicroService.Service.SearchService;
import com.example.SearchMicroService.dto.ProductsSearchDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class SearchController {

    @Autowired
    SearchService searchService;

    @RequestMapping(value = "addProductsToSearch",method = RequestMethod.POST)
    public ResponseEntity<String> addProductsToSolr(@RequestBody ProductsSearchDTO productsSearchDTO)
    {
        ProductSearch productSearch=new ProductSearch();
        BeanUtils.copyProperties(productsSearchDTO,productSearch);

        ProductSearch productSearchCreated=searchService.addProduct(productSearch);
        return new ResponseEntity<String>(productSearchCreated.getProductName(),HttpStatus.CREATED);
    }

    @RequestMapping(value = "findAllProductsFromSearch",method = RequestMethod.GET)
    public Iterable<ProductSearch> getAllProductsFromSearch( )
    {
        return searchService.searchAllProducts();
    }

    @RequestMapping(value = "getName/{name}",method = RequestMethod.GET)
    public ProductSearch getName(@PathVariable String name)
    {
        ProductSearch test=searchService.getName(name);
        return test;
    }

    @RequestMapping(value = "getInSearch/{searchParameter}",method = RequestMethod.GET)
    public List<ProductSearch> getByCategory(@PathVariable String searchParameter)
    {
        return searchService.findInSearch(searchParameter);
    }


}
