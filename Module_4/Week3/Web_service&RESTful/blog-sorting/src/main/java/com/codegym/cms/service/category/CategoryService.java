package com.codegym.cms.service.category;


import com.codegym.cms.model.Category;
import com.codegym.cms.repository.category.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService implements ICategoryService{
    @Autowired
    private ICategoryRepository categoryRepository;
    @Override
    public Iterable<Category> findAll(){
        return categoryRepository.findAll();
    }
    @Override
    public Optional<Category> findById(Long id){
        return categoryRepository.findById(id);
    }
    @Override
    public void save(Category category){
        categoryRepository.save(category);
    }
    @Override
    public void remove(Long id){
        categoryRepository.deleteById(id);
    }

}
