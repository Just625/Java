package com.codegym.service;

import com.codegym.model.Comment;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

@Transactional
public class CommentService implements ICommentService {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Comment> findAll() {
        String queryStr = "SELECT c FROM Comment as c";
        TypedQuery<Comment> query = entityManager.createQuery(queryStr, Comment.class);
        return query.getResultList();
    }

    @Override
    public Comment findOne(Long id) {
        String queryStr = "SELECT c FROM Comment  as c WHERE c.id=:id";
        TypedQuery<Comment> query = entityManager.createQuery(queryStr, Comment.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public List<Comment> findInDay() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int dates = calendar.get(Calendar.DATE);
        String queryStr = "SELECT c FROM Comment as c where c.dates = ?1";
        TypedQuery<Comment> query = entityManager.createQuery(queryStr, Comment.class);
        query.setParameter(1, dates);
        return query.getResultList();
    }

    @Override
    public void save(Comment comment) {
        if (comment.getId() != null) {
            entityManager.merge(comment);
        } else {
            entityManager.persist(comment);
        }
    }
}
