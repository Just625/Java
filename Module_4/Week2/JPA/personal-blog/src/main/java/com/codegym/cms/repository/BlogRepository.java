package com.codegym.cms.repository;

import com.codegym.cms.model.Blog;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class BlogRepository implements IBlogRepository{
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Blog> findAll() {
        String sql = "SELECT c FROM Blog as c";
        TypedQuery<Blog> query = entityManager.createQuery(sql,Blog.class);
        return query.getResultList();
    }

    @Override
    public Blog findById(Long id) {
        String sql = "SELECT c FROM Blog as c  WHERE c.Id = ?1";
        TypedQuery<Blog> query = entityManager.createQuery(sql,Blog.class);
        query.setParameter(1,id);
        try{
            return query.getSingleResult();
        }catch(NoResultException e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void save(Blog blog) {
        Long id = blog.getId();
        if(id!=null){
            entityManager.merge(blog);
        }else{
            entityManager.persist(blog);
        }
    }

    @Override
    public void remove(Long id) {
        Blog blog = findById(id);
        if(blog!=null){
            entityManager.remove(blog);
        }
    }
}
