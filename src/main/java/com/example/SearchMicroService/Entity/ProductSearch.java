package com.example.SearchMicroService.Entity;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.io.Serializable;
import java.util.List;

@SolrDocument(solrCoreName = "Products")
public class ProductSearch {
    @Id
    @Field
    private String productId;
    @Field
    private String productName;
    @Field
    private String description;
    @Field
    private String usp;

    @Field
    private String productImage;

//    @Field(child = true)
//    public List<SubCategorySearch> subCategorySearches;
//

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

    @Field(child = true)
    public void setBrandSearch(BrandSearch brandSearch) {
        this.brandSearch = brandSearch;
    }
}
