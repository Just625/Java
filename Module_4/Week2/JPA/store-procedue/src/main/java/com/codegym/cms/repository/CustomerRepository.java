package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

@Transactional
public class CustomerRepository implements ICustomerRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean insertWithStoredProcedure(Customer customer) {
        String sql = "CALL Insert_Customer(?1, ?2)";
        Query query = entityManager.createNativeQuery(sql);
        query.setParameter(1,customer.getFirstName());
        query.setParameter(2,customer.getLastName());
        return query.executeUpdate()==0;
    }
}
