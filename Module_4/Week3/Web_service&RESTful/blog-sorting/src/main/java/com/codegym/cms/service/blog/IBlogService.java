package com.codegym.cms.service.blog;

import com.codegym.cms.model.Blog;
import com.codegym.cms.model.Category;
import com.codegym.cms.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService extends IGeneralService<Blog> {
    Page<Blog> findAll(Pageable pageable);
    Page<Blog> findAllByDescriptionContaining(String description, Pageable pageable);
    Page<Blog> findAllByCategory(Category category,Pageable pageable);
    Iterable<Blog> findAllByCategory(Category category);
}
