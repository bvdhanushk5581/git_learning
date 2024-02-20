package com.example.thymeleaf.DAO;

import java.util.List;

import com.example.thymeleaf.Modals.Service;

public interface ServiceDAO {
    
    List<Service> findAll();
    
    Service findById(int id);
    
    Service save(Service service);
    
    Service deleteById(int id);
}
