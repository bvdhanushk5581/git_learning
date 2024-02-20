package com.example.thymeleaf.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.thymeleaf.Modals.Login;

@Repository
public class LoginDAOImpl implements LoginDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Login findByUsername(String username) {
        try {
            return entityManager.createQuery("SELECT l FROM Login l WHERE l.username = :username", Login.class)
                    .setParameter("username", username)
                    .getSingleResult();
        } catch (Exception e) {
            return null; // Username not found
        }
    }
}
