package com.example.SearchMicroService.dto;

import com.example.SearchMicroService.Entity.BrandSearch;
import com.example.SearchMicroService.Entity.SubCategorySearch;
import org.apache.solr.client.solrj.beans.Field;

import java.util.List;

public class ProductsSearchDTO {
    private String productId;
    private String productName;
    private String description;
    private String usp;
    private String productImage;
//    public List<SubCategorySearch> subCategorySearches;
    public BrandSearch brandSearch;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUsp() {
        return usp;
    }

    public void setUsp(String usp) {
        this.usp = usp;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

//
//    public List<SubCategorySearch> getSubCategorySearches() {
//        return subCategorySearches;
//    }
//
//    public void setSubCategorySearches(List<SubCategorySearch> subCategorySearches) {
//        this.subCategorySearches = subCategorySearches;
//    }
//
    public BrandSearch getBrandSearch() {
        return brandSearch;
    }

    public void setBrandSearch(BrandSearch brandSearch) {
        this.brandSearch = brandSearch;
    }
}
