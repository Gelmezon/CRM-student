package com.tocean.crm.dao;

import com.tocean.crm.entity.Student;
import com.tocean.crm.entity.Viloation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ViloationDao extends JpaRepository<Viloation, String> {
    public List<Viloation> findByStudent_id(String student_id);
    public List<Viloation> findByConfirmer(String confirmer);
}
