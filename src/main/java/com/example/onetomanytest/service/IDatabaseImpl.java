package com.example.onetomanytest.service;

import com.example.onetomanytest.domain.Category;
import com.example.onetomanytest.domain.Product;
import com.example.onetomanytest.repository.CategoryRepository;
import com.example.onetomanytest.repository.ProductRepository;
import org.springframework.transaction.annotation.Transactional;

public class IDatabaseImpl implements IDatabase {
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;

    public IDatabaseImpl(CategoryRepository categoryRepository, ProductRepository productRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
    }

    @Override
    @Transactional
    public void createDatabase() {
        Category c1=new Category();
        c1.setName("Fruits");
        Category c2=new Category();
        c2.setName("Meats");
        Product p1=new Product("Apple",23,2000);
        Product p2=new Product("Orange",33,200000);
        Product p3=new Product("Chicken",3,40000);
        Product p4=new Product("Fish",5,50000);
        c1.addProduct(p1);
        c1.addProduct(p2);
        c2.addProduct(p3);
        c2.addProduct(p4);

       /* p1.setCategory(c1);
        p1.setCategory(c1);
        p2.setCategory(c2);
        p2.setCategory(c2);*/
        categoryRepository.save(c1);
        categoryRepository.save(c2);
       /* productRepository.save(p1);
        productRepository.save(p2);
        productRepository.save(p3);
        productRepository.save(p4);*/


    }
}
