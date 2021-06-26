package com.codegym.service;

import com.codegym.model.Comment;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

@Service
public class CommentService implements ICommentService{
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Comment> findAll() {
        String queryStr = "SELECT c FROM Comment as c";
        TypedQuery<Comment> query = entityManager.createQuery(queryStr,Comment.class);
        return query.getResultList();
    }

    @Override
    public Comment findOne(Long id) {
        String queryStr = "SELECT c FROM Comment  as c WHERE c.id=:id";
        TypedQuery<Comment> query = entityManager.createQuery(queryStr, Comment.class);
        query.setParameter("id", id);
        Comment comment = null;
        try {
            comment = query.getSingleResult();
        } catch (Exception e) {

        }
        if (comment == null) {
            comment = new Comment();
        }
        return comment;
    }

    @Override
    public List<Comment> findInDay() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int dates = calendar.get(Calendar.DATE);
        String queryStr = "SELECT c FROM Comment as c where c.dates = ?1";
        TypedQuery<Comment> query = entityManager.createQuery(queryStr,Comment.class);
        query.setParameter(1,dates);
        return query.getResultList();
    }

    @Override
    public Comment save(Comment comment) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            Comment origin = findOne(comment.getId());
            origin.setRate(comment.getRate());
            origin.setAuthor(comment.getAuthor());
            origin.setFeedBack(comment.getFeedBack());
            session.saveOrUpdate(origin);
            transaction.commit();
            return origin;
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return null;
    }


}
