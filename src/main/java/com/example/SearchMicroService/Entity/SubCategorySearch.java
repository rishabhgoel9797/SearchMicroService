package com.example.SearchMicroService.Entity;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;

public class SubCategorySearch {

    @Id
    private String subcategoryId;
    private String subcategoryName;

    @Field(child = true)
    public CategorySearch categorySearch;

    public String getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(String subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public String getSubcategoryName() {
        return subcategoryName;
    }

    public void setSubcategoryName(String subcategoryName) {
        this.subcategoryName = subcategoryName;
    }

    public CategorySearch getCategorySearch() {
        return categorySearch;
    }

    public void setCategorySearch(CategorySearch categorySearch) {
        this.categorySearch = categorySearch;
    }
}
